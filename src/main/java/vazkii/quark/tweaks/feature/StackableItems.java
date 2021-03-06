/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 *
 * Quark is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 *
 * File Created @ [18/03/2016, 23:01:43 (GMT)]
 */
package vazkii.quark.tweaks.feature;

import com.google.common.collect.ImmutableSet;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import vazkii.quark.base.module.Feature;

public class StackableItems extends Feature {

	//	int potions;
	int minecarts;

	@Override
	public void setupConfig() {
		//		potions = loadPropInt("Potions", "", 8);
		minecarts = loadPropInt("Minecarts", "", 16);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		//		ImmutableSet.<Item>of(Items.potionitem, Items.splash_potion, Items.lingering_potion)
		//			.forEach(item -> item.setMaxStackSize(potions));

		ImmutableSet.<Item>of(Items.MINECART, Items.CHEST_MINECART, Items.COMMAND_BLOCK_MINECART, Items.FURNACE_MINECART, Items.HOPPER_MINECART, Items.TNT_MINECART)
		.forEach(item -> item.setMaxStackSize(minecarts));
	}

}
