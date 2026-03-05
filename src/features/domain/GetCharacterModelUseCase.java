package features.domain;

import features.data.CharacterMemLocalDataSource;

import java.util.ArrayList;

public class GetCharacterModelUseCase {

    CharacterRepository characterRepository;

    public GetCharacterModelUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void execute(){
        ;
    }
}
