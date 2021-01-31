package com.company;

// Конструкторы
class MyConstructor{
    int i;
    MyConstructor(int i){ //Конструктор 1
        this.i=i;
        System.out.println("int?");
    }
    MyConstructor(String s){ //Конструктор 2
        System.out.println("String "+s);
    }
    MyConstructor(){ //Конструктор 3
        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {
        MyConstructor с1 = new MyConstructor();
        MyConstructor с2 = new MyConstructor("Tom");
        MyConstructor с3 = new MyConstructor(3);
        // write your code here
    }
}
