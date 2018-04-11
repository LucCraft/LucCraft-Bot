package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import util.STATIC;

import java.awt.*;

public class cmdPing implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event){
        return false;

    }

    @Override
    public void action(String[] args, MessageReceivedEvent event){
        EmbedBuilder eb = new EmbedBuilder()
                .setColor(Color.CYAN)
                .setFooter("© LucCraft Bot v." + STATIC.VERSION, "https://cdn.discordapp.com/avatars/385131037975642112/5b01b8df1556a4900a43cc70f22daf81.png");
        event.getTextChannel().sendMessage(eb.setDescription("Der Ping von mir ist: " + event.getAuthor().getJDA().getPing()).build()).queue();

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
