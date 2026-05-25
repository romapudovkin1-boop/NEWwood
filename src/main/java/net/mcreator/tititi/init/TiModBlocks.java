/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tititi.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.tititi.block.YellowWoodedBlock;
import net.mcreator.tititi.TiMod;

import java.util.function.Function;

public class TiModBlocks {
	public static Block YELLOW_WOODED;

	public static void load() {
		YELLOW_WOODED = register("yellow_wooded", YellowWoodedBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(TiMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}