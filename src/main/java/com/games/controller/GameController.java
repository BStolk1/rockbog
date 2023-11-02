package com.games.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.games.game.Game;

import java.util.Arrays;
import java.util.List;

@RestController
public class GameController {

    @GetMapping("/games")
    public List<Game> getAllGames() {
        Game game1 = new Game("Game1", "Description1");
        Game game2 = new Game("Game2", "Description2");
        return Arrays.asList(game1, game2);
    }
}
