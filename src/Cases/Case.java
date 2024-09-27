package Cases;

    public class Case  implements Cases {

        @Override
        public void CasesEmpty() {
            System.out.println("La case est vide");
        }

        @Override
        public void CasesPotion() {

            System.out.println("Vous trouvez une potion, mais elle est vide...");
        }

        @Override
        public void CasesEnnemi() {

            System.out.println("Graou je suis un ennemi");

        }

        @Override
        public void CasesWeapon() {

            System.out.println("Vous trouvez une arme mais nul");
        }

    }
