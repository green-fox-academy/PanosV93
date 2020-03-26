package greenFox;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student(){
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age,String gender, String previousOrganization){
        super(name,age,gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    public String introduce() {
        return "Hi, I'm " + this.name + " a " + this.age + " year old " + this.gender + " from " +this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already";
    }

    @Override
    public String getGoal() {
        return "My goal is: Be a junior software developer";
    }

    public void skipDays(int numberOfDays){
        this.skippedDays = numberOfDays;
    }
}
