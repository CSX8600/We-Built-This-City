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
	
	// Ceiling Blocks - Stone/Concrete/Laminate/WBTC Floor Tiles
	public static final Block PANEL_OAK_L = new WBTCBlock("panel_oak_l", SoundType.STONE);
	public static final Block PANEL_SPRUCE_L = new WBTCBlock("panel_spruce_l", SoundType.STONE);
	public static final Block PANEL_BIRCH_L = new WBTCBlock("panel_birch_l", SoundType.STONE);
	public static final Block PANEL_FLOOR_JUNGLE_L = new WBTCBlock("panel_jungle_l", SoundType.STONE);
	public static final Block PANEL_ACACIA_L = new WBTCBlock("panel_acacia_l", SoundType.STONE);
	public static final Block PANEL_DARK_OAK_L = new WBTCBlock("panel_dark_oak_l", SoundType.STONE);
	public static final Block PANEL_CHECKERBOARD = new WBTCBlock("panel_checkerboard", SoundType.STONE);
	public static final Block PANEL_TILE_1 = new WBTCBlock("panel_floor_tile_1", SoundType.STONE);
	public static final Block PANEL_TILE_2 = new WBTCBlock("panel_floor_tile_2", SoundType.STONE);
	public static final Block PANEL_TILE_3 = new WBTCBlock("panel_floor_tile_3", SoundType.STONE);
	public static final Block PANEL_TILE_4 = new WBTCBlock("panel_floor_tile_4", SoundType.STONE);
	public static final Block PANEL_TILE_5 = new WBTCBlock("panel_floor_tile_5", SoundType.STONE);
	public static final Block PANEL_TILE_6 = new WBTCBlock("panel_floor_tile_6", SoundType.CLOTH);
	
	// Ceiling Blocks - Wool
	public static final Block PANEL_WOOL_WHITE = new WBTCBlock("panel_wool_white", SoundType.CLOTH);
	public static final Block PANEL_WOOL_ORANGE = new WBTCBlock("panel_wool_orange", SoundType.CLOTH);
	public static final Block PANEL_WOOL_MAGENTA = new WBTCBlock("panel_wool_magenta", SoundType.CLOTH);
	public static final Block PANEL_WOOL_LBLUE = new WBTCBlock("panel_wool_lblue", SoundType.CLOTH);
	public static final Block PANEL_WOOL_YELLOW = new WBTCBlock("panel_wool_yellow", SoundType.CLOTH);
	public static final Block PANEL_WOOL_LIME = new WBTCBlock("panel_wool_lime", SoundType.CLOTH);
	public static final Block PANEL_WOOL_PINK = new WBTCBlock("panel_wool_pink", SoundType.CLOTH);
	public static final Block PANEL_WOOL_GRAY = new WBTCBlock("panel_wool_gray", SoundType.CLOTH);
	public static final Block PANEL_WOOL_SILVER = new WBTCBlock("panel_wool_silver", SoundType.CLOTH);
	public static final Block PANEL_WOOL_CYAN = new WBTCBlock("panel_wool_cyan", SoundType.CLOTH);
	public static final Block PANEL_WOOL_PURPLE = new WBTCBlock("panel_wool_purple", SoundType.CLOTH);
	public static final Block PANEL_WOOL_BLUE = new WBTCBlock("panel_wool_blue", SoundType.CLOTH);
	public static final Block PANEL_WOOL_BROWN = new WBTCBlock("panel_wool_brown", SoundType.CLOTH);
	public static final Block PANEL_WOOL_GREEN = new WBTCBlock("panel_wool_green", SoundType.CLOTH);
	public static final Block PANEL_WOOL_RED = new WBTCBlock("panel_wool_red", SoundType.CLOTH);
	public static final Block PANEL_WOOL_BLACK = new WBTCBlock("panel_wool_black", SoundType.CLOTH);
	
	// Laminate Wood Floor Blocks
	public static final Block FLOOR_OAK = new WBTCBlock("wbtc_oak", SoundType.STONE);
	public static final Block FLOOR_SPRUCE = new WBTCBlock("wbtc_spruce", SoundType.STONE);
	public static final Block FLOOR_BIRCH = new WBTCBlock("wbtc_birch", SoundType.STONE);
	public static final Block FLOOR_JUNGLE = new WBTCBlock("wbtc_jungle", SoundType.STONE);
	public static final Block FLOOR_ACACIA = new WBTCBlock("wbtc_acacia", SoundType.STONE);
	public static final Block FLOOR_DARK_OAK = new WBTCBlock("wbtc_dark_oak", SoundType.STONE);
	
	// Floor Blocks
	public static final Block FLOOR_CHECKERBOARD = new WBTCBlock("wbtc_checkerboard", SoundType.STONE);
	public static final Block FLOOR_TILE_1 = new WBTCBlock("wbtc_floor_1", SoundType.STONE);
	public static final Block FLOOR_TILE_2 = new WBTCBlock("wbtc_floor_2", SoundType.STONE);
	public static final Block FLOOR_TILE_3 = new WBTCBlock("wbtc_floor_3", SoundType.STONE);
	public static final Block FLOOR_TILE_4 = new WBTCBlock("wbtc_floor_4", SoundType.STONE);
	public static final Block FLOOR_TILE_5 = new WBTCBlock("wbtc_floor_5", SoundType.STONE);
	public static final Block FLOOR_TILE_6 = new WBTCBlock("wbtc_floor_6", SoundType.CLOTH);
}
