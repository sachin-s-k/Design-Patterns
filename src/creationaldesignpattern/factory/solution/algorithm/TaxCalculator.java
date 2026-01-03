package creationaldesignpattern.factory.solution.algorithm;

import creationaldesignpattern.factory.problem.SalaryDetails;
import creationaldesignpattern.factory.problem.TaxRegime;

// here tax caluclator violating srp, open-close principle. open this class this not maintaianble
public class TaxCalculator {
    public static Double calculateTax(TaxRegime taxRegime, SalaryDetails salaryDetails) {
        return  TaxFactory.
                getTaxAlgorithm(taxRegime).
                CalculateTax(salaryDetails);

    }



}
