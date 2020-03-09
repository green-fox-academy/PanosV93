public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInDay = 86400; //60 seconds * 60 min * 24 hours
        int secondsPass = (currentHours * 3600) + (currentMinutes * 60) + currentSeconds;

        int secondsRemaining = secondsInDay - secondsPass ;
        System.out.println(secondsRemaining);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }

}
