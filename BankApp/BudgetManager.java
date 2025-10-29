package com.mycompany.budgetapp.service;

import com.mycompany.budgetapp.service.BudgetEntry;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class BudgetManager implements BudgetService {

    private double balance;
    //Collection for data storage
    private List<BudgetEntry> entries = new ArrayList<>();

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
//Managing the entries through the use of methods

    public void addEntry(BudgetEntry entry) {
        entries.add(entry);
    }

    public boolean removeEntry(BudgetEntry entry) {
        return entries.remove(entry);
    }
//Enables searching by category

    public List<BudgetEntry> findByCategory(String category) {
        return entries.stream()
                .filter(e -> e.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
//implenting sorting by the amount 

    public void sortByAmount() {
        entries.sort(Comparator.comparingDouble(BudgetEntry::getAmount));
    }
// date range

    public void sortByDate() {
        entries.sort(Comparator.comparing(BudgetEntry::getDate));
    }
// category

    public void sortByCategory() {
        entries.sort(Comparator.comparing(BudgetEntry::getCategory));
    }
// Data store component.

    public class InMemoryDataStore {

        private List<BudgetEntry> entries = new ArrayList<>();

        public void create(BudgetEntry entry) {
            entries.add(entry);
        }

        public List<BudgetEntry> readAll() {
            return new ArrayList<>(entries);
        }

        public void update(int index, BudgetEntry newEntry) {
            entries.set(index, newEntry);
        }

        public void delete(BudgetEntry entry) {
            entries.remove(entry);
        }
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
