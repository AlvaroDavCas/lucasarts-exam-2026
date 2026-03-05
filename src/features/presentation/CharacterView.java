package features.presentation;

import features.data.CharacterDataRepository;
import features.data.CharacterMemLocalDataSource;
import features.domain.CharacterModel;
import features.domain.GetCharacterModelUseCase;

import java.util.ArrayList;

public class CharacterView {

    public static void printCharacters () {
        GetCharacterModelUseCase getCharacterModelUseCase = new GetCharacterModelUseCase(new CharacterDataRepository(CharacterMemLocalDataSource.newInstance()));
        ArrayList<CharacterModel> characterModels = getCharacterModelUseCase.execute();
        System.out.println(characterModels);
    }
}
