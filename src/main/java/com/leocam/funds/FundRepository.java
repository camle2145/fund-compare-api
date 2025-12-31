package com.leocam.funds;

import java.util.List;

public interface FundRepository {

    List<Fund> findByTypeStockSymbolOrderByIdProviderAscIdNameAsc(String stockSymbol);

    List<Fund> findByTypeProviderOrderByIdNameAsc(String provider);

    List<Fund> findByTypeStockSymbolAndIdProviderOrderByIdNameAsc(String stockSymbol, String provider);
}
