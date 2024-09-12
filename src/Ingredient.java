public class Ingredient {
    double amount;
    String name;
    String unit;

    public Ingredient(double amount, String name, String unit){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public Ingredient(){}

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}


