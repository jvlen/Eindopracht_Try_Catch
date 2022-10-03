class Eexception extends Exception {

    public Eexception() {
    }
}

class roeien {

    boolean uitBootGevallen = false;
    boolean roeiSpaanGevallen = true;

    public String roeien() {
        return("Ik ben aan het roeien!");
    }

    public void checkUitBootGevallen() throws Exception {
         if (uitBootGevallen == true) {
             System.out.println("Ik ben uit de boot gevallen.");
             throw new Exception();
        }
    }

    public void checkRoeiSpaanGevallen() throws Eexception {
        if (roeiSpaanGevallen == true) {
            System.out.println("Mijn roeispaan is gevallen.");
            throw new Eexception();
        }
    }
}



public class Main {
    public static void main(String[] args) {
        try {
            roeien r = new roeien();
            System.out.println(r.roeien());
            r.checkUitBootGevallen();
            r.checkRoeiSpaanGevallen();
        } catch (Eexception checkRoeiSpaanGevallen) {
            System.out.println("Ik raak niet in paniek en blijf rustig zitten.");
        } catch (Exception checkUitBootGevallen) {
            System.out.println("Ik gebruik mijn roeispaan of het gegooide touw om terug in de vlot te komen.");
        } finally {
            System.out.println("Wat er ook is gebeurd, ik moet betalen.");
        }
    }
}
