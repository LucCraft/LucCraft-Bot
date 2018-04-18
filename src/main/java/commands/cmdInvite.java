package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import util.STATIC;

import java.awt.*;

public class cmdInvite implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event){
        return false;

    }

    @Override
    public void action(String[] args, MessageReceivedEvent event){
        EmbedBuilder eb = new EmbedBuilder()
                .setColor(Color.CYAN)
                .setFooter("© LucCraft Bot v." + STATIC.VERSION, "https://cdn.discordapp.com/attachments/431475995560640524/433956881464164357/IMG-20170611-WA00061.jpg");
        event.getTextChannel().sendMessage(eb.setDescription("https://discordapp.com/oauth2/authorize?client_id=432970904696389634&scope=bot&permissions=66186303").build()).queue();

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
