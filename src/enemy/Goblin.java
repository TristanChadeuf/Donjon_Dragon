package enemy;

public class Goblin {

    // VARIABLES********************************************************************************************************

    private int attack;
    private int levelHealth;

    //GETTERS***********************************************************************************************************

    public int getAttack() {
        return attack;
    }

    public int getLevelHealth() {
        return levelHealth;
    }

    //SETTERS***********************************************************************************************************
    public int setAttackGoblin(int newAttack) {
        this.attack = newAttack;
        return newAttack;
    }

    public int setLevelHealthGoblin(int newLevelHealth) {
        this.levelHealth = newLevelHealth;
        return newLevelHealth;
    }

    //CONSTRUCTOR*******************************************************************************************************
    public Goblin(int attack, int levelHealth) {

        this.attack = attack;
        this.levelHealth = levelHealth;

    }
    //TO STRING*********************************************************************************************************

    public String toString() {
        return " \n Gobelin" + " HP : " + levelHealth + " Attack : " + attack;
    }
}

