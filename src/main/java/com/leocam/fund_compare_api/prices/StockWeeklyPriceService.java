package com.leocam.fund_compare_api.prices;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for StockWeeklyPrice-related operations.
 */
@Service
@Transactional(readOnly = true)
public class StockWeeklyPriceService {
    
    /**
     * Repository for StockWeeklyPrice entity operations.
     */
    private final StockWeeklyPriceRepository stockWeeklyPriceRepository;

    /**
     * Constructor for StockWeeklyPriceService.
     */
    public StockWeeklyPriceService(StockWeeklyPriceRepository stockWeeklyPriceRepository) {
        this.stockWeeklyPriceRepository = stockWeeklyPriceRepository;
    }

    /**
     * Get stock weekly prices by stock symbol ordered by date ascending.
     */
    public List<StockWeeklyPrice> getPricesByStockSymbol(String stockSymbol) {
        return stockWeeklyPriceRepository.findByIdFundTypeStockSymbolOrderByIdDateAsc(stockSymbol);
    }

    /**
     * Get stock weekly prices by stock symbol ordered by date descending.
     */
    public List<StockWeeklyPrice> getPricesByStockSymbolDesc(String stockSymbol) {
        return stockWeeklyPriceRepository.findByIdFundTypeStockSymbolOrderByIdDateDesc(stockSymbol);
    }

    /**
     * Get stock weekly prices by stock symbol between specified dates.
     */
    public List<StockWeeklyPrice> getPricesByStockSymbolBetweenDates(String stockSymbol, LocalDate startDate, LocalDate endDate) {
        return stockWeeklyPriceRepository.findByIdFundTypeStockSymbolAndIdDateBetween(stockSymbol, startDate, endDate);
    }
}
