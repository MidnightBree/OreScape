package orescape.mod.objects.tools;

import net.minecraft.item.Item.ToolMaterial;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;
import orescape.mod.OSMain;
import orescape.mod.init.ItemInit;
import orescape.mod.util.IHasModel;


public class ToolPickaxe extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	
	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}
	
	 public boolean canHarvestBlock(IBlockState blockIn)
	    {
	        return blockIn.getBlock() == null;
	    }
	
	@Override
	public void registerModels()
	{
		OSMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}