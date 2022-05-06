package com.github.taj_ny.forgeannotationconfigexample;

import com.github.taj_ny.forgeannotationconfigexample.config.Config;
import com.github.taj_ny.forgeannotationconfigexample.config.listener.ConfigListener;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = ForgeAnnotationConfigExample.MOD_ID, name = "ForgeAnnotationConfigExample", version = "1.0",
        guiFactory = "com.github.taj_ny.forgeannotationconfigexample.config.gui.GuiConfigFactory")
public class ForgeAnnotationConfigExample {
    public static final String MOD_ID = "forgeannotationconfigexample";

    @Mod.Instance
    private static ForgeAnnotationConfigExample instance;

    private Config config;

    @Mod.EventHandler
    public void onFMLInitialization(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ConfigListener());
    }

    @Mod.EventHandler
    public void onFMLPreInitialization(FMLPreInitializationEvent event) {
        File configFile = new File(event.getModConfigurationDirectory(), MOD_ID + ".cfg");
        config = new Config(configFile);
    }

    public static ForgeAnnotationConfigExample getInstance() {
        return instance;
    }

    public Config getConfig() {
        return config;
    }
}
