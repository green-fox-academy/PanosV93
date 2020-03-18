package teacherStudent;

public class Teacher {
    public void answer(){
        System.out.println("The teacher is answering the question");
    }
    public void teach(Student student){
        student.learn();
    }
}
