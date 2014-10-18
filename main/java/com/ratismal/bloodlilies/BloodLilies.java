package com.ratismal.bloodlilies;

import com.ratismal.bloodlilies.handler.ConfigurationHandler;
import com.ratismal.bloodlilies.init.ModItems;
import com.ratismal.bloodlilies.proxy.IProxy;
import com.ratismal.bloodlilies.reference.Reference;
import com.ratismal.bloodlilies.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class BloodLilies
{
    @Mod.Instance(Reference.MOD_ID)
    public static BloodLilies instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        LogHelper.info("PreMeow Done!! :33");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Meow Done!! :33");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostMeow Done!! :33");
        LogHelper.info("This is a very PREMEOWM mod!");
    }

}

