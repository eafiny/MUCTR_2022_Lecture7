package ru.muctr.generics;

/**
 * @author Evgenia Skichko
 */
public class GenericDemo {
    public static void main(String[] args) {
//        simpleBoxDemo();
//        genericBoxDemo();
        genericNumberBoxDemo();
        covarianceDemo();

    }

    private static void covarianceDemo() {
        Integer[] intArray = new Integer[]{2,3,4};  //ковариантность
        Number[] numberArray = intArray;

        GenericNumberBox<Integer> box1 = new GenericNumberBox<>(5); //инвариантность
//        GenericNumberBox<Number> box2 = box1;
    }

    private static void genericNumberBoxDemo() {
        GenericNumberBox<Integer> box1 = new GenericNumberBox<>(5);
        GenericNumberBox<Double> box2 = new GenericNumberBox<>(5.0);
        System.out.println(sumNumbers(box1, box2));
    }

    private static double sumNumbers(GenericNumberBox<? extends Number> box1, GenericNumberBox<? extends Number> box2) {
        return box1.getObj().doubleValue() + box2.getObj().doubleValue();
    }

    private static void genericBoxDemo() {
        GenericBox<Integer> box1 = new GenericBox<>(2);
        GenericBox<Integer> box2 = new GenericBox<>(3);
        GenericBox<Integer> box3 = new GenericBox<>();

        box3.setObj(box1.getObj() + box2.getObj());
        System.out.println(box3.getObj());

        GenericBox<String> str1 = new GenericBox<>("java");
        str1.getObj().contains("j");

    }

    private static void simpleBoxDemo() {
        SimpleBox box1 = new SimpleBox(10);
        SimpleBox box2 = new SimpleBox(5);
        SimpleBox box3 = new SimpleBox();

        box2.setObj("java");
        if(box1.getObj() instanceof Integer && box2.getObj() instanceof Integer) {
            box3.setObj((int) box1.getObj() + (int) box2.getObj());
            System.out.println(box3.getObj());
        }
    }
}
