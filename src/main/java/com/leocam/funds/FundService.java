package com.leocam.funds;

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
        return fundRepository.findByTypeStockSymbolOrderByIdProviderAscIdNameAsc(stockSymbol);
    }

    public List<Fund> getFundsByProvider(String provider) {
        return fundRepository.findByTypeProviderOrderByIdNameAsc(provider);
    }

    public List<Fund> getFundsByStockSymbolAndProvider(String stockSymbol, String provider) {
        return fundRepository.findByTypeStockSymbolAndIdProviderOrderByIdNameAsc(stockSymbol, provider);
    }
}
