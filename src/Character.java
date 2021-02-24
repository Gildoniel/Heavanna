import java.util.HashMap;

public class Character {
    private String name;
	private HashMap<String, Integer> characterTraits; // speichert Character Traits :)
	private int coolDown;
	private String picUrl;
	private HashMap<String, CharacterTrait> traitList;

	public Character(String name, HashMap<String, Integer> characterTraits, int cooldown,
			String picUrl, HashMap<String, CharacterTrait> traitList) {
			this.name = name;
			this.characterTraits = characterTraits;
			this.coolDown = cooldown;
			this.picUrl = picUrl;
			this.traitList = traitList;
	}

    public int getTrait(String trait){
		return getCharacterTraits().get(trait);
	}

	public HashMap<String, Integer> getCharacterTraits() {
        return characterTraits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterTraits(HashMap<String, Integer> characterTraits) {
        this.characterTraits = characterTraits;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public HashMap<String, CharacterTrait> getTraitList() {
        return traitList;
    }

    public void setTraitList(HashMap<String, CharacterTrait> traitList) {
        this.traitList = traitList;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", characterTraits=" + characterTraits +
                ", cooldown=" + coolDown +
                ", picUrl='" + picUrl + '\'' +
                ", traitList=" + traitList +
                '}';
    }
}