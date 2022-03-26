package com.example.springrest;

public class Calculator {
    public String op;
    public float first = 1;
    public   float second = 2;
    public float result;
    public String message = "ok";

    public Calculator(String op, String first, String second){
        this.op = op;
        this.first = Float.parseFloat(first);
        this.second = Float.parseFloat(second);
    }

    public Calculator() {
    }

    public Response calculate(){
        switch (op) {
            case "plus" -> result = (first + second);
            case "minus" -> result =(first - second);
            case "multi" -> result =(first * second);
            case "divide" -> result =(first / second);
            case "pow" -> result =(float) Math.pow(first, second);
            default -> message = "invalid operator";
        }
        return new Response(result, message);
    }

}
