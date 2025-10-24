package com.mycompany.budgetapp.service;

public class BudgetManager implements BudgetService {

    private double balance;

    public BudgetManager(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

//Before  adding interface 
// import java.util.ArrayList;
// import java.util.List;
// public class BudgetManager {
//     private List<BudgetEntry> entries;
//     private double balance;
//     public BudgetManager(double initialBalance) {
//         this.entries = new ArrayList<>();
//         this.balance = initialBalance;
//     }
//     public void deposit(double amount) {
//         balance += amount;
//         entries.add(new BudgetEntry("Deposit", amount, false));
//     }
//     public boolean withdraw(double amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             entries.add(new BudgetEntry("Withdrawal", amount, true));
//             return true;
//         }
//         return false;
//     }
//     public double getBalance() {
//         return balance;
//     }
//     public List<BudgetEntry> getEntries() {
//         return entries;
//     }
// 
