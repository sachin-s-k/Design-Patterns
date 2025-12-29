package creationaldesignpattern.builder.approaches.approachTwo;

public class Client {

    public static void main(String[] args) {

   UserExam userexam = UserExam.getBuilder().
           setName("John").setScienceMarks(40).build();
    }
}
