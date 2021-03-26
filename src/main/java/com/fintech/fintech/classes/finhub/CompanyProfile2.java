package com.fintech.fintech.classes.finhub;

public class CompanyProfile2 {
    private String country;
    private String currency;
    private String exchange;
    private String ipo;
    private int marketCapitalization;
    private String name;
    private String phone;
    private double shareOutstanding;
    private String ticker;
    private String weburl;
    private String logo;
    private String finnhubIndustry;


    public double getShareOutstanding() {
        return shareOutstanding;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public String getExchange() {
        return exchange;
    }

    public String getFinnhubIndustry() {
        return finnhubIndustry;
    }

    public String getIpo() {
        return ipo;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getTicker() {
        return ticker;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setShareOutstanding(double shareOutstanding) {
        this.shareOutstanding = shareOutstanding;
    }

    public void setFinnhubIndustry(String finnhubIndustry) {
        this.finnhubIndustry = finnhubIndustry;
    }

    public void setIpo(String ipo) {
        this.ipo = ipo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setMarketCapitalization(int marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

}
