#Task 5 Enhance your application

#Chosen collection types 
ArrayList: The ArrayList was chosen for the purpose of storing all the budget entries in order. The paticular collection type was chosen due to it being fast to access, by index and easy to iterate through.  private List<BudgetEntry> entries = new ArrayList<>();

HasMap: This was for the purpose of grouping any entries by category, making it easier to lookup faster through use of category name.     public void sortByCategory() {
        entries.sort(Comparator.comparing(BudgetEntry::getCategory));
    }

The primary choice was the ArrayList as it keeps the entries in the order they were added. Its flexibility as they can grow dynamically as new entries are added. Finally its efficient through the ability to ierate  faster and access for sorting and searching. In the code sorting was implemented through using the Comparator and List.sort(), thats ideal for the use of the ArrayList type. public void sortByDate() {
        entries.sort(Comparator.comparing(BudgetEntry::getDate));
    }

To demonstrate how searching was implemented I used Java Streams, as they are powerful when filtering in collections. //Enables searching by category

    public List<BudgetEntry> findByCategory(String category) {
        return entries.stream()
                .filter(e -> e.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
Streams are perfect for efficiency they are optimised for perfomance. Streams also offer concisness for complex filters. 

In conclusion ArrayLists provide simplicity they are intuitive and widely used with Java programming. For better performance sorting and searching were utilised. Providing fast and memory-efficient usage. Overall they make code clean, readbale and easy to extend.