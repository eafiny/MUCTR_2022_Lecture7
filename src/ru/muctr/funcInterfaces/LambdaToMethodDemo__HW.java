package ru.muctr.funcInterfaces;

import java.util.function.Function;

class LambdaToMethodDemo_Array {
    /**
     *
     * @param fu - интерфейсная ссылка Function<T,V>
     * @param arr - массив, с которым будет работать метод fu
     * @return - параметр V (в данном случае это Integer)
     */
    static int calculateArray(Function<Integer[],Integer> fu, Integer[] arr){
        return fu. apply(arr);   //выполнить метод, записанный в переданном лямбда-выражении
    }

    public static void main(String[] args) {
//      Лямбда-выражение sint - блочное, рассчитывает сумму элементов массива.
        Function<Integer[], Integer> sint = x -> {
            int sum = 0;
            for (int i = 0; i < x.length; i++){
                sum += x[i];
            }
            return sum;
        };
        Integer[] arr = new Integer[]{4,1,2};
        System.out.println(calculateArray(sint, arr));
    }
}
