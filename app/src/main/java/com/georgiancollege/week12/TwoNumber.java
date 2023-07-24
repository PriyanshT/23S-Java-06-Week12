package com.georgiancollege.week12;

public class TwoNumber {
    // variables
    private int number1;
    private int number2;

    // constructor
    public TwoNumber(int number1, int number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    // setters and getters
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        if(number1 < 0){
            throw new IllegalArgumentException("Number 1 cannot be negative.");
        } else {
            this.number1 = number1;
        }
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        if(number2 < 0){
            throw new IllegalArgumentException("Number 2 cannot be negative.");
        } else {
            this.number2 = number2;
        }
    }

    // methods
    public int sum(){
        return number1 + number2;
    }

    @Override
    public String toString() {
        return "TwoNumber{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
