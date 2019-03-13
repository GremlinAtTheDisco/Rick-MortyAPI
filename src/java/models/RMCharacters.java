package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class RMCharacters implements Serializable {

    private List<RMCharacters> results;

    @Id
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    @OneToOne
    private Origin origin;
    @OneToOne
    private Location location;
    private String image;
    private List episode;
    private String created;


    public RMCharacters() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List getEpisode() {
        return episode;
    }

    public void setEpisode(List episode) {
        this.episode = episode;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<RMCharacters> getResults() {
        return results;
    }

    public void setResults(List<RMCharacters> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "RMCharacters{" + "id=" + id + ", name=" + name + ", status=" + status + ", species=" + species + ", type=" + type + ", gender=" + gender + ", origin=" + origin + ", location=" + location + ", episode=" + episode + ", created=" + created + '}';
    }
    
    

}
