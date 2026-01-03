package creationaldesignpattern.factory.problem;



public class SalaryDetails {
    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    public Double getHra() {
        return hra;
    }

    public void setHra(Double hra) {
        this.hra = hra;
    }

    public double getLta() {
        return lta;
    }

    public void setLta(double lta) {
        this.lta = lta;
    }

    private Double basePay;
    private Double hra;
    private double lta;

}
