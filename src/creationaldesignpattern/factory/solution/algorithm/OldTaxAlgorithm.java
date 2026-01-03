package creationaldesignpattern.factory.solution.algorithm;

import creationaldesignpattern.factory.problem.SalaryDetails;

public class OldTaxAlgorithm implements TaxAlgorithm {
    public Double CalculateTax(SalaryDetails salaryDetails) {
     return    0.4*salaryDetails.getBasePay()+0.3*salaryDetails.getHra();
    }
}
