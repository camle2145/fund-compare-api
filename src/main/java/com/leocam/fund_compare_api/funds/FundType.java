package com.leocam.fund_compare_api.funds;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "fund_type")
public class FundType {

    @Id
    @Column(name = "stock_symbol", nullable = false)
    private String stockSymbol;

    @OneToMany(mappedBy = "fundType")
    private List<Fund> funds = new ArrayList<>();

    @Column(name = "name", nullable = false)
    private String name;

    protected FundType(){this.funds = new ArrayList<>();
}

    protected FundType(String stockSymbol, String name) {
        this.funds = new ArrayList<>();
        this.stockSymbol = stockSymbol;
        this.name = name;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public String getName() {
        return name;
    }

    public List<Fund> getFunds() {
        return funds;
    }


}
