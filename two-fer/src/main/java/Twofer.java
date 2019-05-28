class Twofer {
    String twofer(String name) {
        StringBuilder sB = new StringBuilder();

        if (name == null || name.isEmpty()) {
            sB.append("One for you, one for me.");
        } else {
            sB.append("One for ")
                    .append(name)
                    .append(", one for me.");
        }
        return sB.toString();
    }
}
