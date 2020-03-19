package petrolstation;

public class Main {
    public static void main(String[] args) {
        Station gasstation = new Station();
        gasstation.gasAmount = 5000;
        Car SUV = new Car();
        gasstation.refill(SUV);
        System.out.println("The amount of gasoline liters left at the Gas station is: " + gasstation.gasAmount);
        System.out.println("The amount of liters of gasoline in the car's tank is: " + SUV.gasAmmount);

    }
}
