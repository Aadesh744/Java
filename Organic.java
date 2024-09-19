
class Book {
    private String title;
    private String author;
     private double price;
    private int quantity;

    // Constructor to initialize book details
    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to purchase books and update the quantity
    public void purchaseBook(int purchaseQuantity) {
        if (purchaseQuantity <= quantity) {
            quantity -= purchaseQuantity;
            System.out.println("Purchase successful! You bought " + purchaseQuantity + " copies of " + title);
        } else {
            System.out.println("Sorry, not enough stock available.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Quantity available: " + quantity);
    }

    // Getter to check the available quantity
    public int getQuantity() {
        return quantity;
    }
}

// Customer class representing a customer who can purchase books
class Customer {
    // Method to purchase books from a store
    public void buyBook(Book book, int quantity) {
        if (quantity > 0) {
            book.purchaseBook(quantity);
        } else {
            System.out.println("Invalid quantity!");
        }
    }
}

public class Organic {
    public static void main(String[] args) {
        // Creating a book object
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, 50);

        // Displaying book details
        book1.displayDetails();

        // Creating a customer object
        Customer customer = new Customer();

        // Customer purchases 5 copies of the book
        customer.buyBook(book1, 5);

        // Display book details after the purchase
        book1.displayDetails();
}
}







