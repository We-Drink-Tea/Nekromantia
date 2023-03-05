package dev.we_drink_tea.nekromantia.registery

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ItemGroupRegistry {
    private val ExampleItemGroup: ItemGroup? = FabricItemGroup
        .builder(Identifier("nekromantia", "example_group"))
        .name(Text.literal("Nekromantia"))
        .icon { ItemStack(ItemsRegistry.CustomExampleItem) }
        .build()

    val ExampleItemGroupItems = ItemGroupEvents.modifyEntriesEvent(ExampleItemGroup).register { content ->
        content.addItem(ItemsRegistry.ExampleItem)
        content.addItem(ItemsRegistry.CustomExampleItem)
    }
}
