public abstract class Quiz {
    private String id;
    private String category;
    private String question;
    private int timeToAnswer;
    private String picURL;
    private String successMsg;
    private String failureMsg;


    //Constructor
    //----------
    public Quiz(){
        
    }
    public Quiz(String id, String category, String question,
               int timeToAnswer, String picURL, String successMsg, String failureMsg){
        this.id = id;
        this.category = category;
        this.question = question;
        this.timeToAnswer = timeToAnswer;
        this.picURL = picURL;
        this.successMsg = successMsg;
        this.failureMsg = failureMsg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getTimeToAnswer() {
        return timeToAnswer;
    }

    public void setTimeToAnswer(int timeToAnswer) {
        this.timeToAnswer = timeToAnswer;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    public String getSuccessMsg() {
        return successMsg;
    }

    public void setSuccessMsg(String successMsg) {
        this.successMsg = successMsg;
    }

    public String getFailureMsg() {
        return failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", question='" + question + '\'' +
                ", timeToAnswer=" + timeToAnswer +
                ", picURL='" + picURL + '\'' +
                ", successMsg='" + successMsg + '\'' +
                ", failureMsg='" + failureMsg + '\'' +
                '}';
    }
}
