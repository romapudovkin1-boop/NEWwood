package net.mcreator.tititi.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.tititi.init.TiModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements TiModBiomes.TiModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> ti_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.ti_dimensionTypeReference != null) {
			retval = TiModBiomes.adaptSurfaceRule(retval, this.ti_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void settiDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.ti_dimensionTypeReference = dimensionType;
	}
}