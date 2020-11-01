package com.killer.killersblocksnstuff.events;

import com.killer.killersblocksnstuff.KillersBlocksNStuff;
import com.killer.killersblocksnstuff.init.KbnsItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KillersBlocksNStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class KbnsClientEvents {

    @SubscribeEvent
    public static void onDamageEntity(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == KbnsItems.VIBRANIUM_SWORD.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    target.addPotionEffect(new EffectInstance(Effects.WITHER, 100, 3));
                }
            }
        }
    }
}


