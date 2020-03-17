package sharpie;

public class sharpie {
    String color;
    float width;
    float inkAmount;

    public sharpie(){
        this(null,0,100);
    }

    public sharpie(String color, float width, float inkAmount){
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }
    public void use(){
        this.inkAmount -= 1;
        System.out.println("After using the pen, the new ink amount is: " + inkAmount);
    }

}
