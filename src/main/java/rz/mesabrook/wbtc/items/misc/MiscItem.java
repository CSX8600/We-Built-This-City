package rz.mesabrook.wbtc.items.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import rz.mesabrook.wbtc.Main;
import rz.mesabrook.wbtc.init.ModItems;
import rz.mesabrook.wbtc.util.IHasModel;

public class MiscItem extends Item implements IHasModel
{
	
	public MiscItem(String name, CreativeTabs tab, int stack)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(stack);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
