package com.grapz.betterbuckets.Buckets;

import com.grapz.betterbuckets.Infrastructure.Constants;
import com.grapz.betterbuckets.Infrastructure.Constants.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseBucket extends Item {
	public BaseBucket(String shortName) {
		String fullName = Constants.General.MODID + "_" + shortName;
		String textureName = Constants.General.MODID + ":" + shortName;
		
		setUnlocalizedName(fullName);
		setTextureName(textureName);
		setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(this, shortName);
	}
}
