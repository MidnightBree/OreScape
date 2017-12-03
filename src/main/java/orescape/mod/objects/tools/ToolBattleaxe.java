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
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import orescape.mod.OSMain;
import orescape.mod.init.ItemInit;
import orescape.mod.util.IHasModel;


public class ToolBattleaxe extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = null;
	
	public ToolBattleaxe(String name, ToolMaterial material)
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer player) {
				
		if(this == ItemInit.BATTLEAXE_BRONZE) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -3, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 6.5, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.BATTLEAXE_IRON) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -3, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 7.5, 0), EntityEquipmentSlot.MAINHAND);
		}	
		else if(this == ItemInit.BATTLEAXE_STEEL) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -3, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 8.5, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.BATTLEAXE_MITHRIL) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -3, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 9.5, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.BATTLEAXE_ADDY) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -3, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 10.5, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.BATTLEAXE_RUNE) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -3, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 11.5, 0), EntityEquipmentSlot.MAINHAND);
		}
		else if(this == ItemInit.BATTLEAXE_DRAGON) {
			stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", -3, 0), EntityEquipmentSlot.MAINHAND);
			stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 13.5, 0), EntityEquipmentSlot.MAINHAND);
		}
	}	
	

	
	public void registerModels()
	{
		OSMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}