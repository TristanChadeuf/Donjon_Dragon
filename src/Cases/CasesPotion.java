package Cases;
import Character.*;
import db.DataBase;

import java.sql.SQLException;

public class CasesPotion implements Cases{

    public void CasesPotion() throws SQLException {

        DataBase DBd = new DataBase();
        DBd.changeHealthPoints(new Personage() {
        });
        System.out.println("HP 10 > 15 !");


        String message = toString();
        System.out.println(message);
    }
    public String toString(){
        return "Vous trouvez une potion, mais elle est vide...";
    }
}
