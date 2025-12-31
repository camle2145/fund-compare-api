package com.leocam.prices;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockWeeklyPriceRepository extends JpaRepository<StockWeeklyPrice, StockWeeklyPriceId> {
    
    List<StockWeeklyPrice> findByIdStockSymbolOrderByDateAsc(String stockSymbol);

    List<StockWeeklyPrice> findByIdStockSymbolOrderByDateDesc(String stockSymbol);

    List<StockWeeklyPrice> findByIdStockSymbolBetween(String stockSymbol, LocalDate startDate, LocalDate endDate);
}
