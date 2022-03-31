package ru.muctr.generics;

/**
 * @author Evgenia Skichko
 */
public class GenericMethodClass {
    public static void main(String[] args) {
        int a = 5;
        double d = 5.0;
        returnValue(a);
        returnValue(d);
    }

//    private static int returnValue(int a) {
//        return a;
//    }
//
//    private static double returnValue(double a) {
//        return a;
//    }

    private static <T> T returnValue(T a) {
        return a;
    }
}
