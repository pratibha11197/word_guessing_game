package com.pratibha.wordguessinggame.word_guessing_game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratibha.wordguessinggame.word_guessing_game.model.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Integer>{

}
