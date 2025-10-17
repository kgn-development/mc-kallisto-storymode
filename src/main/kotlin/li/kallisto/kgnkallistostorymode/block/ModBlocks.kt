package li.kallisto.kgnkallistostorymode.block

import li.kallisto.kgnkallistostorymode.KGNKallistoStorymode
import li.kallisto.kgnkallistostorymode.item.ModItems
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.neoforged.neoforge.registries.DeferredBlock
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object ModBlocks {
    val BLOCKS = DeferredRegister.createBlocks(KGNKallistoStorymode.ID)

    fun registerBlockWithItem(
        name: String,
        blockSupplier: Supplier<Block>,
        blockProperties: BlockBehaviour.Properties,
        itemProperties: Item.Properties
    ): DeferredBlock<Block> {
        val blockKey = ResourceKey.create(Registries.BLOCK, KGNKallistoStorymode.locate(name))
        blockProperties.setId(blockKey)
        val itemKey = ResourceKey.create(Registries.ITEM, KGNKallistoStorymode.locate(name))
        itemProperties.useBlockDescriptionPrefix().setId(itemKey)
        val block = BLOCKS.register(name, blockSupplier)
        ModItems.ITEMS.register(name) { _ -> BlockItem(block.get(), itemProperties) }
        return block;
    }
}