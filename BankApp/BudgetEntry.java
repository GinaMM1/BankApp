// class BudgetEntry

public class BudgetEntry {

    private double amount;
    private boolean isExpense;
    private String category;

    //Construtor 
    public BudgetEntry(String category, double amount, boolean isExpense) {
        this.category = category;
        this.amount = amount;
        this.isExpense = isExpense;

    }
    //Getters and setters 

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isExpense() {
        return isExpense;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setisExpense(boolean isExpense) {
        this.isExpense = isExpense;
    }
}
