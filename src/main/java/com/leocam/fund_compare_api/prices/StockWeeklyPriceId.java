package com.leocam.fund_compare_api.prices;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.leocam.fund_compare_api.funds.FundType;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class StockWeeklyPriceId implements Serializable {

    @Column(name = "price_date", nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "stock_symbol", nullable = false)
    private FundType fundType;

    public StockWeeklyPriceId() {}

    public StockWeeklyPriceId(LocalDate date, FundType fundType) {
        this.date = date;
        this.fundType = fundType;
    }

    public FundType getFundType() {
        return fundType;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof StockWeeklyPriceId that)) return false;
        return Objects.equals(fundType.getStockSymbol(), that.getFundType().getStockSymbol()) && 
            Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundType.getStockSymbol(), date);
    }
}