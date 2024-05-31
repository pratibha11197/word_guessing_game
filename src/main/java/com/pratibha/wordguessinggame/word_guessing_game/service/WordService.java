package com.pratibha.wordguessinggame.word_guessing_game.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.pratibha.wordguessinggame.word_guessing_game.model.Word;
import com.pratibha.wordguessinggame.word_guessing_game.repository.WordRepository;

@Service
public class WordService {

	@Autowired
	private WordRepository wordRepository;
	
	private Random randomGenerator;
    private List<Word> words;

    public WordService() {
    	randomGenerator = new Random();
    }
    
    public Word getRandomWord() {    	
    	words = wordRepository.findAll();
    	int index = randomGenerator.nextInt(words.size());
    	Word word =  words.get(index);
    	
    	return word;
    }
    
}
