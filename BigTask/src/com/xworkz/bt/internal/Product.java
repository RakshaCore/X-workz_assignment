package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Product {
    private String productName;
    private String productCode;
    private double price;
    private String category;

    private Company companyDetails;
}
