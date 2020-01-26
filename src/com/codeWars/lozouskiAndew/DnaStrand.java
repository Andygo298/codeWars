package com.codeWars.lozouskiAndew;


public class DnaStrand {
    public static void main(String[] args) {
        String text = "ATTGC";
        String text2 = "GTAT";
        text = makeComplement(text);
        text2 = makeComplement(text2);
        System.out.println(text + " | " + text2);
    }

    public static String makeComplement(String dna) {
        char[] charArray = dna.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]){
                case 'G': charArray[i] = 'C';break;
                case 'C': charArray[i] = 'G';break;
                case 'T': charArray[i] = 'A';break;
                case 'A': charArray[i] = 'T';break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb.append(c);
        }
        return sb.toString();
    }
}

