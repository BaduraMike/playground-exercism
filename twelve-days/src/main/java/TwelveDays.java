import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TwelveDays {
    private static final String STARTING_VERSE = "On the %s day of Christmas my true love gave to me: %s.\n";

    private static final String[] ORDINALS = {"first", "second", "third", "fourth", "fifth",
            "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

    private static final String[] GIFTS = {"a Partridge in a Pear Tree", "two Turtle Doves",
            "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying",
            "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping",
            "eleven Pipers Piping", "twelve Drummers Drumming"};

    String verse(int verseNumb) {
        return String.format(STARTING_VERSE, ORDINALS[verseNumb - 1],
                formatGifts(verseNumb));
    }

    String formatGifts(int verseNumb) {
        if (verseNumb == 1) {
            return GIFTS[0];
        } else {
            return IntStream
                    .iterate(verseNumb - 1, i -> i - 1)
                    .limit(verseNumb - 1)
                    .mapToObj(i -> GIFTS[i])
                    .collect(Collectors.joining(", "))
                    + ", and "
                    + GIFTS[0];
        }
    }

    String verses(int startVerse, int endVerse) {
        return IntStream
                .rangeClosed(startVerse, endVerse)
                .mapToObj(i -> verse(i))
                .collect(Collectors.joining("\n"));
    }

    String sing() {
        return verses(1, 12);
    }
}
