package com.leocam.fund_compare_api.funds;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/funds")
public class FundController {

    private final FundService fundService;

    public FundController(FundService fundService) {
        this.fundService = fundService;
    }

    @GetMapping("by-stock-symbol/{stockSymbol}")
    public List<FundDto> getFundsByStockSymbol(@PathVariable("stockSymbol") String stockSymbol) {
        return fundService.getFundsByStockSymbol(stockSymbol)
                .stream()
                .map(FundDto::new)
                .toList();
    }

    @GetMapping("by-provider/{provider}")
    public List<FundDto> getFundsByProvider(@PathVariable("provider") String provider) {
        return fundService.getFundsByProvider(provider)
                .stream()
                .map(FundDto::new)
                .toList();

    }

    @GetMapping("by-stock-symbol-and-provider/{stockSymbol}/{provider}")
    public List<FundDto> getFundsByStockSymbolAndProvider(@PathVariable("stockSymbol") String stockSymbol,
            @PathVariable("provider") String provider) {
        return fundService.getFundsByStockSymbolAndProvider(stockSymbol, provider)
                .stream()
                .map(FundDto::new)
                .toList();
    }
}
