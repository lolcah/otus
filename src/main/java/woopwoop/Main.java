package woopwoop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(test());
    }
    private static double test(){
        Random r = new Random();
        return r.nextDouble();
    }
}
