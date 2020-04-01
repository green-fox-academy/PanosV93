package greenFoxRedo;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    protected String name;
    protected List<Student> students;
    protected List<Mentor> mentors;

    public Cohort(){
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public Cohort(String nameOfCohort) {

    }

    public void addStudent(Student student){
        this.students.add(student);
    }
    public void addMentor(Mentor mentor){
        this.mentors.add(mentor);
    }
    public void info(){
        System.out.println("The " + this.name + " cohort has " + students.size() + " students " + " and " + mentors.size() + " mentors ");
    }

}
