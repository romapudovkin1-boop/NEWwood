package net.mcreator.tititi.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class YellowWoodedBlock extends Block {
	public YellowWoodedBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1.7f, 10f).replaceable());
	}
}