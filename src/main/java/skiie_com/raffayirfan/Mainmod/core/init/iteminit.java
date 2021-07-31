package skiie_com.raffayirfan.Mainmod.core.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import skiie_com.raffayirfan.Mainmod.Mainmod;

public class iteminit {
	public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,Mainmod.MODID);
	public static final RegistryObject<Item> diamond_apple=ITEMS.register("diamond_apple",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)
			.food(new Food.Builder().effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 600, 9), 1.0f)
					.effect(() -> new EffectInstance(Effects.ABSORPTION,1200), 1f)
					.fast().alwaysEat().saturationMod(0.1f).build())));
	
	public static final RegistryObject<Item> blue_ingot=ITEMS.register("blue_ingot",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> pc=ITEMS.register("pc",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	//blocks
	public static final RegistryObject<BlockItem> dias_ore =ITEMS.register("dias_ore",
			() -> new BlockItem(blockinit.dias_ore.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
}
