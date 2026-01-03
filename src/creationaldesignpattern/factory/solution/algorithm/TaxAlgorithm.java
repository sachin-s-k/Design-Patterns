package creationaldesignpattern.factory.solution.algorithm;

import creationaldesignpattern.factory.problem.SalaryDetails;
import creationaldesignpattern.factory.problem.TaxRegime;


// step 1:  create an interface
public interface TaxAlgorithm {
    Double CalculateTax(SalaryDetails salaryDetails);
}
