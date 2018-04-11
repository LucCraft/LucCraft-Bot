package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import util.STATIC;

import java.awt.*;

public class cmdInvite implements Command{
    @Override

    public boolean called(String[] args, MessageReceivedEvent event){
        return false;

    }

    @Override
    public void action(String[] args, MessageReceivedEvent event){
        EmbedBuilder eb = new EmbedBuilder()
                .setColor(Color.CYAN)
                .setFooter("© LucCraft Bot v." + STATIC.VERSION, "https://cdn.discordapp.com/avatars/385131037975642112/5b01b8df1556a4900a43cc70f22daf81.png");

    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event){
        System.out.println(" [Info] Command /invite wurde ausgeführt!" );
    }

    @Override
    public String help(){
        return null;
    }
}
