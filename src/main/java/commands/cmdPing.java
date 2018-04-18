package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import stuff.Embed;
import util.STATIC;

import java.awt.*;

public class cmdPing implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event){
        return false;

    }

    @Override
    public void action(String[] args, MessageReceivedEvent event){

        event.getTextChannel().sendMessage("Mein Ping ist:" + event.getAuthor().getJDA().getPing());

    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event){
        System.out.println(" [Info] Command /ping wurde ausgeführt!" );
    }

    @Override
    public String help(){
        return null;
    }
}
