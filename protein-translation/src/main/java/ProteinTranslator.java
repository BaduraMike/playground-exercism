import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> codons = new ArrayList<>();
        char[] chars = rnaSequence.toCharArray();
        StringBuilder sB = new StringBuilder();

        for (int i = 0; i < rnaSequence.length(); i++) {
            sB.append(chars[i]);
            if (sB.length() == 3) {
                codons.add(sB.toString());
                sB.setLength(0);
            }
        }

        Map<String, String> proteinsMap = new HashMap<>();
        proteinsMap.put("AUG", "Methionine");
        proteinsMap.put("UUU", "Phenylalanine");
        proteinsMap.put("UUC", "Phenylalanine");
        proteinsMap.put("UUA", "Leucine");
        proteinsMap.put("UUG", "Leucine");
        proteinsMap.put("UCU", "Serine");
        proteinsMap.put("UCC", "Serine");
        proteinsMap.put("UCA", "Serine");
        proteinsMap.put("UCG", "Serine");
        proteinsMap.put("UAU", "Tyrosine");
        proteinsMap.put("UAC", "Tyrosine");
        proteinsMap.put("UGU", "Cysteine");
        proteinsMap.put("UGC", "Cysteine");
        proteinsMap.put("UGG", "Tryptophan");
        proteinsMap.put("UAA", "STOP");
        proteinsMap.put("UAG", "STOP");
        proteinsMap.put("UGA", "STOP");

        List<String> proteinList = new ArrayList<>();

        for (String str : codons) {
            if (proteinsMap.get(str).equals("STOP")) {
                break;
            }
            proteinList.add(proteinsMap.get(str));
        }

        return proteinList;
    }
}