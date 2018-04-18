package commands.ownercommands;

import commands.Command;
import core.Main;
import jdk.net.SocketFlow;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.rmi.MarshalledObject;

public class cmdShutdown implements Command{
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (Owners.get(event.getAuthor())) {
            event.getMessage().getTextChannel().sendMessage(new EmbedBuilder().setDescription(":arrow_double_down: " +  "   Bot shutdown!   " + ":arrow_double_down: ").build()).queue();

            Main.shardManager.shutdown();



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
