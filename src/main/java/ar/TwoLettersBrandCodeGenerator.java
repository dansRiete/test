package ar;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TwoLettersBrandCodeGenerator {
    public static void main(String[] args) {
        Set<String> existentCode = new HashSet<>(List.of("NM", "NH", "AA", "AA", "AA", "AC", "AC", "AC", "AC", "AC", "AC", "AC", "AC", "AD", "AD", "AD", "AD", "AE", "AG", "AH", "AL", "AL", "AL", "AL", "AL", "AL", "AM", "AN", "AN", "AO", "AO", "AO", "AP", "AR", "AT", "AU", "AU", "AV", "AV", "AV", "AV", "AV", "AV", "AX", "BC", "BU", "BU", "BU", "BU", "BU", "BU", "BU", "C8", "C8", "CA", "CA", "CB", "CB", "CE", "CE", "CE", "CI", "CP", "CR", "CS", "CT", "CU", "CV", "CV", "CW", "CX", "CX", "CZ", "DF", "DF", "DF", "DH", "DH", "DH", "DL", "DL", "DL", "DL", "DL", "DL", "DL", "DL", "DV", "EB", "EB", "EB", "EC", "EC", "EC", "EC", "EC", "EC", "ED", "ED", "EH", "EH", "EH", "EN", "EN", "EN", "EN", "EN", "EN", "ER", "ER", "ES", "ES", "ES", "ES", "EU", "EU", "EU", "EU", "EU", "EX", "EX", "EZ", "EZ", "EZ", "EZ", "EZ", "EZ", "FF", "FF", "FF", "FF", "FF", "FL", "FX", "FX", "FX", "FX", "GC", "GC", "GM", "GM", "GM", "GM", "GN", "GR", "GV", "HC", "HW", "HW", "HZ", "HZ", "HZ", "HZ", "HZ", "HZ", "HZ", "IM", "IN", "IV", "IV", "K8", "KH", "KL", "KO", "KQ", "KT", "KT", "KX", "LL", "LM", "MD", "MD", "MD", "MR", "MR", "MS", "MS", "MV", "MV", "MX", "MX", "MY", "MZ", "NA", "NA", "NA", "NA", "NA", "NA", "NB", "NC", "NC", "ND", "NE", "NF", "NG", "NH", "NJ", "NK", "NR", "NU", "NU", "NU", "NU", "NX", "OR", "OZ", "OZ", "PC", "PC", "PD", "PD", "PL", "PL", "PL", "PL", "PL", "PL", "PN", "PN", "PN", "PO", "PO", "RC", "RC", "RC", "RE", "RE", "RE", "RF", "RF", "RG", "RG", "RM", "RS", "RT", "RT", "RT", "RW", "RZ", "SB", "SC", "SF", "SP", "SP", "SR", "SR", "SV", "SX", "SX", "SX", "SX", "SX", "SX", "SX", "SX", "TE", "TH", "TH", "TH", "TH", "TH", "TH", "TH", "TO", "TO", "TR", "TR", "TT", "TU", "TU", "TV", "TV", "TV", "TZ", "TZ", "US", "US", "VA", "VA", "VA", "VC", "VP", "VP", "VP", "VR", "VR", "WC", "WC", "WC", "XD", "XE", "XK", "XW", "XZ", "YA", "YA", "YK", "YO", "ZG", "ZG", "ZM", "ZM", "ZO", "ZT"));
        Set<String> newCodes = new HashSet<>();
        int addedCodes = 0;
        long start = System.currentTimeMillis();
        System.out.println("Generation started. Existent codes: " + existentCode.size());
        do {
            Random r = new Random();
            char c1 = (char)(r.nextInt(26) + 'a');
            char c2 = (char)(r.nextInt(26) + 'a');
            String generatedCode = new String(new char[]{c1, c2}).toUpperCase();
            if (!existentCode.contains(generatedCode) && !newCodes.contains(generatedCode)) {
               addedCodes++;
               newCodes.add(generatedCode);
            }
        } while (addedCodes < 130);
        System.out.println(newCodes);
        System.out.println(newCodes.size() + " codes generated for " + (System.currentTimeMillis() - start) + " ms");


    }

}
