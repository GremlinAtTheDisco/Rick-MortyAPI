package models;

import java.util.List;
import models.RMCharacters;

public class CharacterList {

    private List<String> results;

    public CharacterList() {
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CharacterList{" + "characters=" + results + '}';
    }

}
