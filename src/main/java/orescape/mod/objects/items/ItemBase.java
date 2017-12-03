package orescape.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import orescape.mod.OSMain;
import orescape.mod.init.ItemInit;
import orescape.mod.proxy.ClientProxy;
import orescape.mod.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}	
	
	@Override
	public void registerModels()
	{
		OSMain.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
