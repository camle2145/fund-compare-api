package com.leocam.fund_compare_api.funds;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * Embeddable class representing the composite key for Fund entity.
 */
@Embeddable
public class FundId implements Serializable {

    /**
     * Provider of the fund.
     */
    @Column(name = "provider", nullable = false)
    private String provider;
    
    /**
     * Name of the fund.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Default constructor.
     */
    public FundId() {}

    /**
     * Getter for name.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for provider.
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Equals method override.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof FundId that)) return false;
        return Objects.equals(name, that.name) && 
            Objects.equals(provider, that.provider);
    }

    /**
     * HashCode method override.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, provider);
    }
}