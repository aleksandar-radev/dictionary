package dictionary.services;

import dictionary.entities.Word;

import java.util.List;
import java.util.Set;

public interface WordService {
    List<Word> getAllWords();
    int countOfWords();
}
