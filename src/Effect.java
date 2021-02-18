public class Effect{
    private String quizId;
    private boolean succes;
    private int occuredOnTurn;

    //Constructor
    //----------
    public Effect(String quizId, boolean succes){
        this.quizId = quizId;
        this.succes = succes;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public boolean isSucces() {
        return succes;
    }

    public void setSucces(boolean succes) {
        this.succes = succes;
    }

    public int getOccuredOnTurn() {
        return occuredOnTurn;
    }

    public void setOccuredOnTurn(int occuredOnTurn) {
        this.occuredOnTurn = occuredOnTurn;
    }

    @Override
    public String toString() {
        return "Effect{" +
                "quizId='" + quizId + '\'' +
                ", succes=" + succes +
                ", occuredOnTurn=" + occuredOnTurn +
                '}';
    }
}