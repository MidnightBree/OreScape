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


public class ToolScimitar extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = null;
	
	public ToolScimitar(String name, ToolMaterial material)
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer player) {
				
		if(this == ItemInit.SCIMITAR_BRONZE) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -1.5, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 4.0, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.SCIMITAR_IRON) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -1.5, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 4.5, 0), EntityEquipmentSlot.MAINHAND);
		}	
		else if(this == ItemInit.SCIMITAR_STEEL) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -1.5, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 5.0, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.SCIMITAR_MITHRIL) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -1.5, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 6.0, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.SCIMITAR_ADDY) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -1.5, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 6.5, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.SCIMITAR_RUNE) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -1.5, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 7.0, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.SCIMITAR_DRAGON) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -1.5, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 9.0, 0), EntityEquipmentSlot.MAINHAND);
		}
	}	
	

	
	public void registerModels()
	{
		OSMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}