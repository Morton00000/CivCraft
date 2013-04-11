package civcraft;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import civcraft.blocks.Blocks;
import civcraft.blocks.Machines;
import civcraft.creativetabs.CreativeTabBlock;
import civcraft.creativetabs.CreativeTabCombat;
import civcraft.creativetabs.CreativeTabMaterials;
import civcraft.creativetabs.CreativeTabMisc;
import civcraft.creativetabs.CreativeTabTools;
import civcraft.items.Items;
import civcraft.items.armor.Armor;
import civcraft.items.block.ItemBlockOre;
import civcraft.items.block.ItemBlocks;
import civcraft.items.materials.Materials;
import civcraft.items.toolheads.Molds;
import civcraft.items.toolheads.ToolHeads;
import civcraft.items.tools.Tools;
import civcraft.network.PacketHandler;
import civcraft.proxy.CommonProxy;
import civcraft.recipes.CraftingHandler;
import civcraft.recipes.RecipesArmor;
import civcraft.recipes.RecipesBlocks;
import civcraft.recipes.RecipesItems;
import civcraft.recipes.RecipesMaterials;
import civcraft.recipes.RecipesMolds;
import civcraft.recipes.RecipesTools;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "CivCraft", name = "CivCraft", version = "test-ver 0.6.2")
@NetworkMod(channels = "CivCraft", clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class CivCraftBase {

	@Instance("CivCraft")
	public static CivCraftBase instance = new CivCraftBase();

	@SidedProxy(clientSide = "civcraft.proxy.ClientProxy", serverSide = "civcraft.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs tabsMaterials = new CreativeTabMaterials(CreativeTabs.getNextID(), "CivCraft Materials");
	public static CreativeTabs tabsTools = new CreativeTabTools(CreativeTabs.getNextID(), "CivCraft Tools");
	public static CreativeTabs tabsCombat = new CreativeTabCombat(CreativeTabs.getNextID(), "CivCraft Combat");
	public static CreativeTabs tabsBlock = new CreativeTabBlock(CreativeTabs.getNextID(), "CivCraft Blocks");
	public static CreativeTabs tabsMisc = new CreativeTabMisc(CreativeTabs.getNextID(), "CivCraft Misc");

	@PreInit
	public void load(FMLPreInitializationEvent preEvent) {
		ConfigurationHandler.init(new File(preEvent.getModConfigurationDirectory().getAbsolutePath() + "\\civcraft\\" + "CivCraft" + ".cfg"));

	}

	@SuppressWarnings("deprecation")
	@Init
	public void load(FMLInitializationEvent event) {

		// Blocks
		Blocks.init();
		Machines.init();

		RecipesBlocks.init();

		// Items
		Items.init();
		Materials.init();
		Tools.init();
		Armor.init();
		Molds.init();
		ToolHeads.init();

		RecipesItems.init();
		RecipesMaterials.init();
		RecipesTools.init();
		RecipesArmor.init();
		RecipesMolds.init();

		proxy.initTileEntities();

		proxy.initRenderingAndTextures();

		NetworkRegistry.instance().registerGuiHandler(instance, proxy);

		// *Registry*
		// Fuel
		GameRegistry.registerFuelHandler(new FuelHandler());

		// Crafting
		GameRegistry.registerCraftingHandler(new CraftingHandler());

		// World Gen
		GameRegistry.registerWorldGenerator(new WorldGen());

		// Ore
		GameRegistry.registerBlock(Blocks.ore, ItemBlockOre.class, "ore");
		for (int ix = 0; ix < 11; ix++) {
			ItemStack oreStack = new ItemStack(Blocks.ore, 1, ix);
			LanguageRegistry.addName(oreStack, Blocks.oreNames[oreStack.getItemDamage()]);
		}

		// Block
		GameRegistry.registerBlock(Blocks.block, ItemBlocks.class, "block");
		for (int ix = 0; ix < 16; ix++) {
			ItemStack blockStack = new ItemStack(Blocks.block, 1, ix);
			LanguageRegistry.addName(blockStack, Blocks.blockNames[blockStack.getItemDamage()]);
		}

		// Dust
		for (int ix = 0; ix < 19; ix++) {
			ItemStack dustStack = new ItemStack(Materials.dust, 1, ix);
			LanguageRegistry.addName(dustStack, Materials.dustNames[dustStack.getItemDamage()]);
		}

		// Ingot
		for (int ix = 0; ix < 16; ix++) {
			ItemStack ingotStack = new ItemStack(Materials.ingot, 1, ix);
			LanguageRegistry.addName(ingotStack, Materials.ingotNames[ingotStack.getItemDamage()]);
		}

		// Misc
		for (int ix = 0; ix < 9; ix++) {
			ItemStack miscStack = new ItemStack(Items.misc, 1, ix);
			LanguageRegistry.addName(miscStack, Items.miscNames[miscStack.getItemDamage()]);
		}

		// Axe
		for (int ix = 0; ix < 10; ix++) {
			ItemStack axeStack = new ItemStack(ToolHeads.axeHead, 1, ix);
			LanguageRegistry.addName(axeStack, ToolHeads.axeHeadNames[axeStack.getItemDamage()]);
		}

		// Hoe
		for (int ix = 0; ix < 10; ix++) {
			ItemStack hoeStack = new ItemStack(ToolHeads.hoeHead, 1, ix);
			LanguageRegistry.addName(hoeStack, ToolHeads.hoeHeadNames[hoeStack.getItemDamage()]);
		}

		// Spade
		for (int ix = 0; ix < 10; ix++) {
			ItemStack spadeStack = new ItemStack(ToolHeads.spadeHead, 1, ix);
			LanguageRegistry.addName(spadeStack, ToolHeads.spadeHeadNames[spadeStack.getItemDamage()]);
		}

		// Pick
		for (int ix = 0; ix < 10; ix++) {
			ItemStack pickStack = new ItemStack(ToolHeads.pickHead, 1, ix);
			LanguageRegistry.addName(pickStack, ToolHeads.pickHeadNames[pickStack.getItemDamage()]);
		}

		// Sword
		for (int ix = 0; ix < 10; ix++) {
			ItemStack swordStack = new ItemStack(ToolHeads.swordHead, 1, ix);
			LanguageRegistry.addName(swordStack, ToolHeads.swordHeadNames[swordStack.getItemDamage()]);
		}

		// Mold
		for (int ix = 0; ix < 9; ix++) {
			ItemStack moldStack = new ItemStack(Molds.mold, 1, ix);
			LanguageRegistry.addName(moldStack, Molds.moldNames[moldStack.getItemDamage()]);
		}

		// *Textures*
		// GUI
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/gui/furnaceBlast.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/gui/furnaceInd.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/gui/furnaceMold.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/gui/crusher1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/gui/crusher2.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/gui/plasticOven.png");

		// Armor
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/aluminum_1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/aluminum_2.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/copper_1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/copper_2.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/bronze_1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/bronze_2.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/steel_1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/steel_2.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/carbide_1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/carbide_2.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/titanium_1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/titanium_2.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/de-uranium_1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/de-uranium_2.png");

		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/kevlar_1.png");
		MinecraftForgeClient.preloadTexture("/mods/CivCraft/textures/armor/kevlar_2.png");

	}

	@PostInit
	public void load(FMLPostInitializationEvent postEvent) {

	}
}