package enemy;

public class Dragon {

    //CREATION DES VARIABLES********************************************************************************************

    private int attack;
    private int levelHealth;

    //GETTERS***********************************************************************************************************

    public int getAttack() {
        return attack;
    }

    public int getLevelHealth() {
        return levelHealth;
    }

    //SETTERS**************************************************************************************
    public int setAttackDragon(int newAttack) {
        this.attack = newAttack;
        return newAttack;
    }

    public int setLevelHealthDragon(int newLevelHealth) {
        this.levelHealth = newLevelHealth;
        return newLevelHealth;
    }

    //CONSTRUCTOR*****************************************************************************************
    public Dragon(int attack, int levelHealth) {

        this.attack = attack;
        this.levelHealth = levelHealth;

    }
    //STRING**************************************************************************************************

    public String toString() {
        return " \n Dragon" + " HP : " + levelHealth + " Attack : " + attack;
    }
}
