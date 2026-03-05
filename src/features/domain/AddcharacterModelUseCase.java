package features.domain;

public class AddcharacterModelUseCase {

    CharacterRepository characterRepository;

    public AddcharacterModelUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void execute(CharacterRepository characterRepository) {
        characterRepository.save();
    }
}
