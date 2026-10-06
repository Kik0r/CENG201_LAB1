/**
 * GameShop.java
 * Demonstrates inventory functionality for the game shop.
 *
 * Name:        Yakup Bartu Başkaya
 * Student ID:  240444051
 * Date:        05/10/2026
 */
import game.inventory.Inventory;
import game.inventory.Item;

public class GameShop {
    public static void main(String[] args) {
        // Inventory for the shop
        Inventory shop = new Inventory();

        // Sample products
        Item galaxyRacer = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item shadowRealm = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item pixelLegends = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        // Add products to the inventory
        shop.addItem(galaxyRacer);
        shop.addItem(shadowRealm);
        shop.addItem(pixelLegends);

        // Show stock before selling
        shop.displayAll();
        System.out.println();

        // Sell a few copies
        galaxyRacer.sell(4);
        shadowRealm.sell(6);
        System.out.println();

        // Show stock after selling
        shop.displayAll();
        System.out.println();

        // Print the serial codes
        shop.auditSerialCodes();

        // This would fail because the method is package-private.
        // galaxyRacer.getSerialCode();
    }
}