package pirates;
import java.util.ArrayList;
import java.util.List;

public class PirateShip {
List<Pirate> crew;
Pirate captain;

public PirateShip(){
    this.crew = new ArrayList();
    }

    public void fillShip(){
    this.captain = new Pirate(true);
    int numberOfPirates = (int) (Math.random() * 35);
        for (int i = 0; i <numberOfPirates ; i++) {
            crew.add(new Pirate());
        }
    }
}

