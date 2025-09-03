public class firststep {
    enum Mois{
        JANVIER, FEVRIER, MARS, AVRIL, MAI, JUIN, JUILLET, AOUT, SEPTEMBRE, OCTOBRE, NOVEMBRE, DECEMBRE
    }
     public static void main(String[] args) {

        Mois m = Mois.valueOf("JANVIER");
        System.out.println(m);

        int[]tableauAffaire ;
        tableauAffaire = new int[]{1,2,3,4,5,6,7,8,9,10};
        tableauAffaire[9] = 1;

        System.out.println(tableauAffaire[9]);
        }
    }
