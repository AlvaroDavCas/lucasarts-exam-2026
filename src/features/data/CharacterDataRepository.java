package features.data;

import features.domain.CharacterModel;
import features.domain.CharacterRepository;

import java.util.ArrayList;

public class CharacterDataRepository implements CharacterRepository {

    private CharacterMemLocalDataSource characterMemLocalDataSource;

    public void CharacterMemLocalDataSource(CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }

    @Override
    ArrayList<CharacterModel> findAll() {
        return characterMemLocalDataSource.findAll();
    }

}
