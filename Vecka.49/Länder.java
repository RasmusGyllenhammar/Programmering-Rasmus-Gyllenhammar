import java.util.Scanner;

public class Länder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] countries = {"Iceland", "Sweden", "Norway", "Denmark", "Finland"};

        int points = 0;
        for(int i = 0; i < 5; i++){
           String country = input.nextLine();
           for( String nation : countries){
               if(nation.equals(country)){
                   points++;
               }


            }


        }
        System.out.println("Antal rätt : " + points);


        //Gör en kod som ber användaren att lista alla länder i norden och sen kolla om personen har fått alla rätt

    }
}
