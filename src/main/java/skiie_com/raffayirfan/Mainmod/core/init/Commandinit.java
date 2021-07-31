package skiie_com.raffayirfan.Mainmod.core.init;

import java.util.ArrayList;

import com.mojang.brigadier.CommandDispatcher;

import net.minecraft.command.CommandSource;
import net.minecraftforge.event.RegisterCommandsEvent;
import skiie_com.raffayirfan.Mainmod.common.commands.BaseCommand;
import skiie_com.raffayirfan.Mainmod.common.commands.impl.ExampleCommand;

public class Commandinit {
	private static ArrayList<BaseCommand> commands=new ArrayList<>();
	
	public static void registerCommands(final RegisterCommandsEvent event) {
		CommandDispatcher<CommandSource> dispatcher =event.getDispatcher();
		commands.add(new ExampleCommand("pleasegiveme",4,true));
		commands.forEach(command ->{
			if(command.isEnabled()&&command.setExecution()!=null) {
				dispatcher.register(command.getBuilder());
			}
		});
	}
}

