public class PigLatinTranslator {

    public String translate(String phrase) {
        String[] stringArray = phrase.split(" ");
        StringBuilder sB = new StringBuilder();

        for (String singleWord : stringArray) {
            sB.append(classifier(singleWord))
                    .append(" ");
        }
        return sB.toString().trim();
    }

    private String classifier(String phrase) {
        if ("aeiou".indexOf(phrase.charAt(0)) >= 0
                || phrase.startsWith("xr")
                || phrase.startsWith("yt")) {
            return addAy(phrase);
        } else if (phrase.startsWith("thr")
                || phrase.startsWith("sch")) {
            return addAy(moveLettersToTheEnd(phrase, 3));
        } else if (phrase.startsWith("qu")
                || phrase.startsWith("ch")
                || phrase.startsWith("th")
                || (phrase.startsWith("rh") && phrase.indexOf("y") == 2)) {
            return addAy(moveLettersToTheEnd(phrase, 2));
        } else if ("pkxqfr".indexOf(phrase.charAt(0)) >= 0
                || ("pkxqfr".indexOf(phrase.charAt(0)) >= 0 && phrase.indexOf("y") != 0)
                || ((phrase.length() == 2) && phrase.indexOf("y") == 1)
                || (phrase.indexOf("y") == 0)) {
            return addAy(moveLettersToTheEnd(phrase, 1));
        } else if (phrase.contains("qu") && phrase.indexOf("q") != 0) {
            return addAy(moveLettersToTheEnd(phrase, phrase.indexOf("u") + 1));
        }
        return "";
    }

    private String addAy(String phrase) {
        return phrase + "ay";
    }

    private String moveLettersToTheEnd(String phrase, int lettersNumber) {
        StringBuilder sB = new StringBuilder();

        for (int i = lettersNumber; i < phrase.length(); i++) {
            sB.append(phrase.charAt(i));
        }
        for (int i = 0; i < lettersNumber; i++) {
            sB.append(phrase.charAt(i));
        }
        return sB.toString();
    }
}
