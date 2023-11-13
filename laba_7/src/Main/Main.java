package Main;

import model.calculater;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            String c = in.nextLine();
            if(c.equals(""))
                break;
            switch (c.split(" ")[1]) {
                case "+":
                    System.out.println("result: " + calculater.Sum(Float.parseFloat(c.split(" ")[0]), Float.parseFloat(c.split(" ")[2])));
                    break;
                case "-":
                    System.out.println("result: " +calculater.Razn(Float.parseFloat(c.split(" ")[0]), Float.parseFloat(c.split(" ")[2])));
                    break;
                case "*":
                    System.out.println("result: " +calculater.Mult(Float.parseFloat(c.split(" ")[0]), Float.parseFloat(c.split(" ")[2])));
                    break;
                case "/":
                    System.out.println("result: " +calculater.Devide(Float.parseFloat(c.split(" ")[0]), Float.parseFloat(c.split(" ")[2])));
                    break;
                default:
                    loop = false;
                    break;
            }
        }

    }
}