package com.ebcho.purplemarket.web;

import com.ebcho.purplemarket.service.GoodsService;
import com.ebcho.purplemarket.web.dto.GoodsListResponseDto;
import com.ebcho.purplemarket.web.dto.GoodsResponseDto;
import com.ebcho.purplemarket.web.dto.GoodsSaveRequestDto;
import com.ebcho.purplemarket.web.dto.GoodsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/goods")
public class GoodsController {

    private final GoodsService goodsService;

    @GetMapping
    public List<GoodsListResponseDto> findAll() {
        return goodsService.findAll();
    }

    @GetMapping("/{id}")
    public GoodsResponseDto findById(@PathVariable Long id) {
        return goodsService.findById(id);
    }

    @PostMapping
    public Long save(@RequestBody GoodsSaveRequestDto requestDto) {
        return goodsService.save(requestDto);
    }

    @PutMapping("/{id}")
    public Long update(@PathVariable Long id, @RequestBody GoodsUpdateRequestDto requestDto) {
        return goodsService.update(id,requestDto);
    }

    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id) {
        return goodsService.delete(id);
    }

}
