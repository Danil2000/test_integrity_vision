package com.example.word_game.GameProcess;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private final List<String> allCorrectWords = Arrays.asList("fish", "horse", "estragon", "nurse");
    private final List<String> oneIncorrectWord = Arrays.asList("fish", "horse", "sprout", "nurse");
    private final List<String> oneEmptyWord = Arrays.asList("fish", "horse", "", "nurse");
    @Test
    public void checkForAllCorrectWords() {
        Game game = new Game(allCorrectWords);
        List<String> res = game.start();
        Assertions.assertEquals(res, allCorrectWords);
    }
    @Test
    public void checkForIncorrectWords() {
        List<String> correctResult = Arrays.asList("fish", "horse");
        Game game = new Game(oneIncorrectWord);
        List<String> res = game.start();
        Assertions.assertEquals(res, correctResult);
    }
    @Test
    public void checkForEmptyWord() {
        List<String> correctResult = Arrays.asList("fish", "horse");
        Game game = new Game(oneEmptyWord);
        List<String> res = game.start();
        Assertions.assertEquals(res, correctResult);
    }
}