package animal;

public class animal {
    int hunger;
    int thirst;

    public animal() {
        this(50,50);
    }

    public animal (int hunger, int thirst){
        this.hunger = hunger;
        this.thirst = thirst;
    }
    public void eat(){
        this.hunger -= 1;
        System.out.println("After eating, hunger level is: " + hunger);
    }
    public void drink(){
        this.thirst -=1;
        System.out.println("After drinking, thirst level is: " + thirst);
    }
    public void play() {
        this.hunger += 2;
        this.thirst += 2;
        System.out.println("After playing, hunger and thirst level are: " +"Hunger: " + hunger + "\nThirst: " + thirst);
    }
}
