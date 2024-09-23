package Character;
import java.util.Random;
import Character.Personage;

public class Plateau {
    private int total = 0;

    //LANCEMENT DES GETTERS*********************************************************************************************

    public int getTotal(){
        return total;
    }
//**********************************************************************************************************************
    public void plateau() {
        int[] plateau = new int[64];

        while(total <= plateau.length){
            Random randomNumbers = new Random();
            total = total + (randomNumbers.nextInt(6)+1);
            System.out.println( "Your character is on the square "+total);

            }

        }

    }


