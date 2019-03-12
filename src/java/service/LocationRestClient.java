package service;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import models.Location;

public class LocationRestClient {

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("https://rickandmortyapi.com/api/").path("location");

    Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
    Response response = invocationBuilder.get();

    public LocationRestClient() {
    }

    public Location getLocationById(String id) {

        Location location = target.path(id).request().get(Location.class);

        System.out.println(response.getStatus());
        System.out.println(location);

        return location;
    }

    public List<Location> getAllLocations() {

        Location location = response.readEntity(Location.class);
        List<Location> results = location.getResults();

        System.out.println(response.getStatus());
        System.out.println(results);

        return results;
    }

}
