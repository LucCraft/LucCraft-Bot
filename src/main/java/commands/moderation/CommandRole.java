package commands.moderation;

import commands.Command;

import commands.ownercommands.Owners;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class CommandRole implements Command {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (event.getMember().hasPermission(Permission.MANAGE_ROLES) || event.getMember().isOwner() || Owners.get(event.getAuthor()))
            try {


                if (args.length < 1&&event.getMessage().getMentionedRoles().size()!=1&&event.getMessage().getMentionedMembers().size()!=1) {

                } else {
                    Role Role = event.getMessage().getMentionedRoles().get(0);
                    Member Member = event.getMessage().getMentionedMembers().get(0);
                    switch (args[0].toLowerCase()) {
                        case "add":

                            event.getGuild().getController().addSingleRoleToMember(Member, Role).queue();



                            break;
                        case "remove":

                            event.getGuild().getController().removeSingleRoleFromMember(Member, Role).queue();



                            break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
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
