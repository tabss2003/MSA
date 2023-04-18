package com.example.catalogservice.dto;

import lombok.Data;

import java.io.Serializable;
// 어쩔 때 직렬화 ? -> 자세히 알아보기

@Data
public class CatalogDto implements Serializable {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
