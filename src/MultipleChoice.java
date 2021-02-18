import java.util.ArrayList;

public class MultipleChoice extends Quiz {
    private ArrayList<Answer> answers;

    //Constructor
    //----------
    public MultipleChoice() {
        super();
        answers = new ArrayList<>();
    }

    /*
    public MultipleChoice(String id, String category, String question,
               int timeToAnswer, String picURL, String successMsg, String failureMsg,
               ArrayList<Answer> answer) {
        super(id, category, question, timeToAnswer, picURL, successMsg, failureMsg);
        this.answers = answer;
    } */

    public MultipleChoice(String id, String category, String question,
                          int timeToAnswer, String picURL, String successMsg, String failureMsg) {
        super(id, category, question, timeToAnswer, picURL, successMsg, failureMsg);
        answers = new ArrayList<>();
    }

    //Check given answer
    //-----------------
    public boolean checkAnswer(int questionNumber, boolean answerValue){
        return answers.get(questionNumber-1).getSolution() == answerValue;
    }


    public int numberOfQuestions (){
        return answers.size();
    }

    // Add a single answer to the MultipleChoice - appends to the end of the list
    public void addAnswer(String answerText, Boolean solution) {
        Answer newAnswer = new Answer(answerText, solution);
        answers.add(newAnswer);
    }

    @Override
    public String toString() {
        String result = "Question:\n";
        result += getQuestion() + "\n";
        for(int i=0; i<answers.size(); i++) {
            result += i+1 + ": " + answers.get(i) + "\n";
        }
        return result;
    }

    public String printAnswers() {
        String result = "Question:\n";
        result += getQuestion() + "\n";
        for(int i=0; i<answers.size(); i++) {
            result += i+1 + ": " + answers.get(i).getAnswerText() + " (" + answers.get(i).getSolution() + ")" + "\n";
        }
        return result;
    }

    private class Answer {
        private String answerText;
        private boolean solution;

        public Answer(String answerText, boolean valid){
            this.answerText = answerText;
            this.solution = valid;
        }

        public String getAnswerText() {
            return answerText;
        }

        public void setAnswerText(String answerText) {
            this.answerText = answerText;
        }

        public boolean getSolution() {
            return solution;
        }

        public void setSolution(boolean solution) {
            this.solution = solution;
        }

        @Override
        public String toString() {
            return answerText;
        }
    }
}
