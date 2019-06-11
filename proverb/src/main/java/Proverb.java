class Proverb {
    private String[] inputWords;

    Proverb(String[] words) {
        this.inputWords = words;
    }

    public String[] getInputWords() {
        return inputWords;
    }

    String recite() {
        int first;
        int second;
        int inputLength = getInputWords().length;
        StringBuilder sB = new StringBuilder();

        if (getInputWords().length == 0) {
            return sB.toString();
        }

        for (int i = 0; i < inputLength; i++) {
            first = i;
            second = i + 1;

            if (first == inputLength - 1) {
                sB.append("And all for the want of a ")
                        .append(getInputWords()[0])
                        .append(".");
            } else {
                sB.append("For want of a ")
                        .append(getInputWords()[first])
                        .append(" the ")
                        .append(getInputWords()[second])
                        .append(" was lost.")
                        .append("\n");
            }
        }
        return sB.toString();
    }
}
