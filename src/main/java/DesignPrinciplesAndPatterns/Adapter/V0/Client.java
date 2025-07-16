package DesignPrinciplesAndPatterns.Adapter.V0;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.rechargeFastTag(100);
    }
}
