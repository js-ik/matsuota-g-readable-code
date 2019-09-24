package sample1;

/**
 * 辞書情報を保持するためのクラス
 */
public class DictionaryWord {

    /** 単語の識別子、ユニークであることが保証されている */
    private final int id;
    /** 辞書の単語 */
    private final String word;

    public DictionaryWord(int id, String word) {
        this.id = id;
        this.word = word;
    }

    public int getId() {
        return this.id;
    }

    public String getWord() {
        return this.word;
    }
}
