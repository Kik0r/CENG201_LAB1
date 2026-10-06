/**
 * Item.java
 * Represents a single game item in the inventory.
 *
 * Name:        Yakup Bartu Başkaya
 * Student ID:  240444051
 * Date:        05/10/2026
 */
package game.inventory;

public class Item {
    // Basic item data
    private final String name;
    private final String genre;
    private int stockCount;
    private final String serialCode;

    // Create a new item
    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    // Package-private: available to the same package
    String getSerialCode() {
        return serialCode;
    }

    // Check whether enough stock is available
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    // Sell stock only when the requested quantity is available
    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stockCount -= quantity;
            String unit = quantity == 1 ? "copy" : "copies";
            System.out.println("Sold " + quantity + " " + unit + " of " + name
                    + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name + ". Requested: "
                    + quantity + ", Available: " + stockCount);
        }
    }
}