import com.hangman.game.HangmanGame;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       final var scanner = new Scanner(System.in);
       final var random = new Random();
       final var words = "hello film minutes simple test manger mains sentir".split(" ");
       final var wordToGuess = words[random.nextInt(words.length)];
       final var game = new HangmanGame(wordToGuess, 10);

       System.out.println("Début du jeu !");

       while (true) {
           System.out.println(game);
           System.out.println("Veuillez entrer une lettre: ");
           final var letter = scanner.nextLine().charAt(0);

           game.guessLetter(letter);

           if (game.isLost()) {
               System.out.println(game);
               System.out.println("Perdu !");
               break;
           }

           if (game.isWon()) {
               System.out.println(game);
               System.out.println("Gagné !");
               break;
           }
       }
    }
    }
