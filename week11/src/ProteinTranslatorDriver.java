public class ProteinTranslatorDriver {
    public static void main(String[] args) {
        ProteinTranslator one = new ProteinTranslator();
        System.out.println(one.translate("AUGUUUUCU"));
        System.out.println(one.translate("AUGUUUUCUUAAAUG"));
    }
}
