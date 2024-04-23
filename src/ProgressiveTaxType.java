public class ProgressiveTaxType extends TaxType{
    double progressiveTax;
    double highPercent = 0.15;
    double lowPercent = 0.10;


    @Override
    public double calculateTaxFor(double amount) {
        if ( amount > 100000){
            return amount * highPercent;
        } else {
            return amount * lowPercent;}
    }
}
