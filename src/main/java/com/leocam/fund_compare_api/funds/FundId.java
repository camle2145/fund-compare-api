package com.leocam.fund_compare_api.funds;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class FundId implements Serializable {

    @Column(name = "provider", nullable = false)
    private String provider;
    
    @Column(name = "name", nullable = false)
    private String name;

    public FundId() {}

    public String getName() {
        return name;
    }

    public String getProvider() {
        return provider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof FundId that)) return false;
        return Objects.equals(name, that.name) && 
            Objects.equals(provider, that.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, provider);
    }
}