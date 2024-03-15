package vendek.soupbattle;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

public class Ingredient {
    private final NamespacedKey massKey;

    // Конструктор класса
    public Ingredient(Plugin plugin) {
        this.massKey = new NamespacedKey(plugin, "mass");
    }

    /**
     * Добавляет массу к предмету.
     *
     * @param item предмет, к которому нужно добавить массу
     * @param mass масса, которую нужно добавить к предмету
     */
    public void addMassToItem(ItemStack item, int mass) {
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer data = meta.getPersistentDataContainer();
        data.set(massKey, PersistentDataType.INTEGER, mass);
        item.setItemMeta(meta);
    }
}