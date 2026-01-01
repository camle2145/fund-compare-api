package com.leocam.fund_compare_api.funds;

import lombok.Data;

/**
 * Data Transfer Object for Fund entity.
 */
@Data
public class FundDto {
    private String name;
    private String provider;
    private String fundType;
    private Double annualFee;
    private Double buyFee;
    private Double sellFee;
    private Double maxBuyFee;
    private Double maxSellFee;
    private Double monthylSub;

    public FundDto(Fund fund) {
        this.name = fund.getId().getName();
        this.provider = fund.getId().getProvider();
        this.fundType = fund.getFundType().getStockSymbol();
        this.annualFee = fund.getAnnualFee();
        this.buyFee = fund.getBuyFee();
        this.sellFee = fund.getSellFee();
        this.maxBuyFee = fund.getMaxBuyFee();
        this.maxSellFee = fund.getMaxSellFee();
        this.monthylSub = fund.getMonthylSub();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public Double getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(Double annualFee) {
        this.annualFee = annualFee;
    }

    public Double getBuyFee() {
        return buyFee;
    }

    public void setBuyFee(Double buyFee) {
        this.buyFee = buyFee;
    }

    public void setSellFee(Double sellFee) {
        this.sellFee = sellFee;
    }

    public void setMaxBuyFee(Double maxBuyFee) {
        this.maxBuyFee = maxBuyFee;
    }

    public Double getMaxSellFee() {
        return maxSellFee;
    }

    public void setMaxSellFee(Double maxSellFee) {
        this.maxSellFee = maxSellFee;
    }

    public Double getMonthylSub() {
        return monthylSub;
    }

    public void setMonthylSub(Double monthylSub) {
        this.monthylSub = monthylSub;
    }
    
}
