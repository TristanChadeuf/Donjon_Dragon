package Cases;
import Character.*;
import db.DataBase;
import java.sql.SQLException;

public class CasesPotion implements Cases{



    public CasesPotion() throws SQLException {

        DataBase DBd = new DataBase();
        DBd.changeHealthPoints(new Personage() {
            @Override
            public void setLevelHealth(int newlevelHealth) {
                super.setLevelHealth(+5);
            }
        });
        System.out.println(" HP + 5 ");

    }
}
