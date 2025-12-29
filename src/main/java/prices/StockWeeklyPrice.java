package prices;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


/** 
 * Entity class representing weekly stock prices.
 */
@Entity
@Table(name = "stock_weekly_prices")
class StockWeeklyPrice {

    @EmbeddedId
    private StockWeeklyPriceId id;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "price_date", nullable = false)
    private LocalDate date;

    @Column(name = "stock_symbol", nullable = false)
    private String stockSymbol;


    protected StockWeeklyPrice(){}

    public StockWeeklyPrice(Double price, LocalDate date, String stockSymbol)   {
        this.price = price;
        this.date = date;
        this.stockSymbol = stockSymbol;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public StockWeeklyPriceId getId() {
        return id;
    }

    
}
