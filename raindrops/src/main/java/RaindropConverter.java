class RaindropConverter {

    String convert(int number) {
        StringBuilder sB = new StringBuilder();

        if (number % 3 == 0) {
            sB.append("Pling");
        }
        if (number % 5 == 0) {
            sB.append("Plang");
        }
        if (number % 7 == 0) {
            sB.append("Plong");
        }

        if (sB.toString().length() != 0) {
            return sB.toString();
        } else {
            sB.append(number);
            return sB.toString();
        }
    }
}
