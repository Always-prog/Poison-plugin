package main;


import de.tr7zw.nbtapi.NBTItem;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

import net.minecraft.nbt.NBTTagString;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class AttackHandler implements Listener {

    @EventHandler
    public void attack(EntityDamageByEntityEvent e)
    {
        if(e.getDamager() instanceof Player){
            Player p = (Player) e.getDamager();
            ItemStack item = p.getItemInHand();
            if (item.getType().equals(Material.AIR))return;
            LivingEntity livingEntity = (LivingEntity) e.getEntity();


            NBTItem nbt = new NBTItem(item); // Create NBT ItemStack

            String effect_nbt_wither = nbt.getString("EffectWither");
            String effect_nbt_wither2 = nbt.getString("EffectWither2");
            String effect_nbt_poison = nbt.getString("EffectPoison");
            String effect_nbt_poison2 = nbt.getString("EffectPoison2");

            if (!effect_nbt_wither.equals("")) { //WITHER
                livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,
                        Integer.parseInt(effect_nbt_wither)*20, 1));
            }
            if (!effect_nbt_wither2.equals("")) { //WITHER 2
                livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,
                        Integer.parseInt(effect_nbt_wither2)*20, 2));
            }
            if (!effect_nbt_poison.equals("")) { //POISON
                livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.POISON,
                        Integer.parseInt(effect_nbt_poison)*20, 1));
            }
            if (!effect_nbt_poison2.equals("")) { //POISON 2
                livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.POISON,
                        Integer.parseInt(effect_nbt_poison2)*20, 2));
            }




        }

    }
}



