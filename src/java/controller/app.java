package controller;

import java.util.Scanner;
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

//        System.out.println("Select id");
//
//        String input = sc.next();
////
////        characterRest.getCharacterById(input);
//        characterRest.getAllCharacters();
//
////locationRest.getLocationById(input);
////
////locationRest.getAllLocations();
//
//episodeRest.getEpisodeById(input);
episodeRest.getAllEpisodes();

    }

}
