package org.example;

public class MyGenericClass<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }

    public static void main(String[] args) {

        MyGenericClass<Integer> integerMyGenericClass = new MyGenericClass<>();
        integerMyGenericClass.setValue(9);

        MyGenericClass<String> stringMyGenericClass = new MyGenericClass<>();
        stringMyGenericClass.setValue("Hello generics!");

        MyGenericClass<Double> doubleMyGenericClass = new MyGenericClass<>();
        doubleMyGenericClass.setValue(25.1);

        System.out.println("Generic class with integer:" + " " + integerMyGenericClass.getValue());
        System.out.println("Generic class with string:" + " " + stringMyGenericClass.getValue());
        System.out.println("Generic class with double:" + " " + doubleMyGenericClass.getValue());
    }
}



