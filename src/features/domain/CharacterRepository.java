package features.domain;


import java.util.ArrayList;

public interface CharacterRepository {

    ArrayList<CharacterModel> findAll();
}
