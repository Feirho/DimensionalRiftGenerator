package spacerift.spacerift;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SpaceRiftFeatures implements Listener {

    @EventHandler
    public void PlayerInteract(PlayerInteractEvent e) {
        Inventory inv = Bukkit.createInventory(null,45, ChatColor.GOLD + "Set Rift Location");
        inv.setItem(22, new ItemStack(Material.OAK_SIGN));
        inv.setItem(20,new ItemStack(Material.CLOCK));
        Player p = e.getPlayer();
        if(p.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Dimensional Rift Scissors")) {
            if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                p.openInventory(inv);
            }
        }
    }
}
