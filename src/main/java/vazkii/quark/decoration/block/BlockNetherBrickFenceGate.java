/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [19/06/2016, 04:05:25 (GMT)]
 */
package vazkii.quark.decoration.block;

import net.minecraft.block.SoundType;
import vazkii.quark.base.block.BlockModFenceGate;

public class BlockNetherBrickFenceGate extends BlockModFenceGate {

	public BlockNetherBrickFenceGate() {
		super("nether_brick_fence_gate");
		setHardness(2.0F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
	}
	
}