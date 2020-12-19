package rz.mesabrook.wbtc.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import rz.mesabrook.wbtc.blocks.WBTCBlock;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Ceiling Block
	public static final Block CEILING = new WBTCBlock("panel_ceiling", SoundType.STONE);
	
	// Ceiling Blocks - Stone/Concrete/Laminate
	public static final Block PANEL_OAK_L = new WBTCBlock("panel_oak_l", SoundType.STONE);
	public static final Block PANEL_SPRUCE_L = new WBTCBlock("panel_spruce_l", SoundType.STONE);
	public static final Block PANEL_BIRCH_L = new WBTCBlock("panel_birch_l", SoundType.STONE);
	public static final Block PANEL_FLOOR_JUNGLE_L = new WBTCBlock("panel_jungle_l", SoundType.STONE);
	public static final Block PANEL_ACACIA_L = new WBTCBlock("panel_acacia_l", SoundType.STONE);
	public static final Block PANEL_DARK_OAK_L = new WBTCBlock("panel_dark_oak_l", SoundType.STONE);
	public static final Block PANEL_CHECKERBOARD = new WBTCBlock("panel_checkerboard", SoundType.STONE);
	
	// Ceiling Blocks - Wool
	
	// Ceiling Blocks - Wood
	
	// Laminate Wood Floor Blocks
	public static final Block FLOOR_OAK = new WBTCBlock("wbtc_oak", SoundType.STONE);
	public static final Block FLOOR_SPRUCE = new WBTCBlock("wbtc_spruce", SoundType.STONE);
	public static final Block FLOOR_BIRCH = new WBTCBlock("wbtc_birch", SoundType.STONE);
	public static final Block FLOOR_JUNGLE = new WBTCBlock("wbtc_jungle", SoundType.STONE);
	public static final Block FLOOR_ACACIA = new WBTCBlock("wbtc_acacia", SoundType.STONE);
	public static final Block FLOOR_DARK_OAK = new WBTCBlock("wbtc_dark_oak", SoundType.STONE);
	
	// Floor Blocks
	public static final Block FLOOR_CHECKERBOARD = new WBTCBlock("wbtc_checkerboard", SoundType.STONE);
}
