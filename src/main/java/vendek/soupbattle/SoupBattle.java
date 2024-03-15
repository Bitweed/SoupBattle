package vendek.soupbattle;

import org.bukkit.plugin.java.JavaPlugin;

public final class SoupBattle extends JavaPlugin {

    @Override
    public void onEnable() {
        Ingredient ingredient = new Ingredient(this);
    }

    @Override
    public void onDisable() {
    }
}
