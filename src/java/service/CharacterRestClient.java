package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import models.RMCharacters;

public class CharacterRestClient {

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("https://rickandmortyapi.com/api/").path("character");

    Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
    Response response = invocationBuilder.get();

    public CharacterRestClient() {
    }

    public models.RMCharacters getCharacterById(String id) {
        models.RMCharacters character = target.path(id).request().get(models.RMCharacters.class);

        System.out.println(response.getStatus());
        System.out.println(character);
        return character;
    }

    public List<RMCharacters> getAllCharacters() {

        RMCharacters rm = response.readEntity(RMCharacters.class);
        List<RMCharacters> results = rm.getResults();

        System.out.println(response.getStatus());
        System.out.println(Arrays.toString(results.toArray(new RMCharacters[results.size()])));

        return results;

    }
    public List<RMCharacters> getDeadOrAliveCharacters(String input) {
        String statusUrl = "https://rickandmortyapi.com/api/character/?status=" + input;
        RMCharacters filteredResults = client.target(statusUrl).request().get(RMCharacters.class);
        
        List<RMCharacters> results = filteredResults.getResults();
        
        System.out.println(response.getStatus());
        System.out.println(results);
        
        return results;
        
    }
}
