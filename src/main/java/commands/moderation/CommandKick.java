package commands.moderation;
import commands.Command;
import commands.ownercommands.Owners;
import core.*;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.PrivateChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class CommandKick implements Command {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (event.getAuthor().getId() == event.getGuild().getOwner().getUser().getId() || event.getMember().hasPermission(Permission.KICK_MEMBERS) || Owners.get(event.getAuthor())) {
            Message msg = event.getMessage();
            if (msg.getMentionedUsers().isEmpty()) {

            } else {
                Member User = msg.getGuild().getMember(msg.getMentionedUsers().get(0));
                if (!msg.getGuild().getSelfMember().canInteract(User)) {

                } else {
                    if (!User.getUser().isBot()) {
                        PrivateChannel channel = User.getUser().openPrivateChannel().complete();

                    }
                    msg.getGuild().getController().kick(User).queue();

                }
            }
        } else {

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
