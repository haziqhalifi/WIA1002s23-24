/*
 * week7
 * Author: Haziq Halifi;
 */
package lab;

import java.util.ArrayList;
import java.util.Random;

class queue {

}

public class T7Q4 {

    static int score1 = 0;
    static int score2 = 0;
    static int pre1;
    static int pre2;

    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<>();
        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");

        num.add("Ten");
        num.add("Nine");
        num.add("Eight");
        num.add("Seven");
        num.add("Six");
        num.add("Five");
        num.add("Four");
        num.add("Three");
        num.add("Two");
        num.add("One");

        //Player 1
        MyQueue player1 = new MyQueue();
        System.out.println("player 1 Card");
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int randNum = rand.nextInt(10);
            int randColor = rand.nextInt(4);
            String card = num.get(randNum) + " " + color.get(randColor);
            player1.enqueue(card);
        }
        System.out.println("");
        //Player 2
        MyQueue player2 = new MyQueue();
        System.out.println("Player 2 Card");
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int randNum = rand.nextInt(10);
            int randColor = rand.nextInt(4);
            String card = num.get(randNum) + " " + color.get(randColor);
            player2.enqueue(card);
        }
        System.out.println("");
        //Calculate Score
        calculateScore(player1, player2);

    }

    public static void calculateScore(MyQueue p1, MyQueue p2) {
        for (int i = 0; i < 5; i++) {
            String element = (String) p1.dequeue();
            String[] split = element.split(" ");
            pre1 = precedence(split[0], split[1]);
            element = (String) p2.dequeue();
            split = element.split(" ");
            pre2 = precedence(split[0], split[1]);
            
            //Compare Precedence
            if(pre1 > pre2){
                score1++;
            }
            else if (pre1 < pre2){
                score2++;
            }
        }
        
        System.out.println("Player 1 Score: "+score1);
        System.out.println("Player 2 Score: "+score2);
        if(score1 > score2){
            System.out.println("Player 1 wins!");
        }
        else if( score1 < score2){
            System.out.println("Player 2 wins!");
        }
    }

    public static int precedence(String n, String c) {
        int preC = 0;
        int preN = 0;

        //Color
        if (c.equals("Red")) {
            preC = 4;
        } else if (c.equals("Green")) {
            preC = 3;
        } else if (c.equals("Blue")) {
            preC = 2;
        } else if (c.equals("Yellow")) {
            preC = 1;
        }

        //Number
        if (n.equals("Ten")) {
            preN = 10;
        } else if (n.equals("Nine")) {
            preN = 9;
        } else if (n.equals("Eight")) {
            preN = 8;
        } else if (n.equals("Seven")) {
            preN = 7;
        } else if (n.equals("Six")) {
            preN = 6;
        } else if (n.equals("Five")) {
            preN = 5;
        } else if (n.equals("Four")) {
            preN = 4;
        } else if (n.equals("Three")) {
            preN = 3;
        } else if (n.equals("Two")) {
            preN = 2;
        } else if (n.equals("One")) {
            preN = 1;
        }
        
        return preC + preN;
    }

}
