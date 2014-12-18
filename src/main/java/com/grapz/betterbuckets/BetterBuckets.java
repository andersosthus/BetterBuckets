package com.grapz.betterbuckets;

import com.grapz.betterbuckets.Buckets.BucketHandler;
import com.grapz.betterbuckets.Infrastructure.Constants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.General.MODID, version = Constants.General.VERSION, name = Constants.General.NAME)
public class BetterBuckets
{ 
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	System.out.println(Constants.General.NAME + " PREINIT");
    	BucketHandler.init();
    }
 
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	System.out.println(Constants.General.NAME + " INIT");
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	System.out.println(Constants.General.NAME + " POSTINIT");
    }
}
