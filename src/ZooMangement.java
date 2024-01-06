import java.util.Scanner;

public class ZooMangement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {

        /*
        ZooMangement zm = new ZooMangement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);
         */

        Scanner sc = new Scanner(System.in);
        boolean saisieValide = false;
        int nbrCagesSaisie = 0;
        do{
            try{
                System.out.println("Veuillez entrer le nombre de cages souhaité :");
                nbrCagesSaisie = sc.nextInt();
                if(nbrCagesSaisie > 0) {
                    saisieValide = true;
                }else {
                    System.out.println("Erreur : Veuillez entrer un nombre entier positif.");
                }


            } catch(java.util.InputMismatchException e){
                System.out.println("Veuillez entrer un entier");
                sc.next(); // Clear the scanner's buffer to avoid an infinite loop
            }
        }while (!saisieValide);

        ZooMangement zm1 = new ZooMangement();
        zm1.nbrCages = nbrCagesSaisie;


        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages);





    }


}
