package io.github.feylostt.originsbyleah;

import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OriginsByLeah implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Leah's Origins");
	public static final String MODID = "originsbyleah";

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}

	public static Identifier identifier(String path) {
		return new Identifier(OriginsByLeah.MODID, path);
	}
}
