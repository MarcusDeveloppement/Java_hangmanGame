package com.hangman.game;

import java.util.ArrayList;
import java.util.List;

public class HangmanGame {

    private final List<Character> secretWord = new ArrayList<>();
    private int lifePoints;
    private final List<Character> guessWord = new ArrayList<>();
    public HangmanGame(String wordToGuess, int lifePoints) {
        for (char c : wordToGuess.toCharArray()){
            this.secretWord.add(c);
        }
        this.lifePoints=lifePoints;
        for (int index = 0; index < this.secretWord.size(); index++) {
            this.guessWord.add('_');
        }
    }
    @Override
    public String toString() {
        return "HangmanGame{" +
                "lifePoints=" + lifePoints +
                ", guessWord=" + guessWord +
                '}';
    }
}
