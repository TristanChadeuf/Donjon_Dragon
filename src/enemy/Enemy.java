package enemy;

public class Enemy {

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
        public int setAttack(int newAttack) {
            this.attack = newAttack;
            return newAttack;
        }

        public int setLevelHealth(int newLevelHealth) {
            this.levelHealth = newLevelHealth;
            return newLevelHealth;
        }
//CONSTRUCTOR**************************************************************

        public Enemy(int attack, int levelHealth){
            this.attack=attack;
            this.levelHealth=levelHealth;
        }

        //TO STRING********************************************************
    public String toString() {
        return  " HP : " + levelHealth + " Attack : " + attack;

    }
    }
