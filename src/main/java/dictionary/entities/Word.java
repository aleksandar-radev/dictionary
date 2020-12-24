package dictionary.entities;

import org.hibernate.annotations.OnDelete;

import javax.persistence.*;

@Entity
@Table(name = "w_words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String word;
    private int table;
    private String note;
    private int count;

    public Word() {
    }

    @Column
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Column
    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    @Column
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Column
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
