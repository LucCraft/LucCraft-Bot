package listeners;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.apache.log4j.ConsoleAppender;
import util.STATIC;

import java.awt.*;
import java.util.SplittableRandom;

public class readyListener extends ListenerAdapter {
    public void onReady(ReadyEvent event) {
        EmbedBuilder eb = new EmbedBuilder()
                .setColor(Color.CYAN)
                .setFooter("© LucCraft Bot v." + STATIC.VERSION, "https://cdn.discordapp.com/avatars/385131037975642112/5b01b8df1556a4900a43cc70f22daf81.png");








    }
}