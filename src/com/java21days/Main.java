package com.java21days;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello. What's your name?");
        String response = ResponseBuilder.readInput();
        System.out.println("Hello, " + response);
    }
}
