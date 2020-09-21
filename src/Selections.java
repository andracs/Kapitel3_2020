import java.awt.*;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 21/09/2020
 */

public class Selections {

    public static void main(String[] args) {

        int hour = 0;
        int minute = 58;

        // if
        if ((hour >= 9) && (hour < 15)) { System.out.println("Du er  i skole"); }
        else { System.out.println("Du er ikke i skole"); }

        if (hour == 0) System.out.println("Det midnat");

        // switch

        String color = "lila";
        int tal = 0;

        switch (color) {
            case "red":
                System.out.println("En rød sportsvogn.");
                break;
            case "green":
                System.out.println("En grøn offroader");
                break;
            default:
                System.out.println("En eller anden random bil. ");
        }

    }

}
