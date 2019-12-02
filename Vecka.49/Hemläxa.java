public class Hemläxa {
    public static void main(String[] args) {

        String[] names = {"Tomas", "Tomas", "Tomas", "Are", "Tomas", "Are", "Tomas", "Are", "Tomas", "Niklas"};

        int years = 0;
        for(String name : names){
            if(name == "Are"){
                years++;
            }
        }

        System.out.println(years);


    }
}
