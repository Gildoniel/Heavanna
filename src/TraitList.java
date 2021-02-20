import java.util.ArrayList;
import java.util.HashMap;

public final class TraitList {
    private final static ArrayList<TraitRange> traitRanges = new ArrayList<TraitRange>();
    private final static HashMap <String, CharacterTrait> traitList = new HashMap<String, CharacterTrait>();;
    private final static String[] traitName = {"ruecksichtslos","betruegerisch","egoistisch","faul","impulsiv","aggressiv","intelligent","humor","charismatisch","mutig","einfuehlsam","kraeftig"};


    public TraitList(){
        traitRanges.add(new TraitRange(0, 19, 1));
        traitRanges.add(new TraitRange(19, 39, 2));
        traitRanges.add(new TraitRange(39, 59, 3));
        traitRanges.add(new TraitRange(59, 79, 4));
        traitRanges.add(new TraitRange(79, 100, 5));
        for (int i = 0; i< traitName.length;i++){
            HashMap<Integer, String> traitDesc = new HashMap<Integer, String>();
            traitList.put(traitName[i], new CharacterTrait(traitName[i], traitDesc, traitRanges));
            traitDesc.put(1, "Wenig " + traitName[i]);
            traitDesc.put(2, "Ein bisschen " + traitName[i]);
            traitDesc.put(3, "Etwas " + traitName[i]);
            traitDesc.put(4, "Sehr " + traitName[i]);
            traitDesc.put(5, "Super " + traitName[i]);
        }
    }

    public static String getTraitDesc(String traitName, int stats){
        String output = traitList.get(traitName).getDescription(stats);
        return output;
    }

    public static String getTraitName(int traitname){
        return traitName[traitname];
    }
}
