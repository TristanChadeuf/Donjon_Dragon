import Character.Menu;
import Character.Plateau;
public class Main {

    
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();

        Plateau plateau = new Plateau();
        plateau.plateau();
    }

}