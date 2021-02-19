import java.util.ArrayList;
import java.util.HashMap;

public class CharacterTrait {
    private String name;  // Name of the character trait
    private HashMap <Integer, String> description; // 5 descriptions
    private ArrayList<TraitRange> traitRanges; // Trait value ranges for 5 descriptions

    public CharacterTrait(String name, HashMap<Integer, String> description, ArrayList<TraitRange> traitRanges) {
        this.name = name;
        this.description = description;
        this.traitRanges = traitRanges;
    }

    public String getDescription(Integer traitValue) {
        TraitRange range;

        for (int i=0; i<traitRanges.size(); i++) {
            range = traitRanges.get(i);
            if (range.getMin() < traitValue && range.getMax() >= traitValue)
                return description.get(range.getValue());
        }
        return ""; // Error: Not found!
    }
}
