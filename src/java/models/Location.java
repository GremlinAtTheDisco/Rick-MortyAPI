package models;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Location implements Serializable {
    
    
    private List<Location> results;

    private int id;
    private String name;
    private String type;
    private String dimension;
    private List residents;
    private String url;
    private String created;

    public Location(int id, String name, String type, String dimension, List residents, String url, String created) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dimension = dimension;
        this.residents = residents;
        this.url = url;
        this.created = created;
    }

    public Location() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public List getResidents() {
        return residents;
    }

    public void setResidents(List residents) {
        this.residents = residents;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<Location> getResults() {
        return results;
    }

    public void setResults(List<Location> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", name=" + name + ", type=" + type + ", dimension=" + dimension + ", residents=" + residents + ", created=" + created + '}';
    }




    
    

}
