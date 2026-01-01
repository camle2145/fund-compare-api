package com.leocam.fund_compare_api.funds;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class FundService {
    
    private final FundRepository fundRepository;

    public FundService(FundRepository fundRepository) {
        this.fundRepository = fundRepository;
    }   

    public List<Fund> getFundsByStockSymbol(String stockSymbol) {
        return fundRepository.findByFundTypeStockSymbolOrderByIdProviderAscIdNameAsc(stockSymbol);
    }

    public List<Fund> getFundsByProvider(String provider) {
        return fundRepository.findByIdProviderOrderByIdNameAsc(provider);
    }

    public List<Fund> getFundsByStockSymbolAndProvider(String stockSymbol, String provider) {
        return fundRepository.findByFundTypeStockSymbolAndIdProviderOrderByIdNameAsc(stockSymbol, provider);
    }
}
