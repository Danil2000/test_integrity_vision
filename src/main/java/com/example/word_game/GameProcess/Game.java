package com.example.word_game.GameProcess;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<String> words;
    public List<String> result;

    public Game(List<String> words) {
        this.words = words;
        this.result = new ArrayList<>();
    }

    public List<String> start() {
        Character previousLastChar = null;

        for (String w : this.words) {
            if (w.isEmpty()) {
                break;
            }

            char firstChar = w.charAt(0);
            char currentLastChar = w.charAt(w.length() - 1);

            if (previousLastChar != null && firstChar != previousLastChar) {
                break;
            }
            previousLastChar = currentLastChar;
            result.add(w);
        }
        return result;
    }
}

