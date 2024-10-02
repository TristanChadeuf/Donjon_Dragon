package db;
import java.sql.*;
import Character.*;



public class DataBase {

//CONNECTION BDD********************************************************************************************************
    final String DB_URL = "jdbc:mysql://localhost:3306/" + "DD";
    final String USER = "Tristan";
    final String PASS = "1186C76f*,64000";
    Connection conn;
    Statement stmt;

    public  DataBase() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//APPEL POUR AFFICHER TOUT LES PERSONNAGES DE BDD***********************************************************************
    public void getHeroes() throws SQLException {
        String sql = "SELECT * FROM DD.Character";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {

            System.out.print("ID: " + rs.getInt("id")
                    + " TYPE: " + rs.getString("Type")
                    + " NAME: " + rs.getString("Name")
                    + " LEVELHEALTH : " + rs.getInt("LevelHealth")
                    + " ATTACK : " + rs.getInt("Attack")
                    +  " OFFENSIVE EQUIPMENT : " + rs.getString("OffensiveEquipment")
                    + " DEFENSIVE EQUIPMENT : " + rs.getString("DefensiveEquipment")+ "\n");

        }
    }
    //CREER UN PERSONAGE************************************************************************************************
    public void createHeroes(Personage heros) throws SQLException {

        String sql = "INSERT INTO DD.Character (Type, Name, LevelHealth, Attack, OffensiveEquipment, DefensiveEquipment) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, heros.getType());
        pstmt.setString(2, heros.getName());
        pstmt.setInt(3, heros.getLevelHealth());
        pstmt.setInt(4, heros.getAttack());
        pstmt.setString(5, heros.getoffensiveEquipment());
        pstmt.setString(6, heros.getdefensiveEquipment());

        pstmt.executeUpdate();
    }
//RECUPERER UN HEROS****************************************************************************************************
    public ResultSet getOneHero (int id) throws SQLException {
        String sql = "SELECT * FROM DD.Character WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.print
                    ("ID: " + rs.getInt("id")
                            + " TYPE: " + rs.getString("Type")
                            + " NAME: " + rs.getString("Name")
                            + " LEVELHEALTH : " + rs.getInt("LevelHealth")
                            + " ATTACK : " + rs.getInt("Attack")
                            +  " OFFENSIVE EQUIPMENT : " + rs.getString("OffensiveEquipment")
                            + " DEFENSIVE EQUIPMENT : " + rs.getString("DefensiveEquipment")+ "\n");
        }
        return pstmt.executeQuery();

    }
    //CHANGER LES HP D'UN PERSO*****************************************************************************************

    public void changeHealthPoints (Personage heros) throws SQLException {
        String sql = "UPDATE DD.Character SET LevelHealth = ? WHERE Name = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, heros.getLevelHealth());
        pstmt.setString(2, heros.getName());
        pstmt.executeUpdate();
    }
    //CHANGER L'ATTACK D'UN PERSO***************************************************************************************

    public void changeAttack(Personage heros) throws SQLException {
        String sql = "UPDATE DD.Character SET Attack = ? WHERE Name = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, heros.getAttack());
        pstmt.setString(2, heros.getName());
        pstmt.executeUpdate();
    }
}

