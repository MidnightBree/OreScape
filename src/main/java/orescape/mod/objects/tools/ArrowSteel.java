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
import orescape.mod.entity.BronzeArrow;
import orescape.mod.init.ItemInit;
import orescape.mod.util.IHasModel;

public class ArrowSteel extends ItemArrow implements IHasModel
{
	public ArrowSteel(String name)
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

	
	public BronzeArrow createArrow(World worldIn, ItemStack itemstack, EntityPlayer entityplayer) {
		return null;
	}


}
