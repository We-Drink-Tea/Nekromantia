package dev.we_drink_tea.nekromantia

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Nekromantia : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Nekromantia")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("Hello Quilt world from {}!", mod.metadata()?.name())
    }
}
