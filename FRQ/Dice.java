package FRQ;

public class Dice {
     public static void main(String[] args) {

        int dice1 = (int)(Math.random() * 6) + 1;

        int dice2 = (int)(Math.random() * 6) + 1;

        int sum = dice1 + dice2;

        System.out.println("Dice 1 rolled a " + dice1 + ", Dice 2 rolled a " + dice2 + ", the total for both dice is " + sum);

    }
}
