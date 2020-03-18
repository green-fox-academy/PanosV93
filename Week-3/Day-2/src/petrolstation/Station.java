package petrolstation;

public class Station {
    float gasAmount;

    public void refill(Car car){
        this.gasAmount -= car.capacity;
        car.gasAmmount += car.capacity;


    }
}
