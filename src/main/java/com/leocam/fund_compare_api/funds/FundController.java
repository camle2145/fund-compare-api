package com.leocam.fund_compare_api.funds;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for Fund-related endpoints.
 */
@RestController
@RequestMapping("/api/funds")
public class FundController {

    /**
     * Service for Fund operations.
     */
    private final FundService fundService;

    /**
     * Constructor for FundController.
     * @param fundService the FundService to be used
     */
    public FundController(FundService fundService) {
        this.fundService = fundService;
    }


    /**
     * Get all funds. 
     * @return list of FundDtto
     */
    @GetMapping({"", "/"})
    public List<FundDto> getAllFunds() {
        return fundService.getFunds()
                .stream()
                .map(FundDto::new)
                .toList();
    }
    /**
     * Get stock symbols.
     * 
     * @return list of stock symbols
     */
    @GetMapping("/stock-symbols")
    public List<String> getStockSymbols() {
        return fundService.getStockSymbols();
    }

    @GetMapping("/providers")
    public List<String> getProviders() {
        return fundService.getProviders();
    }
    /**
     * Get funds by stock symbol.
     * @param stockSymbol the stock symbol
     * @return list of FundDto
     */
    @GetMapping("/by-stock-symbol/{stockSymbol}")
    public List<FundDto> getFundsByStockSymbol(@PathVariable("stockSymbol") String stockSymbol) {
        return fundService.getFundsByStockSymbol(stockSymbol)
                .stream()
                .map(FundDto::new)
                .toList();
    }

    /**
     * Get funds by provider.
     * @param provider the provider
     * @return list of FundDto
     */
    @GetMapping("by-provider/{provider}")
    public List<FundDto> getFundsByProvider(@PathVariable("provider") String provider) {
        return fundService.getFundsByProvider(provider)
                .stream()
                .map(FundDto::new)
                .toList();

    }

    /**
     * Get funds by stock symbol and provider.
     * @param stockSymbol the stock symbol
     * @param provider the provider
     * @return list of FundDto
     */
    @GetMapping("by-stock-symbol-and-provider/{stockSymbol}/{provider}")
    public List<FundDto> getFundsByStockSymbolAndProvider(@PathVariable("stockSymbol") String stockSymbol,
            @PathVariable("provider") String provider) {
        return fundService.getFundsByStockSymbolAndProvider(stockSymbol, provider)
                .stream()
                .map(FundDto::new)
                .toList();
    }
}
