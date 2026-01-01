package com.leocam.fund_compare_api.prices;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for StockWeeklyPrice entity operations.
 */
@Repository
public interface StockWeeklyPriceRepository extends JpaRepository<StockWeeklyPrice, StockWeeklyPriceId> {
    
    /**
     * Find stock weekly prices by stock symbol ordered by date ascending.
     */
    List<StockWeeklyPrice> findByIdFundTypeStockSymbolOrderByIdDateAsc(String stockSymbol);

    /**
     * Find stock weekly prices by stock symbol ordered by date descending.
     */
    List<StockWeeklyPrice> findByIdFundTypeStockSymbolOrderByIdDateDesc(String stockSymbol);

    /**
     * Find stock weekly prices by stock symbol between specified dates.
     */
    List<StockWeeklyPrice> findByIdFundTypeStockSymbolBetween(String stockSymbol, LocalDate startDate, LocalDate endDate);
}
