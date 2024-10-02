package Cases;


public class CasesEmpty  implements Cases {

        public CasesEmpty() {

            String message = toString();
             System.out.println(message);

        }

        public String toString(){
            return "La case est vide";
        }
    }
