package com.ebcho.purplemarket.web.dto;

import com.ebcho.purplemarket.domain.goods.Goods;
import lombok.Builder;
import lombok.Getter;

@Getter
public class GoodsListResponseDto {
    private Long id;
    private String name;
    private String category;
    private Long price;
    private Long stock;
    private Long sales;
    private Integer discount;
    private String image;

    @Builder
    public GoodsListResponseDto(Goods entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.category = entity.getCategory();
        this.price = entity.getPrice();
        this.stock = entity.getStock();
        this.sales = entity.getSales();
        this.discount = entity.getDiscount();
        this.image = entity.getImage();
    }
}
