package com.ebcho.purplemarket.web.dto;

import lombok.Getter;

@Getter
public class GoodsUpdateRequestDto {
    private String name;
    private String category;
    private Long price;
    private Integer discount;
    private String image;
    private String detail;
}
