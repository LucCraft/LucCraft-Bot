package listeners;

import core.Main;
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

import javax.security.auth.login.LoginException;
import java.awt.*;
import java.util.SplittableRandom;

public class readyListener extends ListenerAdapter {
    public void onReady(ReadyEvent event) {
        EmbedBuilder eb = new EmbedBuilder()
                .setColor(Color.CYAN)
                .setFooter("© LucCraft Bot v." + STATIC.VERSION, "https://cdn.discordapp.com/attachments/431475995560640524/433956881464164357/IMG-20170611-WA00061.jpg");

        try {
            event.wait(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}