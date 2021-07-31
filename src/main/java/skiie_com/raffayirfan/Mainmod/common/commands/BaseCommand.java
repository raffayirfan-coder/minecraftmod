package skiie_com.raffayirfan.Mainmod.common.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

public class BaseCommand {
	protected LiteralArgumentBuilder<CommandSource> Builder;
	boolean enabled;
	public BaseCommand(String name,int perrmisionlevel,boolean enabled) {
		this.Builder=Commands.literal(name).requires(source -> source.hasPermission(perrmisionlevel));
		this.enabled=enabled;
	}
	public LiteralArgumentBuilder<CommandSource> getBuilder(){
		return Builder;
	}
	public boolean isEnabled(){
		return enabled;
	}
	public LiteralArgumentBuilder<CommandSource> setExecution(){
		return null;
	}
}
