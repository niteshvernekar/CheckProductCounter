package com.checkoutcounter.controller.request;

/**
 * 
 */
public class CategoryConfigureRequest {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalesTaxPercentage() {
        return salesTaxPercentage;
    }

    public void setSalesTaxPercentage(String salesTaxPercentage) {
        this.salesTaxPercentage = salesTaxPercentage;
    }

    private String name;
    private String salesTaxPercentage;
}
