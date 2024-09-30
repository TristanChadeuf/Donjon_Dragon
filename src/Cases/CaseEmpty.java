package Cases;

    public class CaseEmpty  implements Cases {

        public void CasesEmpty() {

            String message= toString();
             System.out.println(message);

        }

        @Override
        public void CasesEnnemi() {

        }

        @Override
        public void CasesWeapon() {

        }

        @Override
        public void CasesPotion() {

        }

        public String toString(){
            return "La case est vide";
        }
    }
