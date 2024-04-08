package br.com.alura.models;

public class Favorites {
    public void include(Audio audio) {
        if (audio.getRating() >= 8) {
            System.out.println(audio.getTitle() + " Is better!!!");
        } else if (audio.getRating() >= 6){
            System.out.println(audio.getTitle() + " Is very good!");
        } else  {
            System.out.println(audio.getTitle() + " Maybe later...");
        }
    }
}
