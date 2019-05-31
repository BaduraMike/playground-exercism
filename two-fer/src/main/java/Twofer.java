import java.util.Optional;

class Twofer {
    String twofer(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);
        String personToPrint;

        if (!stringOptional.isPresent() || stringOptional.equals(Optional.of(""))) {
            personToPrint = "you";
        } else {
            personToPrint = name;
        }
        return String.format("One for %s, one for me.", personToPrint);
    }
}
