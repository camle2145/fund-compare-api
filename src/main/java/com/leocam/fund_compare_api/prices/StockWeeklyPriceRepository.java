package com.leocam.fund_compare_api.prices;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockWeeklyPriceRepository extends JpaRepository<StockWeeklyPrice, StockWeeklyPriceId> {
    
    List<StockWeeklyPrice> findByIdFundTypeStockSymbolOrderByIdDateAsc(String stockSymbol);

    List<StockWeeklyPrice> findByIdFundTypeStockSymbolOrderByIdDateDesc(String stockSymbol);

    List<StockWeeklyPrice> findByIdFundTypeStockSymbolBetween(String stockSymbol, LocalDate startDate, LocalDate endDate);
}
