package Character;
import java.util.Random;


public class Plateau {

    //INITIALISATION DES VARIABLES**************************************************************************************
    private int total = 0;
    String y = Character.toString( 0x1F332 );
    String i = Character.toString(0x1F4A6);
    String k = Character.toString( 0x1F334);
    //INITIALIATION DES VARIABLES POUR LA COULEUR***********************************************************************
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";


    //LANCEMENT DES GETTERS*********************************************************************************************

    public int getTotal() {
        return total;
    }


    //LANCEMENT DE LA METHODE POUR LE PLATEAU***************************************************************************

        public void plateau() {
            boolean green = false;
            boolean blue = false;
            boolean yellow = false;

            int[] plateau = new int[64];
            while (total <= plateau.length) {
                new java.util.Scanner(System.in).nextLine();
                int dice= 1 + (int) ( Math.random() * 6 );
                total = total + dice;

                if (total >= 1 && total < 20) {
                    if(green == false) {
                        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "YOU ENTER IN THE FOREST !  "+y+y+y+y);
                        green = true;
                    }
                } else if (total >= 20 && total < 40) {
                    if (blue == false) {
                        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK  + "YOU ENTER IN THE SWAMP !   "+i+i+i+i);
                        blue = true;
                    }
                } else if (total >= 40 && total <= 64) {
                    if (yellow == false) {
                        System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "YOU ENTER IN THE DESERT !"+k+k+k+k);
                        yellow = true;
                    }
                }
                if (total >= 64) {
                    total = 64;
                    System.out.println("Your character is on the square " + total + " \n END GAME");
                    break;
                }
                System.out.println("Your character throw the dice \n"+ "HO the dice worth " +dice+ "\n" + "Your character is on the square " + total + "\n");

            }
        }


}



