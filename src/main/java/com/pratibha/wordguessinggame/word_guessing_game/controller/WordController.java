package com.pratibha.wordguessinggame.word_guessing_game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratibha.wordguessinggame.word_guessing_game.model.Word;
import com.pratibha.wordguessinggame.word_guessing_game.service.WordService;

@RestController
@RequestMapping("/game")
public class WordController {
	
	@Autowired
	private WordService wordService;
	
    @GetMapping("/word")
    public Word getRandomWord() {    	
    	return wordService.getRandomWord();
    }
}
