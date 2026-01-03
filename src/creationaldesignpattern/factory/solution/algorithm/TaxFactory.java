package creationaldesignpattern.factory.solution.algorithm;

import creationaldesignpattern.factory.problem.TaxRegime;

public class TaxFactory {

     public static TaxAlgorithm getTaxAlgorithm(TaxRegime taxRegime){
         switch (taxRegime) {
             case OLD :
                 return  new OldTaxAlgorithm();
                 case NEW :
                     return  new NewTaxAlgorithm();

         }
         throw new IllegalArgumentException("Invalid Tax Regime Type");

     }
}
