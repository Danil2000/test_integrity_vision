package com.example.word_game.Controller;

import com.example.word_game.GameProcess.Game;
import com.example.word_game.Words;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class GameController {

    @PostMapping("/start")
    public List<String> startGame(@RequestBody Words words)  {
        System.out.println(words.getWords().get(0));
        Game game = new Game(words.getWords());
        return game.start();
    }
}