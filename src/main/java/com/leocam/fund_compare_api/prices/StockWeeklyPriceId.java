package com.leocam.fund_compare_api.prices;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.leocam.fund_compare_api.funds.FundType;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

/**
 * Embeddable class representing the composite key for StockWeeklyPrice entity.
 */
@Embeddable
@Validated
public class StockWeeklyPriceId implements Serializable {

    /**
     * Date of the stock price.
     */
    @Column(name = "price_date", nullable = false)
    @NotNull
    private LocalDate date;

    /**
     * Fund type associated with the stock price.
     */
    @ManyToOne
    @NotNull
    @JoinColumn(name = "stock_symbol", nullable = false)
    private FundType fundType;

    /**
     * Default constructor.
     */
    public StockWeeklyPriceId() {}

    /**
     * Parameterized constructor.
     */
    public StockWeeklyPriceId(LocalDate date, FundType fundType) {
        this.date = date;
        this.fundType = fundType;
    }

    /**
     * Getter for fundType.
     */
    public FundType getFundType() {
        return fundType;
    }

    /**
     * Getter for date.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Equals method override.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof StockWeeklyPriceId that)) return false;
        return Objects.equals(fundType.getStockSymbol(), that.getFundType().getStockSymbol()) && 
            Objects.equals(date, that.date);
    }

    /**
     * HashCode method override.
     */
    @Override
    public int hashCode() {
        return Objects.hash(fundType.getStockSymbol(), date);
    }
}