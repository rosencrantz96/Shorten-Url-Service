package kr.co.shortenurlservice.domain;

public class ShortenUrl {
    private String originalUrl;
    private String shortenUrlKey;
    private String redirectCount;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortenUrlKey() {
        return shortenUrlKey;
    }
}
