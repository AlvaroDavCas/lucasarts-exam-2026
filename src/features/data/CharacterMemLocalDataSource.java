package features.data;

import features.domain.CharacterModel;

import java.util.ArrayList;
import java.util.Objects;

public class CharacterMemLocalDataSource {

    private static CharacterMemLocalDataSource instance = null;

    private ArrayList<CharacterModel> storage = new ArrayList<>();

    public ArrayList<CharacterModel> findAll() {
        return storage;
    }

    public void save(CharacterModel characterModel) {
        storage.add(characterModel);
    }

    public void delete(String characterId) {
        storage.removeIf(character -> Objects.equals(character.getId(), characterId));
    }

    public void newInstance() {
        if (instance == null) {

        }

    }
}
