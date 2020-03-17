package oldertasks;

public class Cuboid {
    public static void main(String[] args) {
        int sideA = 5;
        int sideB = 6;
        int sideC = 3;

        int surfaceArea = ((sideA * sideB) + (sideB * sideC) + (sideA * sideC));
        int volume = (sideA * sideB * sideC);

        System.out.println("Surface area is: " + surfaceArea);
        System.out.println("The volume is: " + volume);
    }
}
