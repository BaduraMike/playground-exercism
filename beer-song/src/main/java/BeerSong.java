import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BeerSong {
    private static final String GENERIC_VERSE = "%d bottles of beer on the wall, %d bottles of beer.\n" +
            "Take one down and pass it around, %d bottle%s of beer on the wall.\n\n";

    private static final String LAST_VERSE = "No more bottles of beer on the wall, no more bottles of beer.\n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";

    private static final String PENULTIMATE_VERSE = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
            "Take it down and pass it around, no more bottles of beer on the wall.\n\n";

    private static String verse(int verseNumber) {
        switch (verseNumber) {
            case 0:
                return LAST_VERSE;
            case 1:
                return PENULTIMATE_VERSE;
            default:
                return String.format(GENERIC_VERSE, verseNumber, verseNumber, (verseNumber - 1),
                        verseNumber > 2 ? "s" : "");
        }
    }

    public String sing(int verseNumber, int verseCount){
        return IntStream.rangeClosed(0,verseNumber)
                .limit(verseCount)
                .map(i -> 0 - i + verseNumber)
                .mapToObj(BeerSong::verse)
                .collect(Collectors.joining());
    }

    public String singSong() {
        return sing(99, 100);
    }
}
