package variable;

public class Variables {
        // Variables are containers for storing data values
        // 3 types: Instance, local, static.
        // Local variables: Varible declared
        public static void main(String[] args) {
            int x = 50;
            //   System.out.println(x);

            int  y = 10;
            int z = x + y;
            //  System.out.println(y);
            // System.out.println(z);

            if (x + y < 40){
                System.out.println("x + y is less than 40" );
            } else{
                System.out.println(" x + y is greater than 40 ");
            }
            String city = "Lagos";
            if (city == "Abuja"){
                System.out.println("city is Abuja");
            } else if (city == "Mainland"){
                System.out.println("city is Mainland");
            } else {
                System.out.println(city);
            }
        }
    }


