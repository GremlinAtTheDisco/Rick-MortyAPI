package controller;

import java.util.Scanner;
import models.Episode;
import service.CharacterRestClient;
import service.EpisodeRestClient;
import service.LocationRestClient;

//https://rickandmortyapi.com/documentation/#characterRest link to API documentation.

public class app {

    static CharacterRestClient characterRest = new CharacterRestClient();
    static LocationRestClient locationRest = new LocationRestClient();
    static EpisodeRestClient episodeRest = new EpisodeRestClient();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Select input");

        String input = sc.next();
////
////        characterRest.getCharacterById(input);
//        characterRest.getAllCharacters();
//
////locationRest.getLocationById(input);
////
////locationRest.getAllLocations();
//
//episodeRest.getEpisodeById(input);
//episodeRest.getAllEpisodes();

//Episode e1 = new Episode();
//
//        System.out.println(e1.getCharacters());

characterRest.getDeadOrAliveCharacters(input);

    }

}
