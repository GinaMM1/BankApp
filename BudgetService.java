package com.mycompany.budgetapp.service;

public interface BudgetService {

    void deposit(double amount);

    boolean withdraw(double amount);

    double getBalance();
}
