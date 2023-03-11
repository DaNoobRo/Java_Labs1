package Lab6;

import java.util.HashMap;
import java.util.Objects;

public class Dictionary {
    private HashMap<Word, Definition> dictionary = new HashMap<>();

    public void addWord(Word w, Definition d)
    {
        if(dictionary.containsKey(w))
            System.out.println("Whomp,this already exists");
        else
        {
            System.out.println("Yey ! u added a word....");
            dictionary.put(w, d);
        }
    }

    public Definition getDefinition(Word word)
    {
        return dictionary.get(word);
    }

    public void getAllWords()
    {
        System.out.print("\nAll the words dagg : ");
        for(Word key : dictionary.keySet())
            System.out.print(key.getName() + ", ");
        System.out.println();
    }

    public void getAllDefinitions()
    {
        System.out.println("\nAll the def dagg : ");
        for(Word key : dictionary.keySet())
            System.out.println(key.getName() + " : " + dictionary.get(key).getDescription());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dictionary)) return false;
        Dictionary that = (Dictionary) o;
        return dictionary.equals(that.dictionary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictionary);
    }
}
