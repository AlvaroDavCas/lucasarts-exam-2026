package features.domain;

public class CharacterModel {

    private String id;
    private String height;
    private String genere;
    private String faction;
    private String weapon;

    public CharacterModel(String id, String height, String genere, String faction, String weapon) {
        this.id = id;
        this.height = height;
        this.genere = genere;
        this.faction = faction;
        this.weapon = weapon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
