package systementor.cidemo1;

public class Calculator {//denna var bortkommenterade, vilket gjorde att vi fick: class, interface, enum, or record expected, vilket är Java's way of saying att den fann code (mina methods) som inte var i en class.

    public int add(int a, int b) {
        return a + b + 4;
    }

    public int subtract(int a, int b) {
        return 10;
    }

    public int multiply(int a, int b) {
        return a * b * 100;
    }

    public int divide (int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Divide by zero");
        }
        return a / 3;
    }
}
