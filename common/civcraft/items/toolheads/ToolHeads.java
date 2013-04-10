package civcraft.items.toolheads;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import civcraft.lib.ItemIDs;

public class ToolHeads {

	// Axe Heads
	public static final Item axeHead = new HeadsAxe(ItemIDs.HEAD_AXE);

	public static final String[] axeHeadNames = { "Copper Axe Head", "Aluminum Axe Head", "Titanium Axe Head", "Depleted Uranium Axe Head", "Bronze Axe Head", "Steel Axe Head", "Carbide Axe Head", "Diamond Carbide Axe Head", "Iron Axe Head", "Gold Axe Head" };

	// Hoe Heads
	public static final Item hoeHead = new HeadsHoe(ItemIDs.HEAD_HOE);

	public static final String[] hoeHeadNames = { "Copper Hoe Head", "Aluminum Hoe Head", "Titanium Hoe Head", "Depleted Uranium Hoe Head", "Bronze Hoe Head", "Steel Hoe Head", "Carbide Hoe Head", "Diamond Carbide Hoe Head", "Iron Hoe Head", "Gold Hoe Head" };

	// Spade Head
	public static final Item spadeHead = new HeadsSpade(ItemIDs.HEAD_SPADE);

	public static final String[] spadeHeadNames = { "Copper Spade Head", "Aluminum Spade Head", "Titanium Spade Head", "Depleted Uranium Spade Head", "Bronze Spade Head", "Steel Spade Head", "Carbide Spade Head", "Diamond Carbide Spade Head", "Iron Spade Head", "Gold Spade Head" };

	// Pick Head
	public static final Item pickHead = new HeadsPick(ItemIDs.HEAD_PICK);

	public static final String[] pickHeadNames = { "Copper Pickaxe Head", "Aluminum Pickaxe Head", "Titanium Pickaxe Head", "Depleted Uranium Pickaxe Head", "Bronze Pickaxe Head", "Steel Pickaxe Head", "Carbide Pickaxe Head", "Diamond Carbide Pickaxe Head", "Iron Pickaxe Head", "Gold Pickaxe Head" };

	// Sword Head
	public static final Item swordHead = new HeadsSword(ItemIDs.HEAD_SWORD);

	public static final String[] swordHeadNames = { "Copper Sword Head", "Aluminum Sword Head", "Titanium Sword Head", "Depleted Uranium Sword Head", "Bronze Sword Head", "Steel Sword Head", "Carbide Sword Head", "Diamond Carbide Sword Head", "Iron Sword Head", "Gold Sword Head" };

	// Head Reference List
	// Axe
	public static ItemStack axeHeadCopper = new ItemStack(axeHead, 1, 0);
	public static ItemStack axeHeadAluminum = new ItemStack(axeHead, 1, 1);
	public static ItemStack axeHeadTitanium = new ItemStack(axeHead, 1, 2);
	public static ItemStack axeHeadDUranium = new ItemStack(axeHead, 1, 3);
	public static ItemStack axeHeadBronze = new ItemStack(axeHead, 1, 4);
	public static ItemStack axeHeadSteel = new ItemStack(axeHead, 1, 5);
	public static ItemStack axeHeadCarbide = new ItemStack(axeHead, 1, 6);
	public static ItemStack axeHeadDCarbide = new ItemStack(axeHead, 1, 7);
	public static ItemStack axeHeadIron = new ItemStack(axeHead, 1, 8);
	public static ItemStack axeHeadGold = new ItemStack(axeHead, 1, 9);

	// Hoe
	public static ItemStack hoeHeadCopper = new ItemStack(hoeHead, 1, 0);
	public static ItemStack hoeHeadAluminum = new ItemStack(hoeHead, 1, 1);
	public static ItemStack hoeHeadTitanium = new ItemStack(hoeHead, 1, 2);
	public static ItemStack hoeHeadDUranium = new ItemStack(hoeHead, 1, 3);
	public static ItemStack hoeHeadBronze = new ItemStack(hoeHead, 1, 4);
	public static ItemStack hoeHeadSteel = new ItemStack(hoeHead, 1, 5);
	public static ItemStack hoeHeadCarbide = new ItemStack(hoeHead, 1, 6);
	public static ItemStack hoeHeadDCarbide = new ItemStack(hoeHead, 1, 7);
	public static ItemStack hoeHeadIron = new ItemStack(hoeHead, 1, 8);
	public static ItemStack hoeHeadGold = new ItemStack(hoeHead, 1, 9);

	// Spade
	public static ItemStack spadeHeadCopper = new ItemStack(spadeHead, 1, 0);
	public static ItemStack spadeHeadAluminum = new ItemStack(spadeHead, 1, 1);
	public static ItemStack spadeHeadTitanium = new ItemStack(spadeHead, 1, 2);
	public static ItemStack spadeHeadDUranium = new ItemStack(spadeHead, 1, 3);
	public static ItemStack spadeHeadBronze = new ItemStack(spadeHead, 1, 4);
	public static ItemStack spadeHeadSteel = new ItemStack(spadeHead, 1, 5);
	public static ItemStack spadeHeadCarbide = new ItemStack(spadeHead, 1, 6);
	public static ItemStack spadeHeadDCarbide = new ItemStack(spadeHead, 1, 7);
	public static ItemStack spadeHeadIron = new ItemStack(spadeHead, 1, 8);
	public static ItemStack spadeHeadGold = new ItemStack(spadeHead, 1, 9);

	// Pickaxe
	public static ItemStack pickHeadCopper = new ItemStack(pickHead, 1, 0);
	public static ItemStack pickHeadAluminum = new ItemStack(pickHead, 1, 1);
	public static ItemStack pickHeadTitanium = new ItemStack(pickHead, 1, 2);
	public static ItemStack pickHeadDUranium = new ItemStack(pickHead, 1, 3);
	public static ItemStack pickHeadBronze = new ItemStack(pickHead, 1, 4);
	public static ItemStack pickHeadSteel = new ItemStack(pickHead, 1, 5);
	public static ItemStack pickHeadCarbide = new ItemStack(pickHead, 1, 6);
	public static ItemStack pickHeadDCarbide = new ItemStack(pickHead, 1, 7);
	public static ItemStack pickHeadIron = new ItemStack(pickHead, 1, 8);
	public static ItemStack pickHeadGold = new ItemStack(pickHead, 1, 9);

	// Sword
	public static ItemStack swordHeadCopper = new ItemStack(swordHead, 1, 0);
	public static ItemStack swordHeadAluminum = new ItemStack(swordHead, 1, 1);
	public static ItemStack swordHeadTitanium = new ItemStack(swordHead, 1, 2);
	public static ItemStack swordHeadDUranium = new ItemStack(swordHead, 1, 3);
	public static ItemStack swordHeadBronze = new ItemStack(swordHead, 1, 4);
	public static ItemStack swordHeadSteel = new ItemStack(swordHead, 1, 5);
	public static ItemStack swordHeadCarbide = new ItemStack(swordHead, 1, 6);
	public static ItemStack swordHeadDCarbide = new ItemStack(swordHead, 1, 7);
	public static ItemStack swordHeadIron = new ItemStack(swordHead, 1, 8);
	public static ItemStack swordHeadGold = new ItemStack(swordHead, 1, 9);

	public static void init() {

	}
}
