import java.util.*;
import java.util.stream.Collectors;

public class Anagram {
    private String givenWord;

    public Anagram(String givenWord) {
        this.givenWord = givenWord;
    }

    private String sortLowerCase(String wordToCheck) {
        StringBuilder sB = new StringBuilder();

        if (Character.isUpperCase(
                wordToCheck
                        .charAt(wordToCheck.length() - 1))) {
            return sB.toString();
        } else {
            wordToCheck
                    .toLowerCase()
                    .chars()
                    .mapToObj(c -> (char) c)
                    .sorted()
                    .forEach(sB::append);
            return sB.toString();
        }
    }

    public List<String> match(List<String> inputList) {
        return inputList
                .stream()
                .filter(str -> sortLowerCase(str).equals(sortLowerCase(givenWord)))
                .collect(Collectors.toList());
    }
}
