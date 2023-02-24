package dev.we_drink_tea.nekromantia.registery

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object BlocksRegistry {
    val ExampleSimpleBlock: Block = registerBlockWithItem(
        Block(AbstractBlock.Settings.of(Material.METAL)), Identifier("nekromantia", "example_block")
    )

    private fun registerBlockWithItem(
        registerBlock: Block,
        blockId: Identifier,
        settingsItem: Item.Settings = Item.Settings()
    ): Block {
        Registry.register(Registries.ITEM, blockId, BlockItem(registerBlock, settingsItem))
        return Registry.register(Registries.BLOCK, blockId, registerBlock)
    }
}
