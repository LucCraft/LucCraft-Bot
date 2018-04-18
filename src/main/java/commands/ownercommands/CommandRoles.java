package commands.ownercommands;

import commands.Command;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import stuff.Embed;

public class CommandRoles implements Command {




    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (event.getMember().hasPermission(Permission.MANAGE_ROLES) || event.getMember().isOwner() || Owners.get(event.getAuthor())){
            event.getTextChannel().sendMessage("Es gibt folgende Rollen" + event.getGuild().getRoles()).queue();



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
