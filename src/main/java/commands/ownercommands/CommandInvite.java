package commands.ownercommands;

import commands.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import stuff.Embed;

public class CommandInvite implements Command {




    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (Owners.get(event.getAuthor())) {
            String[] split = event.getMessage().getContentRaw().split(" : ");
            String serverlink = event.getJDA().getGuildById(split[1]).getTextChannels().get(0).createInvite().setMaxAge(500).complete().getURL();

            event.getTextChannel().sendMessage(Embed.normal(":information_source: Invite", "Invite: " + serverlink).build()).queue();

        }
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
    }

    @Override
    public String help() {
        return null;
    }
}
