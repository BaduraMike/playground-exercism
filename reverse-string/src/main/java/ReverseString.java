import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ReverseString {

    String reverse(String inputString) {
        return IntStream.range(0, inputString.length())
                .mapToObj(x -> inputString.charAt((inputString.length() - 1) - x))
                .map(character -> String.valueOf(character))
                .collect(Collectors.joining(""));
    }
}