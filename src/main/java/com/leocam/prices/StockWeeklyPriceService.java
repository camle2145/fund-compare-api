package com.leocam.prices;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class StockWeeklyPriceService {
    
    private final StockWeeklyPriceRepository stockWeeklyPriceRepository;

    public StockWeeklyPriceService(StockWeeklyPriceRepository stockWeeklyPriceRepository) {
        this.stockWeeklyPriceRepository = stockWeeklyPriceRepository;
    }

    public List<StockWeeklyPrice> getPricesByStockSymbol(String stockSymbol) {
        return stockWeeklyPriceRepository.findByIdStockSymbolOrderByDateAsc(stockSymbol);
    }

    public List<StockWeeklyPrice> getPricesByStockSymbolDesc(String stockSymbol) {
        return stockWeeklyPriceRepository.findByIdStockSymbolOrderByDateDesc(stockSymbol);
    }

    public List<StockWeeklyPrice> getPricesByStockSymbolBetweenDates(String stockSymbol, LocalDate startDate, LocalDate endDate) {
        return stockWeeklyPriceRepository.findByIdStockSymbolBetween(stockSymbol, startDate, endDate);
    }
}
