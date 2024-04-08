package br.com.alura.main;

import br.com.alura.models.Favorites;
import br.com.alura.models.Music;
import br.com.alura.models.Podcast;

public class Main {
    public static void main(String[] args) {

        // MUSIC

        Music myMusic = new Music();
        myMusic.setTitle("Weightless");
        myMusic.setSinger("Marconi Union");
        myMusic.setAlbum("The Ambient Zone Just Music Cafe Vol 4");
        myMusic.setGender("Low-Fi");

        // Simulate 10.000 views
        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }
        // Simulate 1000 likes
        for (int i = 0; i < 100; i++) {
            myMusic.like();
        }

        // PODCAST

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Podpah #01");
        myPodcast.setHost("Igão, Mitico");
        myPodcast.setDescription("""
        NINJA
        @douglasviegas
                        
        ---------
        Podpah é um programa comandado pelos hosts Igão e Mítico onde eles trocam ideias engraçadas com seus convidados.
                """);

        // Simulate 5000 views
        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }
        // Simulate 100.000 likes
        for (int i = 0; i < 100000; i++) {
            myPodcast.like();
        }

        // FAVORITES

        Favorites favorites = new Favorites();
        favorites.include(myMusic); // includes myMusic to favorites
        favorites.include(myPodcast); // includes myPodcast to favorites
    }
}