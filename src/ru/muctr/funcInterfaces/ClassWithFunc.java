package ru.muctr.funcInterfaces;
/*
 * Способы реализации интерфейса:
 * 1. Имплементация - используется, когда класс обладает своей функциональностью,
 * а имплементация назначит ему одну из ролей.
 */
public class ClassWithFunc implements NewFunctional{
    @Override
    public double getValue() {
        return 0;
    }

    public static void main(String[] args) {
        /*
         * 2. Запись анонимных классов. Минус - много служебных строк кода.
         */
        NewFunctional newf = new NewFunctional() {
            @Override
            public double getValue() {
                return 1000.0;
            }
        };

        NewFunctional newf2 = new NewFunctional() {
            @Override
            public double getValue() {
                return 10.0;
            }
        };
    }
    /*
     * Запись лямбда-выражений.
     */
    NewFunctional newfLambda = () -> 1000.0;
}
