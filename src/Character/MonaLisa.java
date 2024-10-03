package Character;

public class MonaLisa {

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
        public int setAttackMonaLisa(int newAttack){
            this.attack=newAttack;
            return newAttack;
        }
        public int setLevelHealthMonaLisa(int newLevelHealth){
            this.levelHealth=newLevelHealth;
            return newLevelHealth;
        }
        //CONSTRUCTEUR*****************************************************************************************
        public MonaLisa(int attack, int levelHealth){

            this.attack=attack;
            this.levelHealth=levelHealth;

        }
        //STRING**************************************************************************************************

        public String toString(){
            return " \n Mona Lisa" + " HP : " + levelHealth + " Attack : "+ attack;
        }
    }



