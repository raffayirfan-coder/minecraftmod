package skiie_com.raffayirfan.Mainmod.core.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import skiie_com.raffayirfan.Mainmod.Mainmod;
//import skiie_com.raffayirfan.Mainmod.common.blocks.BaseHorizontalBlock;

public class blockinit {
	public static final DeferredRegister<Block> BLOCKS =DeferredRegister.create(ForgeRegistries.BLOCKS,Mainmod.MODID);
	public static final RegistryObject<Block> dias_ore= BLOCKS.register("dias_ore",
			() -> new Block(AbstractBlock.Properties.of(Material.METAL,MaterialColor.LAPIS )
					.instabreak().harvestTool(ToolType.PICKAXE).strength(2.5f,5f)
					.harvestLevel(1).sound(SoundType.METAL)
					.requiresCorrectToolForDrops()));
//	public static final RegistryObject<CustomBlock> gpu=BLOCKS.register("3080", 
//			()->new CustomBlock(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.METAL).requiresCorrectToolForDrops());
}
