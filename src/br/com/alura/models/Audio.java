package br.com.alura.models;

public class Audio {
    private String title;
    private int duration;
    private int totalPlays;
    private int totalLikes;
    private int rating;


    public void like() {
        totalLikes++;
    }

    public void play() {
        totalPlays++;
    }

    // Getters and Setters -------------


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getRating() {
        return rating;
    }
}
