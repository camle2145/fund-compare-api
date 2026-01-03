package com.leocam.fund_compare_api.funds;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Fund entity operations.
 */
@Repository
public interface FundRepository extends JpaRepository<Fund, FundId>{

    /**
     * Find funds by stock symbol ordered by provider and name.
     * @param stockSymbol the stock symbol
     * @return list of Fund
     */
    List<Fund> findByFundTypeStockSymbolOrderByIdProviderAscIdNameAsc(String stockSymbol);

    /**
     * Find funds by provider ordered by name.
     * @param provider the provider
     * @return list of Fund
     */
    List<Fund> findByIdProviderOrderByIdNameAsc(String provider);

    /**
     * Find funds by stock symbol and provider ordered by name.
     * @param stockSymbol the stock symbol
     * @param provider the provider
     */
    List<Fund> findByFundTypeStockSymbolAndIdProviderOrderByIdNameAsc(String stockSymbol, String provider);
}
