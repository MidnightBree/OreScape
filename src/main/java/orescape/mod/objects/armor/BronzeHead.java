package orescape.mod.objects.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import orescape.mod.OSMain;
import orescape.mod.init.ItemInit;
import orescape.mod.util.IHasModel;

public class BronzeHead extends ItemArmor implements IHasModel
{
	public BronzeHead(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	
public void onCreated(ItemStack stack, World worldIn, EntityPlayer player) {
		
		stack.addAttributeModifier("generic.maxHealth", new AttributeModifier("generic.maxHealth", 2, 0), EntityEquipmentSlot.HEAD);
		stack.addEnchantment(Enchantments.PROTECTION, 1);
		
	}
	
	public void registerModels()
	{
		OSMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
