import java.util.Scanner;

public class REPETITIONTILLV6 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       // System.out.println((storaTalet(3,7)));

     //   System.out.println(siffersSumma(input.nextInt() ));
      //  System.out.println(namn("Kung"));
        //System.out.println(talFoljd(11, 100000));
        System.out.println(summaAvTalUnderTusen(7));




    }

    public static int storaTalet(int A, int B){

        if(A>B){
            return A;
        }
        else if(B>A){
            return B;
        }
  return 0;  }

  public static int siffersSumma(int mane){

      int sum = 0;

    while (mane !=0)
      {
          sum = sum + mane %10;

          mane = mane/10;

      }

      return sum;

  }

  public static String namn(String nameToReverse ){
        String nameBecameReversed = "";

        for(int i = nameToReverse.length() - 1; i >= 0; i--){

            nameBecameReversed = nameBecameReversed + nameToReverse.charAt(i);

        }

        return nameBecameReversed;

  }

  public static double talFoljd(int limitnumber, int totalProduct){
        int sum = 1;

      for(int i = 1; i <limitnumber && sum<totalProduct; i++ ){
         int wallah =  input.nextInt();
         sum *= wallah;

      }



      return sum;

  }

  public static int summaAvTalUnderTusen(int tal){
        int sum = 0;
        for(int i = 0; i<1000; i++){

            if(tal% 10 == 0){
                sum += tal;
            }
        }

        return sum;


  }






}
