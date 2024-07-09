import java.util.HashSet;

//A HashSet is a collection of items where every item is unique

public class Main {
    public static void main(String[] args) {
        HashSet<String> Customers = new HashSet<String>();

        Customers.add("John Doe");
        Customers.add("NotJohn Doe");
        Customers.add("CouldBeJohn Doe");
        Customers.add("John Doe");
        // This will not appear in the HashSet because every item in a HashSet must be
        // unique

        System.out.println(Customers);

        // It also has the .size(), .add(), .remove() and .clear() methods

        // Importantly, it also has the contains() method to check whether it contains a
        // certain item
        System.out.println(Customers.contains("NotJohn Doe")); // return true
    }
}
