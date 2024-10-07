package db;

import java.sql.*;

import character.*;


public class DataBase {

    //CONNECTION BDD********************************************************************************************************
    final String DB_URL = "jdbc:mysql://localhost:3306/" + "DD";
    final String USER = "Tristan";
    final String PASS = "1186C76f*,64000";
    Connection conn;
    Statement stmt;

    public DataBase() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (SQLException ignored) {

        }
    }

    //APPEAL POUR TRAFFICKER TOUT LES PERSONAGES DE BDD***********************************************************************
    public void getHeroes() throws SQLException {
        String sql = "SELECT * FROM DD.Character";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {

            System.out.print("ID: " + rs.getInt("id")
                    + " TYPE: " + rs.getString("Type")
                    + " NAME: " + rs.getString("Name")
                    + " LEVEL HEALTH : " + rs.getInt("LevelHealth")
                    + " ATTACK : " + rs.getInt("Attack")
                    + " OFFENSIVE EQUIPMENT : " + rs.getString("OffensiveEquipment")
                    + " DEFENSIVE EQUIPMENT : " + rs.getString("DefensiveEquipment") + "\n");

        }
    }

    //CAREER UN PERSONAGE************************************************************************************************
    public void createHeroes(Personage hero) throws SQLException {

        String sql = "INSERT INTO DD.Character (Type, Name, LevelHealth, Attack, OffensiveEquipment, DefensiveEquipment) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement createHero = conn.prepareStatement(sql);

        createHero.setString(1, hero.getType());
        createHero.setString(2, hero.getName());
        createHero.setInt(3, hero.getLevelHealth());
        createHero.setInt(4, hero.getAttack());
        createHero.setString(5, hero.getOffensiveEquipment());
        createHero.setString(6, hero.getDefensiveEquipment());

        createHero.executeUpdate();
    }

    //RECUPERATE UN HERO****************************************************************************************************
    public void getOneHero(int id) throws SQLException {
        String sql = "SELECT * FROM DD.Character WHERE id = ?";
        PreparedStatement selectHero = conn.prepareStatement(sql);
        selectHero.setInt(1, id);
        ResultSet rs = selectHero.executeQuery();
        while (rs.next()) {
            System.out.print
                    ("ID: " + rs.getInt("id")
                            + " TYPE: " + rs.getString("Type")
                            + " NAME: " + rs.getString("Name")
                            + " LEVEL HEALTH : " + rs.getInt("LevelHealth")
                            + " ATTACK : " + rs.getInt("Attack")
                            + " OFFENSIVE EQUIPMENT : " + rs.getString("OffensiveEquipment")
                            + " DEFENSIVE EQUIPMENT : " + rs.getString("DefensiveEquipment") + "\n");
        }
        selectHero.executeQuery();

    }
    //CHANGE HP*****************************************************************************************

    public void changeHealthPoints(Personage hero) throws SQLException {
        String sql = "UPDATE DD.Character SET LevelHealth = ? WHERE Name = ? ";
        PreparedStatement changeHeroHp = conn.prepareStatement(sql);
        changeHeroHp.setInt(1, hero.getLevelHealth());
        changeHeroHp.setString(2, hero.getName());
        changeHeroHp.executeUpdate();
    }
    //CHANGE ATTACK***************************************************************************************

    public void changeAttack(Personage hero) throws SQLException {
        String sql = "UPDATE DD.Character SET Attack = ? WHERE Name = ? ";
        PreparedStatement changeAttack = conn.prepareStatement(sql);
        changeAttack.setInt(1, hero.getAttack());
        changeAttack.setString(2, hero.getName());
        changeAttack.executeUpdate();
    }
}

