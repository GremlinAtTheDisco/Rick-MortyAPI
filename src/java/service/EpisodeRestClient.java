

package service;

import java.util.Arrays;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import models.Episode;
import models.Location;
import models.RMCharacters;

public class EpisodeRestClient {
    
    
    
    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("https://rickandmortyapi.com/api/").path("episode");
    
    Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
    Response response = invocationBuilder.get();
    CharacterRestClient charRestClient;

    public EpisodeRestClient() {
    }
    
    public Episode getEpisodeById (String id) {
        Episode episode = target.path(id).request().get(Episode.class);
        
        System.out.println(response.getStatus());
        System.out.println(episode.getName());
        
        return episode;
    }
    
    public List<Episode> getAllEpisodes () {
        Episode episodes = response.readEntity(Episode.class);
        List<Episode> results = episodes.getResults();
        
        System.out.println(results);
        
        return results;
    }
    
    

}
