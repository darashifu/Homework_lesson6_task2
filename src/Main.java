public class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();

        Bill[] payments = new Bill[]{
                new Bill(5000, new VATaxType(), taxService),
                new Bill(15000, new IncomeTaxType(), taxService),
                new Bill(115000, new ProgressiveTaxType(),taxService),
                new Bill(99000, new ProgressiveTaxType(),taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
