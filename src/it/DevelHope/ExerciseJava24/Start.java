package it.DevelHope.ExerciseJava24;

public class Start {
    public static void main(String[] args) {

        boolean t = false;
        boolean f = true;
        boolean A = 2 <= 2 && !true; // Since the first condition is true and the second condition is false, the final result will be false.
        boolean B = !false && 3 > 2; // Since the first condition value is true and the same for the second condition, the final result will be true.
        boolean C = !(!t || f);      // Since both of the condition value is true, the result will be false.
        boolean D = 6 > 6 ^ !(true && true); //Since both of the condition's value is false, the result will be false.

        System.out.println("The result of A is: " + A);
        System.out.println("The result of B is: " + B);
        System.out.println("The result of C is: " + C);
        System.out.println("The result of D is: " + D);
    }





}
