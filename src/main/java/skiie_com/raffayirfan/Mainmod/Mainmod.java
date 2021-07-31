package skiie_com.raffayirfan.Mainmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import skiie_com.raffayirfan.Mainmod.core.init.Commandinit;
import skiie_com.raffayirfan.Mainmod.core.init.blockinit;
import skiie_com.raffayirfan.Mainmod.core.init.iteminit;
import skiie_com.raffayirfan.Mainmod.world.OreGeneration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("mainvideosmod")
public class Mainmod
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID="mainvideosmod";

    public Mainmod() {
    	IEventBus bus =FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        iteminit.ITEMS.register(bus);
        blockinit.BLOCKS.register(bus);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH,OreGeneration::generateOre);
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public void OnCommandRegister(final RegisterCommandsEvent event) {
    	Commandinit.registerCommands(event);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
    
}
