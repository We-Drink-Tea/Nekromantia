package dev.we_drink_tea.nekromantia

import dev.we_drink_tea.nekromantia.registery.BlocksRegistry
import dev.we_drink_tea.nekromantia.registery.EntityBlocksRegistry
import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer

object Nekromantia : ModInitializer {
    override fun onInitialize(mod: ModContainer) {
        // ItemsRegistry
        BlocksRegistry
        EntityBlocksRegistry
    }
}
