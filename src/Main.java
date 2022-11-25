import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Datum[] seznam = {
                new Datum (1, 1, 1970),
                new Datum (17, 11, 2005),
                new Datum (5, 6, 1970),
                new Datum (8, 6, 1970),
                new Datum (22, 12, 2054),
        };

        Arrays.sort(seznam);

        for(Datum d : seznam) {
            System.out.println(d);
        }
    }
}