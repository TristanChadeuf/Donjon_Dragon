package game;
import java.sql.SQLException;
import db.DataBase;
import java.util.Scanner;
import character.*;

public class Menu {
    public static final String PURPLE_BOLD = "\033[1;35m";

    public Menu() throws SQLException {

            int choice = 0;

            Scanner clavier = new Scanner(System.in);
            while(choice != 1 && choice != 2 ) {
                System.out.print(PURPLE_BOLD+"New game ? : Yes = 1 or No = 2");
                choice = clavier.nextInt();
                clavier.nextLine();
                if (choice == 1) {
                    System.out.println("Game started");

                } else if (choice == 2) {
                    System.out.println("End Game");
                    clavier.close();

                }else {

                    System.out.println("...");
                }
            }
             choice = 0;

            while(choice != 1 && choice != 2 && choice != 3 ){
                System.out.print("Watch the Hero save ? : Yes = 1 or  No = 2 ");
                choice = clavier.nextInt();
                if (choice == 1){
                    DataBase DB = new DataBase();
                    DB.getHeroes();
                }else if(choice == 2){
                    System.out.println("Press enter");
                }
            }
            choice = 0;

            while(choice != 1 && choice != 2 && choice != 3 && choice !=4 ) {
                System.out.print("Choice your personage : Warrior = 1 or  Mage = 2  or Hero Save = 3 or Quit = 4");
                choice = clavier.nextInt();
                if (choice == 2) {
                    DataBase DBa = new DataBase();
                    DBa.createHeroes(new Mage());
                    Personage mage = new Mage();
                    System.out.println("Start of the game with" + "\n"+mage);
                } else if (choice == 1) {
                    DataBase DBb = new DataBase();
                    DBb.createHeroes(new Warrior());
                    Personage warrior = new Warrior();
                    System.out.println("Start of the game with "+warrior);

                }else if (choice == 4){
                    System.out.println("End Game");
                    clavier.close();
                }else if (choice == 3){
                    System.out.println("Write the id of Hero");
                    int id = clavier.nextInt();
                    DataBase DBc = new DataBase();
                    DBc.getOneHero(id);
                }
            }

        }
}
