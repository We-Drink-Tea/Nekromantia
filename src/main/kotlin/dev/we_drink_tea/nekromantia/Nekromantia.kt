package dev.we_drink_tea.nekromantia

import dev.we_drink_tea.nekromantia.registery.BlocksRegistry
import dev.we_drink_tea.nekromantia.registery.EntityBlocksRegistry
import dev.we_drink_tea.nekromantia.registery.ItemsRegistry
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer

object Nekromantia : ModInitializer {
    val ItemGroup: ItemGroup? = FabricItemGroup
        .builder(Identifier("nekromantia", "example_group"))
        .icon { ItemStack(ItemsRegistry.CustomExampleItem) }
        .build()

    override fun onInitialize(mod: ModContainer) {
        ItemsRegistry
        BlocksRegistry
        EntityBlocksRegistry

        //ItemGroupEvents.modifyEntriesEvent(ItemGroup).register { content -> content.addItem(ItemsRegistry.ExampleItem) }
    }
}
