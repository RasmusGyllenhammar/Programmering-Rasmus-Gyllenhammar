package TillampadProg;

public class test {
    public static void main(String[] args) {
        int minutes = 20;
        int removedMinutes = 50;
        int hours = 0;
        minutes -= removedMinutes;

        if (minutes < 0) {
            hours--;
            minutes += 60;
        } else if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
            System.out.println((hours + minutes) - 45);

            System.out.println(hours + " " + minutes);
        }


    }
}

