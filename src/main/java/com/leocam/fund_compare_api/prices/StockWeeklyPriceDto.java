package com.leocam.fund_compare_api.prices;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StockWeeklyPriceDto {

    private Double price;
    private LocalDate date;
    private String stockSymbol;

    public StockWeeklyPriceDto(StockWeeklyPrice stockWeeklyPrice) {
        this.price = stockWeeklyPrice.getPrice();
        this.date = stockWeeklyPrice.getId().getDate();
        this.stockSymbol = stockWeeklyPrice.getId().getFundType().getStockSymbol();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }
}
