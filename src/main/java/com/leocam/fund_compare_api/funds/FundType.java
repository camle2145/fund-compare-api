package com.leocam.fund_compare_api.funds;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Entity class representing a type of fund (e.g. S & P 500, Total Market, etc.)
 */
@Entity
@Table(name = "fund_type")
public class FundType {

    /**
     * Stock symbol representing the fund type.
     */
    @Id
    @Column(name = "stock_symbol", nullable = false)
    private String stockSymbol;

    /**
     * List of funds associated with this fund type.
     */
    @OneToMany(mappedBy = "fundType")
    private List<Fund> funds = new ArrayList<>();

    /**
     * Name of the fund type.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Default constructor.
     */
    protected FundType() {
    }

    /**
     * Parameterized constructor.
     */
    protected FundType(String stockSymbol, String name) {
        this.stockSymbol = stockSymbol;
        this.name = name;
    }

    /**
     * Getter for stock symbol.
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Getter for name.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for funds.
     */
    public List<Fund> getFunds() {
        return funds;
    }

}
