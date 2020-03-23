package greenFox;

public class Person {
    String name;
    int age;
    String gender;

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "Female";

    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String introduce(){
        return "Hi, I am " + this.name + "a " + this.age + "years old " + this.gender;
        //is this. at sout and overkill?
    }

    public String getGoal(){
        return "My goal is: Live for the moment! ";
    }
}
