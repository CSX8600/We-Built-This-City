package rz.mesabrook.wbtc.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import rz.mesabrook.wbtc.Main;
import rz.mesabrook.wbtc.blocks.BlockHandrail;
import rz.mesabrook.wbtc.blocks.BlockStatue;
import rz.mesabrook.wbtc.blocks.ChromaScreen;
import rz.mesabrook.wbtc.blocks.TrashBin;
import rz.mesabrook.wbtc.blocks.MiscBlock;
import rz.mesabrook.wbtc.blocks.SignStand;
import rz.mesabrook.wbtc.blocks.Pillar;
import rz.mesabrook.wbtc.blocks.PillarBase;
import rz.mesabrook.wbtc.blocks.food.FoodBlock;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Ceiling Block
	public static final Block CEILING = new MiscBlock("panel_ceiling", SoundType.STONE, Main.WBTC_TAB_CEILING);
	
	// Ceiling Blocks
	public static final Block PANEL_OAK_L = new MiscBlock("panel_oak_l", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_SPRUCE_L = new MiscBlock("panel_spruce_l", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_BIRCH_L = new MiscBlock("panel_birch_l", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_FLOOR_JUNGLE_L = new MiscBlock("panel_jungle_l", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_ACACIA_L = new MiscBlock("panel_acacia_l", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_DARK_OAK_L = new MiscBlock("panel_dark_oak_l", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_CHECKERBOARD = new MiscBlock("panel_checkerboard", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_1 = new MiscBlock("panel_floor_tile_1", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_2 = new MiscBlock("panel_floor_tile_2", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_3 = new MiscBlock("panel_floor_tile_3", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_4 = new MiscBlock("panel_floor_tile_4", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_5 = new MiscBlock("panel_floor_tile_5", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_6 = new MiscBlock("panel_floor_tile_6", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_7 = new MiscBlock("panel_floor_tile_7", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_8 = new MiscBlock("panel_floor_tile_8", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_9 = new MiscBlock("panel_floor_tile_9", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_10 = new MiscBlock("panel_floor_tile_10", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_11 = new MiscBlock("panel_floor_tile_11", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_12 = new MiscBlock("panel_floor_tile_12", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_13 = new MiscBlock("panel_floor_tile_13", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_14 = new MiscBlock("panel_floor_tile_14", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_15 = new MiscBlock("panel_floor_tile_15", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_16 = new MiscBlock("panel_floor_tile_16", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_17 = new MiscBlock("panel_floor_tile_17", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_TILE_18 = new MiscBlock("panel_floor_tile_18", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_DANGER_1 = new MiscBlock("panel_floor_danger_1", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_DANGER_2 = new MiscBlock("panel_floor_danger_2", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_DANGER_3 = new MiscBlock("panel_floor_danger_3", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_DANGER_4 = new MiscBlock("panel_floor_danger_4", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_KITCHEN_1 = new MiscBlock("panel_floor_kitchen_1", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_KITCHEN_2 = new MiscBlock("panel_floor_kitchen_2", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_DRAIN_1 = new MiscBlock("panel_floor_drain_1", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_DRAIN_2 = new MiscBlock("panel_floor_drain_2", SoundType.STONE, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_WHITE = new MiscBlock("panel_wool_white", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_ORANGE = new MiscBlock("panel_wool_orange", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_MAGENTA = new MiscBlock("panel_wool_magenta", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_LBLUE = new MiscBlock("panel_wool_lblue", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_YELLOW = new MiscBlock("panel_wool_yellow", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_LIME = new MiscBlock("panel_wool_lime", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_PINK = new MiscBlock("panel_wool_pink", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_GRAY = new MiscBlock("panel_wool_gray", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_SILVER = new MiscBlock("panel_wool_silver", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_CYAN = new MiscBlock("panel_wool_cyan", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_PURPLE = new MiscBlock("panel_wool_purple", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_BLUE = new MiscBlock("panel_wool_blue", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_BROWN = new MiscBlock("panel_wool_brown", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_GREEN = new MiscBlock("panel_wool_green", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_RED = new MiscBlock("panel_wool_red", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	public static final Block PANEL_WOOL_BLACK = new MiscBlock("panel_wool_black", SoundType.CLOTH, Main.WBTC_TAB_CEILING);
	
	// Laminate Wood Floor Blocks
	public static final Block FLOOR_OAK = new MiscBlock("wbtc_oak", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_SPRUCE = new MiscBlock("wbtc_spruce", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_BIRCH = new MiscBlock("wbtc_birch", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_JUNGLE = new MiscBlock("wbtc_jungle", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_ACACIA = new MiscBlock("wbtc_acacia", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_DARK_OAK = new MiscBlock("wbtc_dark_oak", SoundType.STONE, Main.WBTC_TAB);
	
	// Floor Blocks
	public static final Block FLOOR_CHECKERBOARD = new MiscBlock("wbtc_checkerboard", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_1 = new MiscBlock("wbtc_floor_1", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_2 = new MiscBlock("wbtc_floor_2", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_3 = new MiscBlock("wbtc_floor_3", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_4 = new MiscBlock("wbtc_floor_4", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_5 = new MiscBlock("wbtc_floor_5", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_6 = new MiscBlock("wbtc_floor_6", SoundType.CLOTH, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_7 = new MiscBlock("wbtc_floor_7", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_8 = new MiscBlock("wbtc_floor_8", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_9 = new MiscBlock("wbtc_floor_9", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_10 = new MiscBlock("wbtc_floor_10", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_11 = new MiscBlock("wbtc_floor_11", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_12 = new MiscBlock("wbtc_floor_12", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_13 = new MiscBlock("wbtc_floor_13", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_14 = new MiscBlock("wbtc_floor_14", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_15 = new MiscBlock("wbtc_floor_15", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_16 = new MiscBlock("wbtc_floor_16", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_17 = new MiscBlock("wbtc_floor_17", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_TILE_18 = new MiscBlock("wbtc_floor_18", SoundType.STONE, Main.WBTC_TAB);
	
	// Misc Blocks
	public static final Block WHITE_STONE = new MiscBlock("white_stone", SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block EPIC_SLAB = new MiscBlock("epic_slab", SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	
	// Commercial Kitchen Floor Blocks
	public static final Block FLOOR_KITCHEN_1 = new MiscBlock("floor_kitchen_1", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_DRAIN_1 = new MiscBlock("floor_drain_1", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_KITCHEN_2 = new MiscBlock("floor_kitchen_2", SoundType.STONE, Main.WBTC_TAB);
	public static final Block FLOOR_DRAIN_2 = new MiscBlock("floor_drain_2", SoundType.STONE, Main.WBTC_TAB);
	
	// Industrial Floor Blocks
	public static final Block INDUSTRIAL_TILE_1 = new MiscBlock("floor_danger_1", SoundType.STONE, Main.WBTC_TAB);
	public static final Block INDUSTRIAL_TILE_2 = new MiscBlock("floor_danger_2", SoundType.STONE, Main.WBTC_TAB);
	public static final Block INDUSTRIAL_TILE_3 = new MiscBlock("floor_danger_3", SoundType.STONE, Main.WBTC_TAB);
	public static final Block INDUSTRIAL_TILE_4 = new MiscBlock("floor_danger_4", SoundType.STONE, Main.WBTC_TAB);
	
	// Quartz Pillar and Base. May not make it into next version.
	public static final Block PILLAR_BASE = new PillarBase("pillar_base");
	public static final Block PILLAR_TOP = new PillarBase("pillar_top");
	public static final Block PILLAR_POST = new Pillar("wbtc_pillar", 0);
	
	// Handrails
	public static final Block IRON_HANDRAIL = new BlockHandrail("iron_handrail", Material.IRON, SoundType.METAL, "pickaxe");
	public static final Block WOOD_HANDRAIL = new BlockHandrail("wood_handrail", Material.WOOD, SoundType.WOOD, "axe");

	// Chroma Screen Panels
	public static final Block CHROMA_GREEN = new ChromaScreen("chroma_green", Material.IRON, SoundType.METAL, "pickaxe");
	public static final Block CHROMA_BLUE = new ChromaScreen("chroma_blue", Material.IRON, SoundType.METAL, "pickaxe");
	
	// Food Cubes
	public static final Block CUBE_PORK = new FoodBlock("cube_pork", MapColor.PINK, SoundType.SLIME,CreativeTabs.FOOD);
	public static final Block CUBE_BEEF = new FoodBlock("cube_beef", MapColor.RED, SoundType.SLIME, CreativeTabs.FOOD);
	public static final Block CUBE_CHICKEN = new FoodBlock("cube_chicken", MapColor.SNOW,SoundType.SLIME, CreativeTabs.FOOD);
	public static final Block CUBE_MUTTON = new FoodBlock("cube_mutton", MapColor.RED, SoundType.SLIME, CreativeTabs.FOOD);
	public static final Block CUBE_RABBIT = new FoodBlock("cube_rabbit", MapColor.PINK, SoundType.SLIME, CreativeTabs.FOOD);
	public static final Block CUBE_APPLES = new FoodBlock("cube_apples", MapColor.RED, SoundType.WOOD, CreativeTabs.FOOD);
	
	// Aluminum
	public static final Block CUBE_ALUMINUM = new MiscBlock("aluminum_block", SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block ALUMINUM_ORE = new MiscBlock("wbtc_aluminum_ore", SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	
	// Sign stand
	public static final Block SIGN_STAND = new SignStand("sign_stand", Material.IRON, SoundType.METAL, 1.0F, 1.0F, "pickaxe", 0, Main.WBTC_TAB);
	
	// Trophies
	public static final Block STATUE_OWO = new BlockStatue("statue_owo", MapColor.BLUE);
	public static final Block STATUE_RZ = new BlockStatue("statue_rz", MapColor.GRAY);
	public static final Block STATUE_CSX = new BlockStatue("statue_csx", MapColor.GRAY);
	public static final Block STATUE_TD = new BlockStatue("statue_td", MapColor.GRAY);
	public static final Block STATUE_TLZ = new BlockStatue("statue_tlz", MapColor.GRAY);
	public static final Block STATUE_MD = new BlockStatue("statue_md", MapColor.GRAY);
	public static final Block STATUE_LW = new BlockStatue("statue_lw", MapColor.GRAY);
	public static final Block STATUE_SVV = new BlockStatue("statue_svv", MapColor.GRAY);
}