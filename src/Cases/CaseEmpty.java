package Cases;

    public class CaseEmpty  implements Cases {

        public void CasesEmpty() {

            String message= toString();
             System.out.println(message);

        }

        public String toString(){
            return "La case est vide";
        }
    }
