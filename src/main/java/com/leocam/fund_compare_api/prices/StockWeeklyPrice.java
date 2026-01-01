package com.leocam.fund_compare_api.prices;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


/** 
 * Entity class representing weekly stock prices.
 */
@Entity
@Table(name = "stock_weekly_prices")
public class StockWeeklyPrice {

    /**
     * Composite primary key for the StockWeeklyPrice entity.
     */
    @EmbeddedId
    private StockWeeklyPriceId id;

    /**
     * Price of the stock on the given date.
     */
    @Column(name = "price", nullable = false)
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
