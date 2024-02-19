package entities;

public class Individual  extends TaxPayer{

    private double healthExpenditures;
    private double percent = 0;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {

        if( getAnualIncome() < 20.000){
            percent = 0.15;

        }else{
            percent = 0.25;
        }

        if(healthExpenditures == 0){
        return getAnualIncome() * percent;
        }
        else{
            return getAnualIncome() * percent - (healthExpenditures / 2);
        }
    }
}
