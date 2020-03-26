package greenFox;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(){
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    @Override
    public String introduce() {
        return "Hi, I'm " + this.name + " a " + this.age + " year old " + this.gender + " who represents" + this.company + " and hired " + this.hiredStudents + " so far ";
    }

    @Override
    public String getGoal() {
        return "My goal is: Hire brilliant junior software developers ";
    }

    public void hire(){
        this.hiredStudents ++;
    }
}
