package tk.zekro.chaincrafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.SidedProxy;
import tk.zekro.chaincrafting.proxies.chaincrafting_proxy;

@Mod(modid="chaincrafting", name="ChainCrafting", version="1.0.0-0011")
public class chaincrafting {

	@Instance(value="chaincrafting")
	public static chaincrafting instance;
	
	@SidedProxy(clientSide="tk.zekro.chaincrafting.proxies.chaincrafting_clientproxy", serverSide="tk.zekro.chaincrafting.proxies.chaincrafting_proxy")
	public static chaincrafting_proxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {}
	
	//MAIN
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		
		loadrecepies();
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {}
	
	
	
	private void loadrecepies() {
		
		//Crafting: Helmet
		GameRegistry.addShapedRecipe(new ItemStack (Items.chainmail_helmet, 1), 
				"XXX",
				"X0X",
				"000",
				Character.valueOf('X'), Blocks.iron_bars
		);
		
		//Crafting: Chestplate
		GameRegistry.addShapedRecipe(new ItemStack (Items.chainmail_chestplate, 1), 
				"X0X",
				"XXX",
				"XXX",
				Character.valueOf('X'), Blocks.iron_bars
		);
		
		//Crafting: Leggins
		GameRegistry.addShapedRecipe(new ItemStack (Items.chainmail_leggings, 1), 
				"XXX",
				"X0X",
				"X0X",
				Character.valueOf('X'), Blocks.iron_bars
		);
		
		//Crafting: Boots
		GameRegistry.addShapedRecipe(new ItemStack (Items.chainmail_boots, 1), 
				"000",
				"X0X",
				"X0X",
				Character.valueOf('X'), Blocks.iron_bars
		);
	}
	
}

//©2016 zekro