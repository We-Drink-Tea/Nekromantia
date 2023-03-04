package dev.we_drink_tea.nekromantia.item

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class CustomExampleItem(settings: Settings) : Item(settings) {
    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        user?.playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, 1f, 1f)

        return TypedActionResult.success(user?.getStackInHand(hand))
    }
}
