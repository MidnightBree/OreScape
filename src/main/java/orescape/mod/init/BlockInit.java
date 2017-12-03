package orescape.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import orescape.mod.objects.block.BlockBase;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_BRONZE = new BlockBase("block_bronze", Material.IRON);
}
