import java.util.Scanner;

public class REPETITIONTILLV6 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println((storaTalet(3,7)));

        System.out.println(siffersSumma(input.nextInt() ));




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





}
