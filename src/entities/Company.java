package entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;
    private double percent;

   public Company(){

   }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if(numberOfEmployees <= 10){
            percent = 0.16;
        } else{
            percent = 0.14;
        }

        return getAnualIncome() * percent;
    }
}
