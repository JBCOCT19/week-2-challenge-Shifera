import java.util.Random;
import java.util.Scanner;

public class RobotBurritos {
    public static void main (String[] args) {
       //String[]robot = new String[10];

        Random r= new Random();
        String[] rice = {"white", "brown", "no rice"};
        int burrito1 = r.nextInt(3);
        int burrito2 = r.nextInt(3);
        String[] meat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        int burrito3 =  r.nextInt(6);
        int burrito4 = r.nextInt(3);
        String[] beans = {"pinto", "black", "no beans"};
        int burrito5 =  r.nextInt(3);
        int burrito6 = r.nextInt(3);
        String[] salsa = {"mild", "medium", "hot", "no salsa"};
        int burrito7 =  r.nextInt(4);
        int burrito8 = r.nextInt(3);
        String[] veggies = {"lettuce", "fajita", "veggies", "no veggies"};
        int burrito9 =  r.nextInt(4);
        int burrito10 = r.nextInt(3);

        /*int burrito1 = r.nextInt(10);
        int burrito2 =  r.nextInt(10);
        int burrito3 =  r.nextInt(10);
        int burrito4 = r.nextInt(10);
        int burrito5 =  r.nextInt(10);
        int burrito6 =  r.nextInt(10);
        int burrito7 = r.nextInt(10);
        int burrito8 = r.nextInt(10);
        int burrito9 =  r.nextInt(10);
        int burrito10 =  r.nextInt(10);*/

        String[]burrito = {rice[burrito1],meat[burrito2], beans[burrito3], salsa[burrito4], veggies[burrito5]};
        for(String x: burrito) {
            System.out.println(x );
        }
        for(String y: burrito) {
            System.out.println(y);
        }
    }
}
