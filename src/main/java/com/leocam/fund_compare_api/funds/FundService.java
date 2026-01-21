package com.leocam.fund_compare_api.funds;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Fund-related operations.
 */
@Service
@Transactional(readOnly = true)
public class FundService {
    
    /**
     * Repository for Fund entity operations.
     */
    private final FundRepository fundRepository;

    /**
     * Constructor for FundService.
     * @param fundRepository the FundRepository to be used
     */
    public FundService(FundRepository fundRepository) {
        this.fundRepository = fundRepository;
    }   

    /**
     * Get providers.
     * @return
     */
    public List<String> getProviders() {
        return fundRepository.findDistinctIdProvider();
    }

    /**
     * Get stock symbols.
     * 
     * @return list of stock symbols
     */
    public List<String> getStockSymbols() {
        return fundRepository.findAllStockSymbols();
    }
    /**
     * Get funds by stock symbol.
     * @param stockSymbol the stock symbol
     * @return list of Fund
     */
    public List<Fund> getFundsByStockSymbol(String stockSymbol) {
        return fundRepository.findByFundTypeStockSymbolOrderByIdProviderAscIdNameAsc(stockSymbol);
    }

    /**
     * Get funds by provider.
     * @param provider the provider
     * @return list of Fund
     */
    public List<Fund> getFundsByProvider(String provider) {
        return fundRepository.findByIdProviderOrderByIdNameAsc(provider);
    }

    /**
     * Get funds by stock symbol and provider.
     * @param stockSymbol the stock symbol
     * @param provider the provider
     */
    public List<Fund> getFundsByStockSymbolAndProvider(String stockSymbol, String provider) {
        return fundRepository.findByFundTypeStockSymbolAndIdProviderOrderByIdNameAsc(stockSymbol, provider);
    }
}
