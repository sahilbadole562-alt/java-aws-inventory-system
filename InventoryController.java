import java.util.*;

public class InventoryController {
    List<Item> items = new ArrayList<>();
  
    public void addItem(Item newItem) {
        items.add(newItem);
        System.out.println("Item added: " + newItem.name);
    }

    public List<Item> getAllItems() {
        return items;
    }

    public static void main(String[] args) {
        InventoryController controller = new InventoryController();
        controller.addItem(new Item(1, "Laptop", 10));
        controller.addItem(new Item(2, "Mouse", 50));
        System.out.println("Total items: " + controller.getAllItems().size());
    }
}
