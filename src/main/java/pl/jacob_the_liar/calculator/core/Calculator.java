package pl.jacob_the_liar.calculator.core;

public interface Calculator extends PressNumber {

        void pressNumber(Object number);
        String display();
        String memoryDisplay();
        void add();
        void sub();
        void div();
        void multi();

        void result();

        void clearDisplay();
        void clearEverything();

        void plusMinus();
}
