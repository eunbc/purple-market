package com.ebcho.purplemarket.service;

import com.ebcho.purplemarket.domain.goods.Goods;
import com.ebcho.purplemarket.domain.goods.GoodsRepository;
import com.ebcho.purplemarket.web.dto.GoodsListResponseDto;
import com.ebcho.purplemarket.web.dto.GoodsResponseDto;
import com.ebcho.purplemarket.web.dto.GoodsSaveRequestDto;
import com.ebcho.purplemarket.web.dto.GoodsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GoodsService {
    private final GoodsRepository goodsRepository;

    public List<GoodsListResponseDto> findAll() {
        return goodsRepository.findAll()
                .stream()
                .map(GoodsListResponseDto::new)
                .collect(Collectors.toList());
    }

    public GoodsResponseDto findById(Long id) {
        Goods entity = goodsRepository.findById(id).orElseThrow();
        return new GoodsResponseDto(entity);
    }

    public Long save(GoodsSaveRequestDto requestDto) {
        return goodsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, GoodsUpdateRequestDto requestDto) {
        Goods entity = goodsRepository.findById(id).orElseThrow();
        entity.update(requestDto);
        return entity.getId();
    }

    @Transactional
    public Long delete(Long id) {
        Goods entity = goodsRepository.findById(id).orElseThrow();
        entity.delete();
        return entity.getId();
    }
}
