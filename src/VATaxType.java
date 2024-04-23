public class VATaxType extends TaxType{
    double vaTax = 0.18;

    @Override
    public double calculateTaxFor(double amount) {
        return amount * vaTax;
    }
}
