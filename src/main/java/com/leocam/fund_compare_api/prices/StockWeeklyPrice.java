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

    @EmbeddedId
    private StockWeeklyPriceId id;

    @Column(name = "price", nullable = false)
    private Double price;

    protected StockWeeklyPrice(){}

    public Double getPrice() {
        return price;
    }

    public StockWeeklyPriceId getId() {
        return id;
    }

    
}
