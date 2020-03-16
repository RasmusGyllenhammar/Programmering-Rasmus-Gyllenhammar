public class bubblesort {

    public static void main(String[] args) {
        int[] array = {1,6, 8, 3};

        bubbelsort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void bubbelsort( int[] array){

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j< array.length-1; j++){

                if(array[j]<array[j+1]){
                    int storage = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = storage;

                }

            }

        }
    }
}
