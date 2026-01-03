package creationaldesignpattern.factory.solution.algorithm;

import creationaldesignpattern.factory.problem.SalaryDetails;


// step 2: Create concrete classes
public class NewTaxAlgorithm implements TaxAlgorithm {
    public Double CalculateTax(SalaryDetails salaryDetails) {
       return  0.4*salaryDetails.getBasePay()+0.3*salaryDetails.getHra();
    }
}
