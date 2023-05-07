package loop;

public class Calculation {
    // For loop
    public static void main(String[] args) {
        //for (int i = n; i <=n; i++)
        int sum = 0;
        for(int i = 1; i<=10;i = i + 1) {
            sum = sum + i;
        }
        System.out.println(" the sum of first 10 numbers is" + sum);
        System.out.println( "==============================");
       int i;
        for(i = 1; i < 10; i = i + 2){
            System.out.println(i);
        }
        System.out.println("===============================");
        // While loop
        int j = 0;
        while (j < 20){
            System.out.println(j);
            j++;
            System.out.println("========================================");
        }
        // Do While
        int a = 0;
        do{
            System.out.println(a);
            a++;
        } while (a > 5);
        System.out.println("============================");

        // For each
//        String[] names = {"Ade","Sola","lola","Tola"};
//       for(String z : names){
//            System.out.println(z);
//        }
    }

}
