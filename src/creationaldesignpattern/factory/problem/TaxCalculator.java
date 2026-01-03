package creationaldesignpattern.factory.problem;

// here tax caluclator violating srp, open-close principle. open this class this not maintaianble
public class TaxCalculator {
    public static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails){
        switch (regime) {
            case OLD:
                return 0.4*salaryDetails.getBasePay()+0.3*salaryDetails.getHra();
                case NEW:
                    return 0.4*salaryDetails.getBasePay()+0.3*salaryDetails.getHra()+0.2* salaryDetails.getLta();



        }
        throw new IllegalArgumentException("Invalid regime type");
    }



}
