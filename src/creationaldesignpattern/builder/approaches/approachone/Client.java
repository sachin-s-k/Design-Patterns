package creationaldesignpattern.builder.approaches.approachone;

public class Client {

    public static void main(String[] args) {
        UserExamParameter userExamParameter = new UserExamParameter();
        userExamParameter.englishMarks=30;

        userExamParameter.name="mosh";


        UserExam userExam = new UserExam(userExamParameter);


    }
}
