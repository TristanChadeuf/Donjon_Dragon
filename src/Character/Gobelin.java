package Character;

public class Gobelin {

        //CREATION DES VARIABLES****************************************************

        private int attack;
        private int levelHealth;

        //GETTERS*******************************************************************

        public int getAttack(){
            return attack;
        }
        public int getLevelHealth(){
            return levelHealth;
        }

        //SETTERS**************************************************************************************
        public int setAttackGobelin(int newAttack){
            this.attack=newAttack;
            return newAttack;
        }
        public int setLevelHealthGobelin(int newLevelHealth){
            this.levelHealth=newLevelHealth;
            return newLevelHealth;
        }
        //CONSTRUCTEUR*****************************************************************************************
        public Gobelin(int attack, int levelHealth){

            this.attack=attack;
            this.levelHealth=levelHealth;

        }
        //STRING**************************************************************************************************

        public String toString(){
            return " \n Gobelin" + " HP : " + levelHealth + " Attack : "+ attack;
        }
    }

