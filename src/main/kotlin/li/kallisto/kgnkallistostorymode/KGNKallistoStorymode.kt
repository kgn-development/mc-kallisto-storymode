package li.kallisto.kgnkallistostorymode

import li.kallisto.kgnkallistostorymode.block.ModBlocks
import li.kallisto.kgnkallistostorymode.datagen.ModDataGenerator
import li.kallisto.kgnkallistostorymode.item.ModItems
import net.minecraft.resources.ResourceLocation
import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.neoforge.forge.runForDist

@Mod(KGNKallistoStorymode.ID)
object KGNKallistoStorymode {
    const val ID = "kgnkallistostorymode"

    val LOGGER: Logger = LogManager.getLogger(ID)

    init {
        LOGGER.log(Level.INFO, "initializing ${ID}")

        ModBlocks.BLOCKS.register(MOD_BUS)
        ModItems.ITEMS.register(MOD_BUS)

        MOD_BUS.addListener(ModDataGenerator::onGatherClientData)

        val obj = runForDist(clientTarget = {

        }, serverTarget = {

        })
    }


    fun locate(name: String): ResourceLocation {
        return ResourceLocation.fromNamespaceAndPath(ID, name)
    }
}
