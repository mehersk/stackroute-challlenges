import java.util.Comparator;

public class WordComparator implements Comparator<Word> {

    @Override
    public int compare(Word o1, Word o2) {
        // TODO Auto-generated method stub
        return (o1.getWord().compareTo(o2.getWord()));
    }
    
}
