package creationaldesignpattern.builder.approaches.approachone;

public class UserExam {
   private int englishMarks;
  private    int mathsMarks;

   private   int scienceMarks;

   private String name;
   public UserExam(UserExamParameter userExamParameter){
       this.englishMarks = userExamParameter.englishMarks;
       this.mathsMarks = userExamParameter.mathsMarks;
       this.scienceMarks = userExamParameter.scienceMarks;
       this.name = userExamParameter.name;
       System.out.println("UserExam Constructor Called");
   }

}
