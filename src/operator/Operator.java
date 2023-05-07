package operator;

public class Operator {
    //operators are used to perform operations on variables and values.
    //java divides the operators into follow groups
    // - Arithmetic operators
    // %, ++ 2++ = 2 + 1, -- 3-- = 3-1,
    // - Assignment operators: Assignment operators are used to assign values to variables.
    // x = 10,
    // +=, -=,*=, &=, !=
    //Comparison operator: they are used to compare two values or variables
    // <,>,>=,<=,!=,==
    //Logical operators: used to determine the logic between variables or values
    // &&,||, !
    public static void main(String[] args) {
        int x = 4;
        if (!(x < 5) && x < 10) {
            System.out.println(true);
        }

    }
}
