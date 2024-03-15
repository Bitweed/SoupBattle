package vendek.soupbattle.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import vendek.soupbattle.Ingredient;

public class BlockBreak implements Listener {
    private Ingredient ingredient;
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // Player player = event.getPlayer();
        Block block = event.getBlock();

        if (block.getType() == Material.POTATO) {
            ItemStack potato = new ItemStack(Material.POTATO);
            ingredient.addMassToItem(potato, 2);

            // Дропаем только один предмет
            block.getWorld().dropItem(block.getLocation(), potato);
            event.setCancelled(true);
        }
    }
}
