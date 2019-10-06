package biology;
public class Genome {

    public Genome(){}

    /**
    * @program dnaIn        DNA is introduced for verification and counting of
    *                       purine-pyrimidine base pairing AT or GC
    */
    
    public void dnaMolecule(String dnaIn){
        int at = 0;
        int gc = 0;
        for (int a = 0, b = 1; b < dnaIn.length(); a++, b++){
            char i1 = dnaIn.charAt(a);
            char i2 = dnaIn.charAt(b);
            if('A' == i1 & 'T' == i2 || 'a' == i1 & 't' == i2) {
                System.out.println("hydrogen bond forms adenine-thymine");
                at++;
            }
            if('G' == i1 & 'C' == i2 || 'g' == i1 & 'c' == i2) {
                System.out.println("hydrogen bond forms guanine - cytosine");
                gc++;
            }

        }
        System.out.println("Total A-T: " + at);
        System.out.println("Total G-C: " + gc);
        System.out.println("Total hydrogen bonds: " + (at+gc));
    }
    
    /**
    * @program dna      dna polynucleotide chain is introduced for complementarity,
    *                   the addition of appropriate hydrogen bonds
    * @return dnaOutStr polynucleotide chain complementary to dna
    */
    
    public String addPolynucleotideChain(char[]dna) {
        String dnaOutStr = new String();
        for (int i = 0; dna.length > i; i++) {
            switch (dna[i]) {
                case 'A':
                case 'a':
                    dnaOutStr += "T";
                    break;
                case 'T':
                case 't':
                    dnaOutStr += "A";
                    break;
                case 'G':
                case 'g':
                    dnaOutStr += "C";
                    break;
                case 'C':
                case 'c':
                    dnaOutStr += "G";
                    break;
                default:
                    System.err.println("not molecule");
            }
        }
        return dnaOutStr;
    }

    public String compDna(String dna) {
        char[] cDna = dna.toCharArray();
        return addPolynucleotideChain(cDna);
    }
}
