public class House {
    private static String[] nounsArray = {"house that Jack built", "malt", "rat", "cat", "dog", "cow with the crumpled horn",
            "maiden all forlorn", "man all tattered and torn", "priest all shaven and shorn",
            "rooster that crowed in the morn", "farmer sowing his corn", "horse and the hound and the horn"};

    private static String[] verbsArray = {"lay in", "ate", "killed", "worried", "tossed",
            "milked", "kissed", "married", "woke", "kept", "belonged to"};

    public String verse(int verseNumber) {

        StringBuilder sB = new StringBuilder();

        for (int i = verseNumber - 1; i >= 0; i--) {

            if (i == verseNumber - 1) {
                sB.append("This is the ");
            } else {
                sB.append(" that ").append(verbsArray[i]).append(" the ");
            }
            sB.append(nounsArray[i]);
            if (i == 0) {
                sB.append('.');
            }
        }

        return sB.toString();
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder sB = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            sB.append(verse(i));

            if (i < endVerse) {
                sB.append('\n');
            }
        }
        return sB.toString();
    }

    public String sing() {
        return verses(1, 12);
    }
}
