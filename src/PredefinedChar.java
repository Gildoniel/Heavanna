public enum PredefinedChar {
    Adolf(new Character("Adolf","/project",19,20,29,30,39,40,49,50,59,60,69,70)),

    Chuck(new Character("Chuck","/project",10,10,10,10,10,10,10,10,10,10,10,10)),

    Hawki(new Character("Hawki","/project",10,10,10,10,10,10,10,10,10,10,10,10)),

    Thrump(new Character("Thrump","/project",10,10,10,10,10,10,10,10,10,10,10,10)),

    Alexei(new Character("Alexei","/project",10,10,10,10,10,10,10,10,10,10,10,10)),

    PinkyBrain(new Character("PinkyBrain","/project",10,10,10,10,10,10,10,10,10,10,10,10)),
    ;


    private Character character;
    PredefinedChar(Character character) {
        this.character = character;
    }

    public Character getCharacter(){
        return character;
    }

    public void plusRuecksichtslos(int ruecksichtslos){ character.plusRuecksichtslos(ruecksichtslos);}

    public void plusBetruegerisch(int betruegerisch){ character.plusBetruegerisch(betruegerisch);}

    public void plusEgoistisch(int egoistisch){ character.plusEgoistisch(egoistisch);}

    public void plusFaul(int faul){ character.plusFaul(faul);}

    public void plusImpulsiv(int impulsiv){ character.plusImpulsiv(impulsiv);}

    public void plusAggressiv(int aggressiv){ character.plusAggressiv(aggressiv);}

    public void plusIntelligent(int intelligent){ character.plusIntelligent(intelligent);}

    public void plusHumor(int humor){ character.plusHumor(humor);}

    public void plusCharismatisch(int charismatisch){ character.plusCharismatisch(charismatisch);}

    public void plusMutig(int mutig){ character.plusMutig(mutig);}

    public void plusEinfuehlsam(int einfuehlsam){ character.plusEinfuehlsam(einfuehlsam);}

    public void plusKraeftig(int kraeftig){ character.plusKraeftig(kraeftig);}
}
