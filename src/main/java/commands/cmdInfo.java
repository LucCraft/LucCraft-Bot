package commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import util.STATIC;


public class cmdInfo implements Command {

        @Override

        public boolean called(String[] args, MessageReceivedEvent event){
            return false;

        }

        @Override
        public void action(String[] args, MessageReceivedEvent event){
            event.getTextChannel().sendMessage("Der Bot ist von @byBackfish programmiert!").queue();

        }

        @Override
        public void executed(boolean sucess, MessageReceivedEvent event){
            System.out.println(" [Info] Command /info wurde ausgeführt!" );
        }

        @Override
        public String help(){
            return null;
        }
    }




