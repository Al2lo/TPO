package model;

import java.io.IOException;

public class calculater {
    public static float Sum(float a, float b){
        return a + b;
    }
    public static float Razn(float a, float b){
        return a - b;
    }
    public static float Mult(float a, float b){
        return a * b;
    }
    public static float Devide(float a, float b) throws IOException {
        if (b == 0)
            throw new IOException("Error in znamenatel");
        return a / b;
    }

}
