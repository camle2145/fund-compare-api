package com.leocam.fund_compare_api.funds;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Entity class representing a Fund.
 */
@Entity
@Table(name = "funds")
public class Fund {
    
    /**
     * Composite primary key for the Fund entity.
     */
    @EmbeddedId
    private FundId id;

    /**
     * Many-to-one relationship with FundType entity.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fund_type", nullable = false)
    private FundType fundType;

    /**
     * Annual fee of the fund.
     */
    @Column(name = "annual_fee")
    private Double annualFee;

    /**
     * Buy transaction fee of the fund.
     */
    @Column(name = "buy_fee")
    private Double buyFee;

    /**
     * Sell transaction fee of the fund.
     */
    @Column(name = "sell_fee")
    private Double sellFee;

    @Column(name = "max_buy_fee")
    private Double maxBuyFee;

    /**
     * Maximum sell transaction fee of the fund (in dollars).
     */
    @Column(name = "max_sell_fee")
    private Double maxSellFee;

    /**
     * Monthly subscription fee of the fund (in dollars).
     */
    @Column(name = "monthly_subscription_flat_fee")
    private Double monthylSub;

    /**
     * Default constructor for JPA.
     */
    protected Fund() {}

    /**
     * Getter for fundType.
     */
    public FundType getFundType() {
        return fundType;
    }

    /**
     * Getter for annualFee.
     */
    public Double getAnnualFee() {
        return annualFee;
    }

    /**
     * Getter for buyFee.
     */
    public Double getBuyFee() {
        return buyFee;
    }

    /**
     * Getter for sellFee.
     */
    public Double getSellFee() {
        return sellFee;
    }

    /**
     * Getter for maxBuyFee.
     */
    public Double getMaxBuyFee() {
        return maxBuyFee;
    }

    /**
     * Getter for maxSellFee.
     */
    public Double getMaxSellFee() {
        return maxSellFee;
    }

    /**
     * Getter for monthylSub.
    */
    public Double getMonthylSub() {
        return monthylSub;
    }

    /**
     * Getter for id.
     */
    public FundId getId() {
        return id;
    }

    
}
