package com.github.taj_ny.forgeannotationconfigexample.config.listener;

import com.github.taj_ny.forgeannotationconfigexample.ForgeAnnotationConfigExample;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigListener {
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent event) {
        if (event.modID.equals(ForgeAnnotationConfigExample.MOD_ID)) {
            ForgeAnnotationConfigExample.getInstance().getConfig().save();
        }
    }
}
