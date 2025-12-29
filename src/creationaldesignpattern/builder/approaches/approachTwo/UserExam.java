package creationaldesignpattern.builder.approaches.approachTwo;

public class UserExam {
   private int englishMarks;
  private    int mathsMarks;

   private   int scienceMarks;

   private String name;
  private UserExam(){

  }

  public static UserExamBuilder getBuilder(){
    return new UserExamBuilder();
  }

    public static class UserExamBuilder {
        public int englishMarks;
        public   int mathsMarks;
        public  int scienceMarks;


        public String name;

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public UserExam  build(){
            //1. validate the attributes
            if(englishMarks>100||mathsMarks>100||scienceMarks>100){
                throw  new RuntimeException("Invalid parameters");
            }
            if(name==null){
                throw  new RuntimeException("Invalid parameters");

            }

            if(mathsMarks+englishMarks>100){
                throw  new RuntimeException("Invalid parameters");
            }

            //2. create parent object
    UserExam userExam = new UserExam();
    userExam.englishMarks = this.englishMarks;
    userExam.mathsMarks = this.mathsMarks;
    userExam.scienceMarks = this.scienceMarks;
    userExam.name = this.name;
return userExam;
        };




    }


}
