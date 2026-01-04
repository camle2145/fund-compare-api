package com.leocam.fund_compare_api.prices;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


/** 
 * Entity class representing weekly stock prices.
 */
@Entity
@Table(name = "stock_weekly_prices")
@Validated
public class StockWeeklyPrice {

    /**
     * Composite primary key for the StockWeeklyPrice entity.
     */
    @EmbeddedId
    @NotNull
    private StockWeeklyPriceId id;

    /**
     * Price of the stock on the given date.
     */
    @Column(name = "price", nullable = false)
    @NotNull
    private Double price;

    /**
     * Default constructor.
     */
    protected StockWeeklyPrice(){}

    /**
     * Parameterized constructor.
     */
    public Double getPrice() {
        return price;
    }

    /**
     *  Getter for id.
     */
    public StockWeeklyPriceId getId() {
        return id;
    }

    
}
