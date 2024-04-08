package br.com.alura.models;

public class Podcast extends Audio {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getRating() {
        if (getTotalLikes() > 50000) {
            return 10;
        } else if (getTotalLikes() > 25000) {
            return 7;
        } else if (getTotalLikes() > 10000) {
            return 4;
        } else {
            return 1;
        }
    }
}
