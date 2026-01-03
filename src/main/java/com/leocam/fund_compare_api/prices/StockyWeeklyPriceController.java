package com.leocam.fund_compare_api.prices;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stock-weekly-prices")
public class StockyWeeklyPriceController {
    
    /**
     * Service for StockWeeklyPrice operations.
     */
    private final StockWeeklyPriceService stockWeeklyPriceService;

    /**
     * Constructor for StockyWeeklyPriceController.
     * @param stockWeeklyPriceService the StockWeeklyPriceService to be used
     */
    public StockyWeeklyPriceController(StockWeeklyPriceService stockWeeklyPriceService) {
        this.stockWeeklyPriceService = stockWeeklyPriceService;
    }
    
    /**
     * Get stock weekly prices by stock symbol.
     * @param stockSymbol the stock symbol
     * @return list of StockWeeklyPriceDto
     */
    @GetMapping("by-stock-symbol/{stockSymbol}")
    public List<StockWeeklyPriceDto> getPricesByStockSymbol(@PathVariable("stockSymbol") String stockSymbol) {
        return stockWeeklyPriceService.getPricesByStockSymbol(stockSymbol)
                .stream()
                .map(StockWeeklyPriceDto::new)
                .toList();
    }

    /**
     * Get stock weekly prices by stock symbol between two dates
     * @param stockSymbol the stock symbol
     * @param startDate the start date
     * @param endDate the end date
     * @return list of StockWeeklyPriceDto of the stock symbol between the specified dates 
     */
    @GetMapping("by-stock-symbol-between-dates/{stockSymbol}/{startDate}/{endDate}")
    public List<StockWeeklyPriceDto> getPricesByStockSymbolBetweenDates(
            @PathVariable("stockSymbol") String stockSymbol, 
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        return stockWeeklyPriceService.getPricesByStockSymbolBetweenDates(stockSymbol, startDate, endDate)
                .stream()
                .map(StockWeeklyPriceDto::new)
                .toList();
    }
}
