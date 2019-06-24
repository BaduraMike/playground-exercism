import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    public static char SPACER = ' ';

    public List<String> printToList(char a) {
        List<String> diamondList = new ArrayList<>();
        StringBuilder sB = new StringBuilder();

        for (int i = 0; i < (a - 64); i++) {
            sB.append(edgeSpaces(a, i));

            sB.append((char) (i + 65));

            if (a != 65 && i != 0) {
                sB.append(middleSpaces(i));
                sB.append((char) (i + 65));
            }

            sB.append(edgeSpaces(a, i));

            diamondList.add(sB.toString());
            sB.setLength(0);

            if (diamondList.size() == (a - 64)) {
                for (int k = 1; k <= (a - 64) - 1; k++)
                    diamondList.add(diamondList.get((a - 64) - 1 - k));
            }
        }
        return diamondList;
    }

    private String edgeSpaces(char a, int i) {
        StringBuilder sB = new StringBuilder();

        for (int j = 0; j < (a - 64 - 1) - i; j++) {
            sB.append(SPACER);
        }
        return sB.toString();
    }

    private String middleSpaces(int i) {
        StringBuilder sB = new StringBuilder();
        int spacesCount = 0;

        if (i == 1) {
            sB.append(SPACER);
            return sB.toString();
        } else if (i == 2) {
            spacesCount = 3;
        } else if (i > 2) {
            spacesCount = 2 * i - 1;
        }
        for (int j = 0; j < spacesCount; j++) {
            sB.append(SPACER);
        }
        return sB.toString();
    }

}
