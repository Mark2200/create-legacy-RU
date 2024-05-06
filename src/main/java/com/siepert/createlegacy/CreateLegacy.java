package com.siepert.createlegacy;

import com.siepert.createlegacy.proxy.CommonProxy;
import com.siepert.createlegacy.tabs.CreateModTab;
import com.siepert.createlegacy.util.Reference;
import com.siepert.createlegacy.util.compat.OreDictionaryCompat;
import com.siepert.createlegacy.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class CreateLegacy {

    public static Logger logger;

    public static final CreativeTabs TAB_CREATE = new CreateModTab("tab_create");

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        RegistryHandler.otherPreInitRegistries(logger);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        RegistryHandler.otherInitRegistries(logger);
    }

    @EventHandler
    public void init(FMLPostInitializationEvent event) {
        logger.info("Femboy count: {}", 1);
        RegistryHandler.otherPostInitRegistries(logger);
    }
}
