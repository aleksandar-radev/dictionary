package dictionary.services;

import dictionary.entities.Word;
import dictionary.repositories.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;
import java.util.Set;

@Service
public class WordServiceImpl implements WordService {

    private WordRepository wordRepository;

    @Autowired
    public WordServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public List<Word> getAllWords() {
        return this.wordRepository.findAll();
    }

    @Override
    public int countOfWords() {
        return (int) this.wordRepository.count();
    }

}
