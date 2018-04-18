package commands.moderation;

import com.sun.xml.internal.ws.api.handler.MessageHandler;
import commands.Command;
import commands.ownercommands.Owners;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.PrivateChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class CommandBan implements Command {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (event.getAuthor().getId() == event.getGuild().getOwner().getUser().getId() || event.getMember().hasPermission(Permission.BAN_MEMBERS) || Owners.get(event.getAuthor())) {
            Message msg = event.getMessage();
            if (msg.getMentionedUsers().size()== 0) {

            } else {
                Member User = msg.getGuild().getMember(msg.getMentionedUsers().get(0));
                if (!msg.getGuild().getSelfMember().canInteract(User)) {

                } else {
                    if (!User.getUser().isBot()) {
                        PrivateChannel channel = User.getUser().openPrivateChannel().complete();

                    }
                    msg.getGuild().getController().ban(User, 1).queue();


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
