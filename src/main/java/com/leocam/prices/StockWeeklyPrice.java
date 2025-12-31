package com.leocam.prices;

import java.time.LocalDate;

import com.leocam.funds.FundType;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/** 
 * Entity class representing weekly stock prices.
 */
@Entity
@Table(name = "stock_weekly_prices")
class StockWeeklyPrice {

    @EmbeddedId
    private StockWeeklyPriceId id;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "price_date", nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "stock_symbol", referencedColumnName = "stock_symbol", nullable = false)
    private FundType fundType;


    protected StockWeeklyPrice(){}

    public Double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public FundType getFundType() {
        return fundType;
    }

    public StockWeeklyPriceId getId() {
        return id;
    }

    
}
