package orescape.mod.objects.tools;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import orescape.mod.OSMain;
import orescape.mod.init.ItemInit;
import orescape.mod.util.IHasModel;

public class ArrowTypes extends ItemArrow implements IHasModel
{
	public ArrowTypes(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		this.maxStackSize = 50;
		
		
		ItemInit.ITEMS.add(this);
	}	
	
	@Override
	public void registerModels()
	{
		OSMain.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	public EntityArrow createArrow(World worldIn, ItemStack itemstack, EntityPlayer entityplayer) {
		return null;
	}


}
