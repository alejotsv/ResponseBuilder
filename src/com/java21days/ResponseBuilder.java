package com.java21days;

import java.io.BufferedInputStream;
import java.io.IOException;

public class ResponseBuilder {

    static String readInput(){
        StringBuilder response = new StringBuilder();
        try (BufferedInputStream buffer = new BufferedInputStream(System.in)){
            int in;
            char inChar;
            do {
                in = buffer.read();
                inChar = (char) in;
                if (in != -1 && in != '\r' && in != '\n'){
                    response.append(inChar);
                }
            }  while (in != -1 && in != '\r' && in != '\n');
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }
        return response.toString();
    }
}
