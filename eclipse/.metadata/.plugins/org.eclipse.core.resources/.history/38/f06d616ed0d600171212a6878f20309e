package orescape.mod.objects.tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import orescape.mod.init.*;

import java.util.Random;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import orescape.mod.OSMain;
import orescape.mod.init.ItemInit;
import orescape.mod.util.IHasModel;


public class ToolMaul extends ItemSword implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = null;
	
	public ToolMaul(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer player) {
				
		stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -1, 0), EntityEquipmentSlot.MAINHAND);
	}	
	

	
	public void registerModels()
	{
		OSMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}