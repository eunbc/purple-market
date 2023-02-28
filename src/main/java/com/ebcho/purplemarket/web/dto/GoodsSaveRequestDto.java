package com.ebcho.purplemarket.web.dto;

import com.ebcho.purplemarket.domain.goods.Goods;
import lombok.Getter;

@Getter
public class GoodsSaveRequestDto {
    private String name;
    private String catogory;
    private Long price;
    private Integer discount;
    private String image;
    private String detail;

    public Goods toEntity() {
        return Goods.builder().build();
    }

}
