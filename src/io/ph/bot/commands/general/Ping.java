package io.ph.bot.commands.general;

import java.awt.Color;

import io.ph.bot.commands.Command;
import io.ph.bot.commands.CommandData;
import io.ph.bot.model.Permission;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;

@CommandData (
		defaultSyntax = "ping",
		aliases = {"ping"},
		permission = Permission.NONE,
		description = "Am I alive?",
		example = ""
		)
public class Ping extends Command {
	@Override
	public void executeCommand(Message msg) {
		EmbedBuilder em = new EmbedBuilder();
		em.setTitle("Ping?", null)
		.setDescription("Pong!")
		.setColor(Color.MAGENTA);
		msg.getChannel().sendMessage(em.build()).queue();
	}
}
