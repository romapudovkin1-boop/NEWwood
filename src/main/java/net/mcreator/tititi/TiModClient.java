package net.mcreator.tititi;

import net.mcreator.tititi.init.TiModBlocksRenderers;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class TiModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		TiModBlocksRenderers.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}