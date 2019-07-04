public class Bob {

    public String hey(String sentence) {
        StringBuilder sB = new StringBuilder();
        String reducedSentence = sentence
                .replaceAll("[,@#$%^&*'() \\s]", "");

        boolean isReducedEmpty = reducedSentence.isEmpty();
        boolean isYell = false;
        boolean isReducedQuestion = false;
        boolean hasExclamation = false;

        if (!isReducedEmpty) {
            if (reducedSentence.length() != 1) {
                isYell = reducedSentence
                        .substring(0, reducedSentence.length() - 1)
                        .chars()
                        .allMatch(Character::isUpperCase);

                if(!isYell && reducedSentence.endsWith("!") && !reducedSentence.matches(".*\\d.*")){
                    sB.append("Whatever.");
                    return sB.toString();
                }
            }
            isReducedQuestion = reducedSentence.endsWith("?");
            hasExclamation = reducedSentence.endsWith("!");
        }

        if (isReducedQuestion && isYell) {
            sB.append("Calm down, I know what I'm doing!");
        } else if (isReducedQuestion) {
            sB.append("Sure.");
        } else if (isYell || hasExclamation) {
            sB.append("Whoa, chill out!");
        } else if (isReducedEmpty) {
            sB.append("Fine. Be that way!");
        } else {
            sB.append("Whatever.");
        }

        return sB.toString();
    }
}
