package commands.ownercommands;

import commands.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdsetGame implements Command{
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        String[] split = event.getMessage().getContentRaw().split(" : ");
        if (Owners.get(event.getAuthor())) {


            event.getJDA().getPresence().setGame(Game.playing(split[1]));
}



            if (split[1].equals("server")) {
                event.getJDA().getPresence().setGame(Game.playing("auf " + event.getJDA().getGuilds().size() + " Servern!" ));

            }

        if (split[1].equals("user")) {
            event.getJDA().getPresence().setGame(Game.watching("" + event.getGuild().getMembers().size() + "Users hinterher!" ));

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
