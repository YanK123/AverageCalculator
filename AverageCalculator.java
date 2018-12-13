package yo;

public class AverageCalculator {
        public static void main(String[] args) {
            int a = 5;
            int b = 9;
            int a1 = 1;
            int b1 = 2;
            int a2 = 100000000;
            int b2 = 200000000;

            int avg = (a + b) / 2 + (a+b)%2 / 2 ;
            int avg1 = (a1 + b1) / 2 + (a1+b1) %2 / 2;
            int avg2 = (a2 + b2) / 2 + (a2+b2) % 2 / 2 ;

            System.out.println("avg = " + avg);
            System.out.println("avg = " + avg1);
            System.out.println("avg = " + avg2);
        }
    }
    
