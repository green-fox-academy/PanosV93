package sharpie;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(){
        this(null,0,100);
    }

    public Sharpie(String color, float width, float inkAmount){
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }
    public void use(){
        this.inkAmount -= 1;
        System.out.println("After using the pen, the new ink amount is: " + inkAmount);
    }

}
