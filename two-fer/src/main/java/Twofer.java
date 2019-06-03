import java.util.Optional;

class Twofer {
    String twofer(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);

        final String personToPrint = !stringOptional.isPresent() || name.equals("")
                ? "you"
                : name;

        return String.format("One for %s, one for me.", personToPrint);
    }
}
