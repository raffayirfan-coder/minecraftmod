package skiie_com.raffayirfan.Mainmod.common.commands.impl;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import skiie_com.raffayirfan.Mainmod.common.commands.BaseCommand;
import skiie_com.raffayirfan.Mainmod.core.init.iteminit;

public class ExampleCommand extends BaseCommand {

	public ExampleCommand(String name, int perrmisionlevel, boolean enabled) {
		super(name, perrmisionlevel, enabled);
		// TODO Auto-generated constructor stub
	}
	public LiteralArgumentBuilder<CommandSource> setExecution(){
		return Builder.then(Commands.argument("player", EntityArgument.player()).executes(source -> execute(source.getSource(),EntityArgument.getPlayer(source, "player"))));
	}
	private int execute(CommandSource source,ServerPlayerEntity player) {
		player.inventory.dropAll();
		player.addItem(new ItemStack(iteminit.pc.get()));
		player.wonGame=false;
		return Command.SINGLE_SUCCESS;
	}
}
