class ReverseString {

    String reverse(String inputString) {
        StringBuilder sB = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            sB.append(inputString.charAt(inputString.length() - 1 - i));
        }
        return sB.toString();
    }
}