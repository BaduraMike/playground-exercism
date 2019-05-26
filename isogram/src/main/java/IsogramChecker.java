import java.util.HashSet;
import java.util.Set;

class IsogramChecker {
//    boolean isIsogram(String phrase) {
//        char[] pharseLettersArray = phrase.toCharArray();
//        Set<Character> lettersSet = new HashSet<>();
//
//        for (char ch : pharseLettersArray) {
//            if (Character.isUpperCase(ch)) {
//                ch = Character.toLowerCase(ch);
//            }
//            if (!lettersSet.contains(ch)) {
//                if (ch != ' ' && ch != '-') {
//                    lettersSet.add(ch);
//                }
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

    boolean isIsogram(String phrase) {
        phrase = phrase.replace(" ", "").replace("-", "").toLowerCase();

        return phrase.chars().distinct().count() == phrase.length();
    }
}
