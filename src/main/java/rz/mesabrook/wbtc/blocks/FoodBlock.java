package rz.mesabrook.wbtc.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rz.mesabrook.wbtc.Main;
import rz.mesabrook.wbtc.init.ModBlocks;
import rz.mesabrook.wbtc.init.ModItems;
import rz.mesabrook.wbtc.util.IHasModel;
import rz.mesabrook.wbtc.util.TooltipRandomizer;

public class FoodBlock extends Block implements IHasModel
{
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	private int containerItems = 1;
	
	public FoodBlock(String name, MapColor color, int tier, CreativeTabs tab)
	{
		super(Material.CLAY, color);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.SLIME);
		setHardness(1.0F);
		setResistance(3.0F);
		setCreativeTab(tab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		TooltipRandomizer.ChosenTooltip();
		
		// Tiers
		if(tier == 1)
		{
			containerItems = 9;
		}
		else if(tier == 2)
		{
			containerItems = 18;
		}
		else if(tier == 3)
		{
			containerItems = 27;
		}
		else if(tier == 4)
		{
			containerItems = 36;
		}
		else if(tier == 5)
		{
			containerItems = 45;
		}
	}
	
	@Override
    public boolean isFullCube(IBlockState state)
    {
        return true;
    }

	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return true;
    }
	
	@Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        this.setDefaultFacing(worldIn, pos, state);
    }

    private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            IBlockState iblockstate = worldIn.getBlockState(pos.north());
            IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
            IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
            IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

            if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
            {
                enumfacing = EnumFacing.SOUTH;
            }
            else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
            {
                enumfacing = EnumFacing.NORTH;
            }
            else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
            {
                enumfacing = EnumFacing.EAST;
            }
            else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
            {
                enumfacing = EnumFacing.WEST;
            }

            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
        }
    }
	
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(FACING).getHorizontalIndex();
    }
    
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, FACING);
    }
	
    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag flag)
	{
		// Randomizer
		tooltip.add(TextFormatting.LIGHT_PURPLE + TooltipRandomizer.result);
		
		if(this.getUnlocalizedName().contains("pork"))
		{
			tooltip.add(TextFormatting.AQUA + "Contains " + containerItems + TextFormatting.GREEN + " Raw Porkchops");
		}
		else if(this.getUnlocalizedName().contains("beef"))
		{
			tooltip.add(TextFormatting.AQUA + "Contains 9 " + TextFormatting.GREEN + "Raw Steaks");
		}
		else if(this.getUnlocalizedName().contains("chicken"))
		{
			tooltip.add(TextFormatting.AQUA + "Contains 9 " + TextFormatting.GREEN + "Raw Chickens");
		}
		else if(this.getUnlocalizedName().contains("rabbit"))
		{
			tooltip.add(TextFormatting.AQUA + "Contains 9 " + TextFormatting.GREEN + "Raw Rabbits");
		}
		else if(this.getUnlocalizedName().contains("mutton"))
		{
			tooltip.add(TextFormatting.AQUA + "Contains 9 " + TextFormatting.GREEN + "Raw Mutton");
		}
		
		super.addInformation(stack, world, tooltip, flag);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if(this.getUnlocalizedName().contains("pork"))
		{
			world.playSound(player, pos, SoundEvents.ENTITY_PIG_AMBIENT, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
		else if(this.getUnlocalizedName().contains("beef"))
		{
			world.playSound(player, pos, SoundEvents.ENTITY_COW_AMBIENT, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
		else if(this.getUnlocalizedName().contains("chicken"))
		{
			world.playSound(player, pos, SoundEvents.ENTITY_CHICKEN_AMBIENT, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
		else if(this.getUnlocalizedName().contains("mutton"))
		{
			world.playSound(player, pos, SoundEvents.ENTITY_SHEEP_AMBIENT, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
		else if(this.getUnlocalizedName().contains("rabbit"))
		{
			world.playSound(player, pos, SoundEvents.ENTITY_RABBIT_AMBIENT, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
		
		return true;
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
