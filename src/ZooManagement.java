import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {

        /*
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);
         */

        Scanner scNbr = new Scanner(System.in);
        Scanner scNom = new Scanner(System.in);

        boolean saisieNbrValide = false;
        boolean saisieNomValide = false;

        int nbrCagesSaisie = 0;
        String zooNameSaisie = "";
        do{
            try{
                //check if nbrCage is valid:
                System.out.println("Veuillez entrer le nombre de cages souhaité :");
                nbrCagesSaisie = scNbr.nextInt();
                if(nbrCagesSaisie > 0) {
                    saisieNbrValide = true;
                }else {
                    System.out.println("Erreur : Veuillez entrer un nombre entier positif.");
                }

                //Check if nomZoo is Valid:
                System.out.println("Veuillez entrer le nom du Zoo souhaité :");
                zooNameSaisie = scNom.nextLine();
                if(!zooNameSaisie.isBlank()){
                    saisieNomValide = true;
                }else {
                    System.out.println("Erreur, veuillez entrer un Nom valide");
                }

            } catch(java.util.InputMismatchException e){
                System.out.println("Veuillez entrer un entier");
                scNbr.next(); // Clear the scanner's buffer to avoid an infinite loop
                scNom.next(); // Clear the scanner's buffer to avoid an infinite loop
            }
        }while (!saisieNbrValide || !saisieNomValide);

        // Close the Scanners
        scNbr.close();
        scNom.close();

        // Create the ZooManagement instance after input validation
        ZooManagement zm1 = new ZooManagement();
        zm1.nbrCages = nbrCagesSaisie;
        zm1.zooName = zooNameSaisie;

        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages);
    }
}
