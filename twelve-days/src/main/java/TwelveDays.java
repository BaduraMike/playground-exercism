import java.util.ArrayList;
import java.util.List;

class TwelveDays {
    private static final List<String> daysList = new ArrayList<>(
            List.of("first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
                    "eleventh", "twelfth")
    );

    private static final List<String> giftsList = new ArrayList<>(
            List.of("a Partridge in a Pear Tree", "two Turtle Doves, ", "three French Hens, ",
                    "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ", "seven Swans-a-Swimming, ",
                    "eight Maids-a-Milking, ", "nine Ladies Dancing, ", "ten Lords-a-Leaping, ",
                    "eleven Pipers Piping, ", "twelve Drummers Drumming, ")
    );

    String verse(int verseNumber) {
        StringBuilder sB = new StringBuilder();
        int indexNumber = verseNumber - 1;
        sB.append("On the ")
                .append(daysList.get(indexNumber))
                .append(" day of Christmas my true love gave to me: ");

        for (int i = indexNumber; i >= 0; i--) {
            if (verseNumber > 1 && i == 0) {
                sB.append("and ");
            }
            sB.append(giftsList.get(i));
        }
        sB.append(".\n");
        return sB.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sB = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            sB.append(verse(i));
            if (i < endVerse) {
                sB.append("\n");
            }
        }
        return sB.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}
