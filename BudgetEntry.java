package com.mycompany.budgetapp.service;

import java.time.LocalDate;

public class BudgetEntry {

    private double amount;
    private boolean isExpense;
    private String category;
    private LocalDate date;

    // Constructor 
    public BudgetEntry(String category, double amount, boolean isExpense) {
        this.category = category;
        this.amount = amount;
        this.isExpense = isExpense;
        this.date = date;
    }

    // Getters and setters 
    //new getter date
    public LocalDate getDate() {
        return date;
    }

    //setter for date
    public void setDate(LocalDate date) {
        this.date = date;
    }

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

    public void setIsExpense(boolean isExpense) {
        this.isExpense = isExpense;
    }
}
