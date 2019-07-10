public class House {
    private static final String[][] STRINGS = new String[][]{
            {"house that Jack built", null},
            {"malt", "lay in"},
            {"rat", "ate"},
            {"cat", "killed"},
            {"dog", "worried"},
            {"cow with the crumpled horn", "tossed"},
            {"maiden all forlorn", "milked"},
            {"man all tattered and torn", "kissed"},
            {"priest all shaven and shorn", "married"},
            {"rooster that crowed in the morn", "woke"},
            {"farmer sowing his corn", "kept"},
            {"horse and the hound and the horn", "belonged to"}
    };

    public String verse(int verseNumber) {
        StringBuilder sB = new StringBuilder("This is the ");

        for (int i = verseNumber - 1; i > 0; i--) {
            sB.append(String.format("%s that %s the ", STRINGS[i][0], STRINGS[i][1]));
        }
        sB.append(String.format("%s.", STRINGS[0][0]));

        return sB.toString();
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder sB = new StringBuilder();

        for (int i = startVerse; i < endVerse; i++) {
            sB.append(String.format("%s\n", verse(i)));
        }
        sB.append(verse(endVerse));

        return sB.toString();
    }

    public String sing() {
        return verses(1, 12);
    }
}
