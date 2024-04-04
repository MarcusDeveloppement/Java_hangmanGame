import com.hangman.game.HangmanGame;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       final var random = new Random();
       final var words = "hello film minutes simple test manger mains sentir".split(" ");
       var wordToGuess = words[random.nextInt(words.length)];
       var game = new HangmanGame(wordToGuess, 10);

       System.out.println("Début du jeu !");

       while (true) {
           System.out.println(game);

           final var letter = scanLetter("Veuillez entrer une lettre :");

           game.guessLetter(letter);

           if (game.isLost()) {
               System.out.println(game);
               System.out.println("Perdu !");
           }

           if (game.isWon()) {
               System.out.println(game);
               System.out.println("Gagné !");
           }
           if (game.isWon() || game.isLost()){
               var replayAnswer = scanLetter("Voulez-vous rejouer? (y/n)");
               if (replayAnswer == 'y' || replayAnswer =='Y' || replayAnswer =='o' || replayAnswer == 'O'){
                   wordToGuess = words[random.nextInt(words.length)];
                   game = new HangmanGame(wordToGuess, 10);
               } else {
                   break;
               }
           }
       }
    }

    private static char scanLetter(String question) {
        final var scanner = new Scanner(System.in);
        Character letter =null;
        do{
            System.out.println(question);
            var input= scanner.nextLine();
            if(input.length()==1){
                letter = input.charAt(0);
            }
        }while (letter ==null);
       return letter;
    }
}
