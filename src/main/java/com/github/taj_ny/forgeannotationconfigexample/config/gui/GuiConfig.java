package com.github.taj_ny.forgeannotationconfigexample.config.gui;

import com.github.taj_ny.forgeannotationconfigexample.ForgeAnnotationConfigExample;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.List;

public class GuiConfig extends net.minecraftforge.fml.client.config.GuiConfig {
    public GuiConfig(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(), ForgeAnnotationConfigExample.MOD_ID, false, false, "Example " +
                "configuration");
    }

    private static List<IConfigElement> getConfigElements() {
        return ForgeAnnotationConfigExample.getInstance().getConfig().getConfigElements();
    }
}
