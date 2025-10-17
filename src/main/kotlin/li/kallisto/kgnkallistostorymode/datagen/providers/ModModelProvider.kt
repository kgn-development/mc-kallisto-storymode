package li.kallisto.kgnkallistostorymode.datagen.providers

import li.kallisto.kgnkallistostorymode.KGNKallistoStorymode
import li.kallisto.kgnkallistostorymode.block.ModBlocks
import li.kallisto.kgnkallistostorymode.item.ModItems
import net.minecraft.client.data.models.BlockModelGenerators
import net.minecraft.client.data.models.ItemModelGenerators
import net.minecraft.client.data.models.ModelProvider
import net.minecraft.core.Holder
import net.minecraft.data.PackOutput
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import java.util.stream.Stream

class ModModelProvider(output: PackOutput) : ModelProvider(output, KGNKallistoStorymode.ID) {

    override fun registerModels(blockModels: BlockModelGenerators, itemModels: ItemModelGenerators) {

    }

    override fun getKnownBlocks(): Stream<out Holder<Block?>?> {
        return ModBlocks.BLOCKS.entries.stream().filter { true }
    }

    override fun getKnownItems(): Stream<out Holder<Item?>?> {
        return ModItems.ITEMS.entries.stream().filter { true }
    }
}