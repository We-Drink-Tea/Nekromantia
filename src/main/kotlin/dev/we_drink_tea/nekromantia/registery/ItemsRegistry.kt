package dev.we_drink_tea.nekromantia.registery

import dev.we_drink_tea.nekromantia.item.CustomExampleItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ItemsRegistry {
    val ExampleItem: Item = Registry.register(
        Registries.ITEM,
        Identifier("nekromantia", "example_item"),
        Item(Item.Settings().maxCount(16))
    )

    val CustomExampleItem: Item = Registry.register(
        Registries.ITEM,
        Identifier("nekromantia", "custom_example_item"),
        CustomExampleItem(Item.Settings())
    )
}
