import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main (String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String preamblePuzle = "A word from the theme vegetables and fruits is hidden. Guess it.";
        String preambleFirst = "Your answer: ";
        guessHidenWord(words, preamblePuzle);
    }

    public static void guessHidenWord (String[] arr, String preamblePuzle) {
        Random random = new Random();
        int hiddenNumberArray = random.nextInt(arr.length);
        System.out.println(hiddenNumberArray);
        String hiddenWord = arr[random.nextInt(hiddenNumberArray)];
        System.out.println(preamblePuzle);
        String responseUser = enterWordUser();
        boolean answerStatus = false;
        String answer;
        int line;
        while (answerStatus == false) {
            answerStatus = hiddenWord.equals(responseUser);
            if (answerStatus == true) {
                answer = hiddenWord;
            }
            else {
                answer = charExit(compareWordByChar(hiddenWord, responseUser));
                System.out.println("Almost got it: " + answer);
                System.out.print("Try again: ");
                responseUser = enterWordUser();
            }
        }
        System.out.println("Congratulations you guessed it!!! Correct answer: " + hiddenWord);
    }

    public static String enterWordUser () {
        Scanner obj = new Scanner(System.in);
        System.out.print("Your answer: ");
        String response = obj.nextLine();
        return response;
    }

    public static String charExit (String answer) {
        String addChar = "#";
        for (int charWord = answer.length(); charWord < 15; charWord++) {
            answer = answer + addChar;
        }
        return answer;
    }

    public static String compareWordByChar (String firstWord, String secondWord) {
        int line;
        String answerWord = "";
        if (firstWord.length() > secondWord.length()) {
            line = secondWord.length();
        } else {
            line = firstWord.length();
        }
        for (int charWord = 0; charWord < line; charWord++) {
            if (firstWord.charAt(charWord) == secondWord.charAt(charWord)) {
                answerWord = answerWord + firstWord.charAt(charWord);
            } else {
                answerWord = answerWord + "#";
            }
        }
        return answerWord;
    }

}