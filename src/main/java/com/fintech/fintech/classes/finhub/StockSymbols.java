package com.fintech.fintech.classes.finhub;

public class StockSymbols {
    private String currency;
    private String description;
    private String displaySymbol;
    private String figi;
    private String mic;
    private String symbol;
    private String type;

    public void setCurrency(String s) {
        this.currency = s;
    }
    public String getCurrency() {
        return this.currency;
    }

    public void setDescription(String s) { this.description = s; }
    public String getDescription() {
        return this.description;
    }

    public void setDisplaySymbol(String s) {
        this.displaySymbol = s;
    }
    public String getDisplaySymbol() { return this.displaySymbol; }

    public String getFigi() {
        return this.figi;
    }
    public void setFigi(String s) {
        this.figi = s;
    }

    public void setMic(String mic) { this.mic = mic; }
    public String getMic() { return mic; }

    public void setSymbol(String symbol) { this.symbol = symbol; }
    public String getSymbol() { return symbol; }

    public void setType(String type) { this.type = type; }
    public String getType() { return type; }

}
