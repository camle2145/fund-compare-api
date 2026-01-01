package com.leocam.fund_compare_api.funds;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundRepository extends JpaRepository<Fund, FundId>{

    List<Fund> findByFundTypeStockSymbolOrderByIdProviderAscIdNameAsc(String stockSymbol);

    List<Fund> findByIdProviderOrderByIdNameAsc(String provider);

    List<Fund> findByFundTypeStockSymbolAndIdProviderOrderByIdNameAsc(String stockSymbol, String provider);
}
