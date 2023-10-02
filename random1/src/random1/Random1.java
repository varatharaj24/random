package random1;

import java.util.Random;

public class Random1 {

    public static void main(String[] args) {
        Random in = new Random();
        int x = in.nextInt(7)*100;
       // double y = in.nextDouble();
        //boolean z = in.nextBoolean();
        // System.out.println(x); 
        //System.out.println(y);
        //System.out.println(z);
        System.out.println(x);
        switch (x) {
            case 600:
                System.out.println("king");
                break;
            case 500:
                System.out.println("queen");
                break;
            case 400:
                System.out.println("bishop");
                break;
            case 300:
                System.out.println("rook");
                break;
            case 200:
                System.out.println("knight");
                break;
            case 100:
                System.out.println("pawn");
                break;
            default:System.out.println("out!");
                break;
        }
    }
}
