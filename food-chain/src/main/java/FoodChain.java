public class FoodChain {

    private static final String[][] SWALLOWED = {
            {"fly", "I don't know why she swallowed the fly. Perhaps she'll die."},
            {"spider", "It wriggled and jiggled and tickled inside her.\n"},
            {"bird", "How absurd to swallow a bird!\n"},
            {"cat", "Imagine that, to swallow a cat!\n"},
            {"dog", "What a hog, to swallow a dog!\n"},
            {"goat", "Just opened her throat and swallowed a goat!\n"},
            {"cow", "I don't know how she swallowed a cow!\n"},
            {"horse", "She's dead, of course!"}};

    public String verse(int verseNumber) {
        StringBuilder sB = new StringBuilder("I know an old lady who swallowed a ");

        sB.append(SWALLOWED[verseNumber - 1][0])
                .append(".\n")
                .append(SWALLOWED[verseNumber - 1][1]);

        if (verseNumber != 1 && verseNumber != 8) {
            for (int i = verseNumber - 1; i > 0; i--) {
                sB.append("She swallowed the ");
                sB.append(SWALLOWED[i][0])
                        .append(" to catch the ")
                        .append(SWALLOWED[i - 1][0]);
                if (verseNumber != 2 && i == 2) {
                    sB.append(" that wriggled and jiggled and tickled inside her");
                }
                sB.append(".\n");
            }
            sB.append(SWALLOWED[0][1]);
        }

        return sB.toString();
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder sB = new StringBuilder();

        for (int i = startVerse; i < endVerse; i++) {
            sB.append(String.format("%s\n", verse(i)))
            .append('\n');
        }
        sB.append(verse(endVerse));

        return sB.toString();
    }
}
