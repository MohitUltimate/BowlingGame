package BowlingGame;

import java.util.ArrayList;

public class scoreCalculator {
    public static int getScore(ArrayList<String> rolls) {
        int score = 0;
        for (int i = 0; i < rolls.size(); i++) {
            if(!(i==rolls.size()-1 && rolls.get(i-1).equals("/"))) {
                switch (rolls.get(i)) {
                    case "/":
                        if (rolls.get(i + 1).equals("X")) {
                            score += 10 - Integer.parseInt(rolls.get(i - 1)) + 10;
                        } else score += 10 - Integer.parseInt(rolls.get(i - 1)) + Integer.parseInt(rolls.get(i + 1));
                        break;
                    case "X":
                        if (rolls.get(i + 2).equals("/")) {
                            score += 20;
                        } else if (rolls.get(i + 1).equals("X")) {
                            score += 20 + Integer.parseInt(rolls.get(i + 2));
                        } else score += 10 + Integer.parseInt(rolls.get(i + 1)) + Integer.parseInt(rolls.get(i + 2));
                        break;
                    default:
                        score += Integer.parseInt(rolls.get(i));
                        break;
                }
            } else break;
        }
        return score;
    }
}
