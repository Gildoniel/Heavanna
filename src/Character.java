
public class Character{
    private int coolDown = 0; //Rounds Char isn´t available
    private String picUrl, charName; //Url To CharPic
    private int[] stats; // trait Stats

    public Character(String charName, String picUrl, int ruecksichtslos,int betruegerisch,int egoistisch,int faul, int impulsiv, int aggressiv,int intelligent,int humor,int charismatisch,int mutig,int einfuehlsam,int kraeftig) {
        this.stats = new int[]{ruecksichtslos,betruegerisch,egoistisch,faul,impulsiv,aggressiv,intelligent,humor,charismatisch,mutig,einfuehlsam,kraeftig};
        for(int i = 0;i< stats.length;i++){
            setStats(i,stats[i]);
        }
        setPicUrl(picUrl);
        setCharName(charName);
    }

    public String getCharName() {
        return charName;
    }

    private void setCharName(String charName) {
        this.charName = charName;
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

    private void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void plusRuecksichtslos(int ruecksichtslos){ this.setStats(0,(getStats(0)+ruecksichtslos));}

    public void plusBetruegerisch(int betruegerisch){ this.setStats(1,(getStats(1)+betruegerisch));}

    public void plusEgoistisch(int egoistisch){ this.setStats(2,(getStats(2)+egoistisch));}

    public void plusFaul(int faul){ this.setStats(3,(getStats(3)+faul));}

    public void plusImpulsiv(int impulsiv){ this.setStats(4,(getStats(4)+impulsiv));}

    public void plusAggressiv(int aggressiv){ this.setStats(5,(getStats(5)+aggressiv));}

    public void plusIntelligent(int intelligent){ this.setStats(6,(getStats(6)+intelligent));}

    public void plusHumor(int humor){ this.setStats(7,(getStats(7)+humor));}

    public void plusCharismatisch(int charismatisch){ this.setStats(8,(getStats(8)+charismatisch));}

    public void plusMutig(int mutig){ this.setStats(9,(getStats(9)+mutig));}

    public void plusEinfuehlsam(int einfuehlsam){ this.setStats(10,(getStats(10)+einfuehlsam));}

    public void plusKraeftig(int kraeftig){ this.setStats(11,(getStats(11)+kraeftig));}

    public int getStats(int trait){
        return stats[trait];
    }

    public String getStats() {
        String nl = "\n";
        String output = "";
        for (int i = 0;i < stats.length;i++){
            output += TraitList.getTraitName(i)+ ": " + stats[i] + " " + TraitList.getTraitDesc(TraitList.getTraitName(i),stats[i]) + nl;
        }
        return output;
    }

    private void setStats(int trait,int newStat) {
        this.stats[trait] = newStat;
    }

    @Override
    public String toString() {
        String nl = "\n";
        String output = charName + nl;
        output += "CoolDown: " + coolDown + nl;
        output += "picUrl: " + picUrl + nl;
        for (int i = 0;i < stats.length;i++){
            output += TraitList.getTraitName(i)+ ": " + stats[i] + " " + TraitList.getTraitDesc(TraitList.getTraitName(i),stats[i]) + nl;
        }
        return output;
    }
}