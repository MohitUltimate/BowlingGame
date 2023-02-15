package BowlingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayList<String> rolls = new ArrayList<>();
        for(int i=0;i<line.split(" ").length;i++){
            rolls.add(line.split(" ")[i]);
        }
        System.out.println(scoreCalculator.getScore(rolls));
    }
}
