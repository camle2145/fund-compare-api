package com.leocam.fund_compare_api.funds;

import lombok.Data;

/**
 * Data Transfer Object for FundType entity.
 */
@Data
public class FundTypeDto {

    private String stockSymbol;
    private String name;

    public FundTypeDto(FundType fundType) {
        this.stockSymbol = fundType.getStockSymbol();
        this.name = fundType.getName();
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
