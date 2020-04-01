package theGardenApplication;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.addPlants(new Flowers("Yellow", 0));
        garden.addPlants(new Flowers("Blue", 0));
        garden.addPlants(new Trees("Purple", 0));
        garden.addPlants(new Trees("Orange",00));

        System.out.println();

    }
}
