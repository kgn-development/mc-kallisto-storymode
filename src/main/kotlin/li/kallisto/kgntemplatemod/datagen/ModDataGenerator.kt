package li.kallisto.kgntemplatemod.datagen

import li.kallisto.kgntemplatemod.datagen.providers.ModModelProvider
import net.neoforged.neoforge.data.event.GatherDataEvent

object ModDataGenerator {
    fun onGatherClientData(event: GatherDataEvent.Client) {
        val generator = event.generator
        val packOutput = generator.packOutput
        val lookupProvider = event.lookupProvider

        generator.addProvider(true, ModModelProvider(packOutput))
    }
}