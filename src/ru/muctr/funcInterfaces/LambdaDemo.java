package ru.muctr.funcInterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface NewInterface<T,V> {
    V calculate(T x);
}

class LambdaDemo{
    public static void main(String[] args) {
        NewInterface<Integer, Double> ni = x -> (double) x/2;
        System.out.println(ni.calculate(9));

        NewInterface<Integer, Double> ni1 = (x) -> (double)2*x;
        System.out.println(ni1.calculate(10));

        Function<Integer, Double> fi = x -> (double) x/2;
        System.out.println(fi.apply(11));

        Predicate<String> pr = x -> x.length() > 10;
        System.out.println(pr.test("Java"));
    }
}