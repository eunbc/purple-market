package com.ebcho.purplemarket.web.dto;

import com.ebcho.purplemarket.domain.goods.Goods;
import lombok.Getter;

@Getter
public class GoodsSaveRequestDto {
    private String name;
    private String catogory;

    public Goods toEntity() {
        return Goods.builder().build();
    }

}
