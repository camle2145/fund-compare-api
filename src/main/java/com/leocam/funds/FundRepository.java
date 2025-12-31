package com.leocam.funds;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FundRepository extends JpaRepository<Fund, FundId>{

    List<Fund> findByTypeStockSymbolOrderByIdProviderAscIdNameAsc(String stockSymbol);

    List<Fund> findByTypeProviderOrderByIdNameAsc(String provider);

    List<Fund> findByTypeStockSymbolAndIdProviderOrderByIdNameAsc(String stockSymbol, String provider);
}
