package Cases;
import db.*;
import Character.*;
import java.sql.SQLException;

public class CasesWeapon implements Cases {


    public CasesWeapon() throws SQLException {

        String message = toString();
        System.out.println(message);

        DataBase DbAttack = new DataBase();
        DbAttack.changeAttack(new Personage() {
            @Override
            public void setAttack(int newAttack){
                super.setAttack(+5);
            }
        });
        System.out.println(" Attack + 5  ");
   }

    public String toString(){
        return "Vous trouvez une arme";
    }
}
