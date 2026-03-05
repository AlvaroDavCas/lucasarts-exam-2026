package features.domain;

public class DeleteCharacterUseCase {

    CharacterRepository characterRepository;

    public DeleteCharacterUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void execute(String characterId) {
        CharacterRepository.delete;
    }
}
