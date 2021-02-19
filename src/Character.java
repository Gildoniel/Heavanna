
public class Character {
    private int coolDown; //Rounds Char isn´t available
    private String picUrl, charName; //Url To CharPic
    private static int[] stats; // trait Stats

    public Character(int coolDown,String picUrl, int rücksichtslos,int betrügerisch,int egoistisch,int faul, int impulsiv, int aggressiv,int intelligent,int humor,int charismatisch,int mutig,int einfühlsam,int kräftig,String charName) {
        this.stats = new int[]{rücksichtslos,betrügerisch,egoistisch,faul,impulsiv,aggressiv,intelligent,humor,charismatisch,mutig,einfühlsam,kräftig};
        for(int i = 0;i< stats.length;i++){
            setStats(i,stats[i]);
        }
        setCoolDown(coolDown);
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

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getStats(int trait) {
        return stats[trait];
    }

    public void setStats(int trait,int newStat) {
        this.stats[trait] = newStat;
    }

    @Override
    public String toString() {
        String nl = "\n";
        String output = "CoolDown: " + coolDown + nl;
        output += "picUrl: " + picUrl + nl;
        for (int i = 0;i < stats.length;i++){
            output += TraitList.getTraitName(i)+ ": " + stats[i] + " " + TraitList.getTraitDesc(TraitList.getTraitName(i),stats[i]) + nl;
        }
        return output;
    }
}