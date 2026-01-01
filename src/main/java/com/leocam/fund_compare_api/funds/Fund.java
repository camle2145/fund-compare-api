package com.leocam.fund_compare_api.funds;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funds")
public class Fund {
    
    
    @EmbeddedId
    private FundId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fund_type", nullable = false)
    private FundType fundType;

    @Column(name = "annual_fee")
    private Double annualFee;

    @Column(name = "buy_fee")
    private Double buyFee;

    @Column(name = "sell_fee")
    private Double sellFee;

    @Column(name = "max_buy_fee")
    private Double maxBuyFee;

    @Column(name = "max_sell_fee")
    private Double maxSellFee;

    @Column(name = "monthly_subscription_flat_fee")
    private Double monthylSub;

    protected Fund() {}

    public FundType getFundType() {
        return fundType;
    }

    public Double getAnnualFee() {
        return annualFee;
    }

    public Double getBuyFee() {
        return buyFee;
    }

    public Double getSellFee() {
        return sellFee;
    }

    public Double getMaxBuyFee() {
        return maxBuyFee;
    }

    public Double getMaxSellFee() {
        return maxSellFee;
    }

    public Double getMonthylSub() {
        return monthylSub;
    }

    public FundId getId() {
        return id;
    }

    
}
