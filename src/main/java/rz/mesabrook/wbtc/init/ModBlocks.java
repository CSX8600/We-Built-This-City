package rz.mesabrook.wbtc.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import rz.mesabrook.wbtc.blocks.WBTCBlock;
import rz.mesabrook.wbtc.blocks.WBTCPillar;
import rz.mesabrook.wbtc.blocks.WBTCPillarBase;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Ceiling Block
	public static final Block CEILING = new WBTCBlock("panel_ceiling", SoundType.STONE);
	
	// Ceiling Blocks
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
	public static final Block PANEL_TILE_7 = new WBTCBlock("panel_floor_tile_7", SoundType.STONE);
	public static final Block PANEL_TILE_8 = new WBTCBlock("panel_floor_tile_8", SoundType.STONE);
	public static final Block PANEL_TILE_9 = new WBTCBlock("panel_floor_tile_9", SoundType.STONE);
	public static final Block PANEL_TILE_10 = new WBTCBlock("panel_floor_tile_10", SoundType.STONE);
	public static final Block PANEL_TILE_11 = new WBTCBlock("panel_floor_tile_11", SoundType.STONE);
	public static final Block PANEL_TILE_12 = new WBTCBlock("panel_floor_tile_12", SoundType.STONE);
	public static final Block PANEL_TILE_13 = new WBTCBlock("panel_floor_tile_13", SoundType.STONE);
	public static final Block PANEL_TILE_14 = new WBTCBlock("panel_floor_tile_14", SoundType.STONE);
	public static final Block PANEL_TILE_15 = new WBTCBlock("panel_floor_tile_15", SoundType.STONE);
	public static final Block PANEL_TILE_16 = new WBTCBlock("panel_floor_tile_16", SoundType.STONE);
	public static final Block PANEL_TILE_17 = new WBTCBlock("panel_floor_tile_17", SoundType.STONE);
	public static final Block PANEL_TILE_18 = new WBTCBlock("panel_floor_tile_18", SoundType.STONE);
	public static final Block PANEL_DANGER_1 = new WBTCBlock("panel_floor_danger_1", SoundType.STONE);
	public static final Block PANEL_DANGER_2 = new WBTCBlock("panel_floor_danger_2", SoundType.STONE);
	public static final Block PANEL_DANGER_3 = new WBTCBlock("panel_floor_danger_3", SoundType.STONE);
	public static final Block PANEL_DANGER_4 = new WBTCBlock("panel_floor_danger_4", SoundType.STONE);
	public static final Block PANEL_KITCHEN_1 = new WBTCBlock("panel_floor_kitchen_1", SoundType.STONE);
	public static final Block PANEL_KITCHEN_2 = new WBTCBlock("panel_floor_kitchen_2", SoundType.STONE);
	public static final Block PANEL_DRAIN_1 = new WBTCBlock("panel_floor_drain_1", SoundType.STONE);
	public static final Block PANEL_DRAIN_2 = new WBTCBlock("panel_floor_drain_2", SoundType.STONE);

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
	public static final Block FLOOR_TILE_7 = new WBTCBlock("wbtc_floor_7", SoundType.STONE);
	public static final Block FLOOR_TILE_8 = new WBTCBlock("wbtc_floor_8", SoundType.STONE);
	public static final Block FLOOR_TILE_9 = new WBTCBlock("wbtc_floor_9", SoundType.STONE);
	public static final Block FLOOR_TILE_10 = new WBTCBlock("wbtc_floor_10", SoundType.STONE);
	public static final Block FLOOR_TILE_11 = new WBTCBlock("wbtc_floor_11", SoundType.STONE);
	public static final Block FLOOR_TILE_12 = new WBTCBlock("wbtc_floor_12", SoundType.STONE);
	public static final Block FLOOR_TILE_13 = new WBTCBlock("wbtc_floor_13", SoundType.STONE);
	public static final Block FLOOR_TILE_14 = new WBTCBlock("wbtc_floor_14", SoundType.STONE);
	public static final Block FLOOR_TILE_15 = new WBTCBlock("wbtc_floor_15", SoundType.STONE);
	public static final Block FLOOR_TILE_16 = new WBTCBlock("wbtc_floor_16", SoundType.STONE);
	public static final Block FLOOR_TILE_17 = new WBTCBlock("wbtc_floor_17", SoundType.STONE);
	public static final Block FLOOR_TILE_18 = new WBTCBlock("wbtc_floor_18", SoundType.STONE);
	
	// Commercial Kitchen Floor Blocks
	public static final Block FLOOR_KITCHEN_1 = new WBTCBlock("floor_kitchen_1", SoundType.STONE);
	public static final Block FLOOR_DRAIN_1 = new WBTCBlock("floor_drain_1", SoundType.STONE);
	public static final Block FLOOR_KITCHEN_2 = new WBTCBlock("floor_kitchen_2", SoundType.STONE);
	public static final Block FLOOR_DRAIN_2 = new WBTCBlock("floor_drain_2", SoundType.STONE);
	
	// Industrial Floor Blocks
	public static final Block INDUSTRIAL_TILE_1 = new WBTCBlock("floor_danger_1", SoundType.STONE);
	public static final Block INDUSTRIAL_TILE_2 = new WBTCBlock("floor_danger_2", SoundType.STONE);
	public static final Block INDUSTRIAL_TILE_3 = new WBTCBlock("floor_danger_3", SoundType.STONE);
	public static final Block INDUSTRIAL_TILE_4 = new WBTCBlock("floor_danger_4", SoundType.STONE);
	
	// Quartz Pillar and Base. May not make it into next version.
	public static final Block PILLAR_BASE = new WBTCPillarBase("pillar_base");
	public static final Block PILLAR_TOP = new WBTCPillarBase("pillar_top");
	public static final Block PILLAR_POST = new WBTCPillar("wbtc_pillar", 0);
}
