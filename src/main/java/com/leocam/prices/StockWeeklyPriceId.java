package com.leocam.prices;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class StockWeeklyPriceId implements Serializable {

    @Column(name = "price_date", nullable = false)
    private LocalDate date;
    
    @Column(name = "stock_symbol", nullable = false)
    private String stockSymbol;

    public StockWeeklyPriceId() {}

    public StockWeeklyPriceId(LocalDate date, String stockSymbol) {
        this.date = date;
        this.stockSymbol = stockSymbol;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof StockWeeklyPriceId that)) return false;
        return Objects.equals(stockSymbol, that.stockSymbol) && 
            Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockSymbol, date);
    }
}