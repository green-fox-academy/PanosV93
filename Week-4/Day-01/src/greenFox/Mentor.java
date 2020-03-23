package greenFox;

public class Mentor extends Person {
    String level;

    public Mentor(){
        super();
        this.level = "Intermediate";
    }

    public Mentor(String name, int age, String gender, String level){
        super(name,age,gender);
        this.level = level;
    }

    @Override
    public String introduce() {
        return "Hi, I'm " + this.name + "a " + this.age + "year old " + this.gender + this.level + "mentor ";
    }

    @Override
    public String getGoal() {
        return "Educate brilliant junior software developers";
    }
}
