package greenFoxRedo;

public class Student extends Person{
    protected String previousOrganization;
    protected int skippedDays;

    public Student(){
        super();
        this.previousOrganization = "The school of life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + " a " + age + " year old " + gender + " from " + this.previousOrganization + " who skipped " + skippedDays + "days from the course already ");
    }
    public void skipDays(int numberOfDays){
        this.skippedDays = numberOfDays;
    }
}
