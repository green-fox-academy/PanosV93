package pirates;

public class Pirate {
    enum Status {DEAD, ALIVE, PASSED_OUT};

    int rumsDrank;
    Status status;
    boolean hasDrankRum;
    boolean hasParrot;

    public Pirate(){
        this.rumsDrank = 0;
        this.status = Status.ALIVE;
        this.hasDrankRum = false;
        this.hasParrot = false;
    }
    public Pirate(Boolean hasParrot){
        this.hasParrot = hasParrot;
    }

    public void drinkSomeRum(){
        this.rumsDrank ++;
        this.hasDrankRum = true;
        System.out.println("Intoxicates the pirate some...");
        if (rumsDrank >= 7){
            this.status = Status.PASSED_OUT;
        }
        else if (rumsDrank >= 15){
            this.status = status.DEAD;
        }
    }

    public void howsItGoingMate(){
        if (rumsDrank <= 4){
            System.out.println("Pour me anudder!");
        } else {
            System.out.println( "Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die(){
        this.status = Status.DEAD;
        System.out.println("He's dead...");
    }

    public void brawl(){

    }
}
