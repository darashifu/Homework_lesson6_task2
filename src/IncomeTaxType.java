public class IncomeTaxType extends TaxType{
    double incomeTax = 0.13;

    @Override
    public double calculateTaxFor(double amount) {
        return amount * incomeTax;
    }
}
