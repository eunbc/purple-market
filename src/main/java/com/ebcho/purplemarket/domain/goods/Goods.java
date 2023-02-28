package com.ebcho.purplemarket.domain.goods;

import com.ebcho.purplemarket.web.dto.GoodsUpdateRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private Long price;
    private Integer discount;
    private Long stock = 0L;
    private String image;
    private String detail;
    private Long sales = 0L;
    private Boolean isDeleted = Boolean.FALSE;

    @Builder
    public Goods(Long id, String name, String category, Long price, Integer discount, Long stock, String image, String detail, Long sales, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.image = image;
        this.detail = detail;
        this.sales = sales;
        this.isDeleted = isDeleted;
    }

    public void update(GoodsUpdateRequestDto requestDto) {
        this.name = requestDto.getName();
        this.category = requestDto.getCategory();
        this.price = requestDto.getPrice();
        this.discount = requestDto.getDiscount();
        this.image = requestDto.getImage();
        this.detail = requestDto.getDetail();
    }

    public void delete() {
        isDeleted = Boolean.TRUE;
    }
}
