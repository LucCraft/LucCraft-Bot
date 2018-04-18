package commands;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdHelp implements Command {

    @Override

    public boolean called(String[] args, MessageReceivedEvent event){
        return false;

    }

    @Override
    public void action(String[] args, MessageReceivedEvent event){
        event.getTextChannel().sendMessage("Momentane Commands:" +
                "     /ping      " +
                "     /help      " +
                "     /info      " +
                "     /invite    ").queue();
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event){
        System.out.println(" [Info] Command /help wurde ausgeführt!" );
    }


    @Override
    public String help(){
        return null;
    }
}


