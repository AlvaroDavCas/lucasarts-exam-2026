package features.domain;


import java.util.ArrayList;

public interface CharacterRepository {

    ArrayList<CharacterModel> findAll();
    public void save();
    public void delete(String characterId);
}
