package skiie_com.raffayirfan.Mainmod.world;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import skiie_com.raffayirfan.Mainmod.core.init.blockinit;

public class OreGeneration {
	
	public static void generateOre(final BiomeLoadingEvent event) {
		if(!(event.getCategory().equals(Biome.Category.NETHER))||
				!(event.getCategory().equals(Biome.Category.THEEND))) {
			generateore(event.getGeneration(),OreFeatureConfig.FillerBlockType.NATURAL_STONE,blockinit.dias_ore.get().defaultBlockState(),10,200);
			
		}
		
	}
	private static void generateore(BiomeGenerationSettingsBuilder settings,RuleTest FillerType,BlockState state, int veinSize,int amount) {
		settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.configured(new OreFeatureConfig(FillerType,state,veinSize))
				.range(64).squared().count(amount));
	}
	
}
