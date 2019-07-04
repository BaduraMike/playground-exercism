import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    public static char SPACER = ' ';

    public List<String> printToList(char a) {
        List<String> diamondList = new ArrayList<>();
        StringBuilder sB = new StringBuilder();

        for (int i = 0; i < (a - 64); i++) {
            sB.append(outerSpaces(a, i));

            sB.append((char) (i + 65));

            if (a != 65 && i != 0) {
                sB.append(innerSpaces(i));
                sB.append((char) (i + 65));
            }

            sB.append(outerSpaces(a, i));

            diamondList.add(sB.toString());
            sB.setLength(0);

            if (diamondList.size() == (a - 64)) {
                for (int k = 1; k <= (a - 64) - 1; k++)
                    diamondList.add(diamondList.get((a - 64) - 1 - k));
            }
        }
        return diamondList;
    }

    private String outerSpaces(char a, int i) {
        StringBuilder sB = new StringBuilder();

        for (int j = 0; j < (a - 64 - 1) - i; j++) {
            sB.append(SPACER);
        }
        return sB.toString();
    }

    private String innerSpaces(int i) {
        StringBuilder sB = new StringBuilder();

        if (i == 1) {
            sB.append(SPACER);
            return sB.toString();
        } else if (i > 1) {
            for (int j = 0; j < 2 * i - 1; j++)
                sB.append(SPACER);
        }
        return sB.toString();
    }

}
