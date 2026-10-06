/**
 * Inventory.java
 * Manages a collection of Item objects in the game shop.
 *
 * Name:        Yakup Bartu Başkaya
 * Student ID:  240444051
 * Date:        05/10/2026
 */
package game.inventory;

public class Inventory {
    // Stored items plus the current count
    private final Item[] items;
    private int count;

    // Maximum of 10 items
    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    // Store the item in the next free slot
    public void addItem(Item item) {
        if (count == items.length) {
            throw new IllegalStateException("Inventory is full.");
        }
        items[count] = item;
        count++;
    }

    // Show the current inventory
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int index = 0; index < count; index++) {
            Item item = items[index];
            System.out.printf("%-16s| %-8s | Stock: %d%n",
                    item.getName(), item.getGenre(), item.getStockCount());
        }
    }

    // List each item’s serial code
    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int index = 0; index < count; index++) {
            Item item = items[index];
            System.out.printf("%-16s-> %s%n", item.getName(), item.getSerialCode());
        }
    }
}