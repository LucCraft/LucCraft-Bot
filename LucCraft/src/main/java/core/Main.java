package core;


import commands.cmdHelp;
import commands.cmdInfo;
import commands.cmdInvite;
import commands.cmdPing;
import commands.ownercommands.cmdShutdown;
import listeners.commandListener;
import net.dv8tion.jda.bot.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.bot.sharding.ShardManager;
import net.dv8tion.jda.core.*;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.utils.SessionController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.STATIC;
import util.secrets;

import javax.security.auth.login.LoginException;
import java.awt.*;

public class Main {



    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static DefaultShardManagerBuilder builder = new DefaultShardManagerBuilder();
    public static SessionController sessionController;
    public static ShardManager shardManager;



    public static void main(String[] Args) {

        EmbedBuilder eb = new EmbedBuilder()
                .setColor(Color.CYAN)
                .setFooter("© LucCraft Bot v." + STATIC.VERSION, "https://cdn.discordapp.com/avatars/385131037975642112/5b01b8df1556a4900a43cc70f22daf81.png");



       JDABuilder builder = new JDABuilder(AccountType.BOT);




        builder.setToken(secrets.Token);
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.DO_NOT_DISTURB);


        builder.addEventListener(new commandListener());
        logger.info("Listeners loaded....");












        commandHandler.commands.put("ping", new cmdPing());
        commandHandler.commands.put("help", new cmdHelp());
        commandHandler.commands.put("info", new cmdInfo());
        commandHandler.commands.put("invite", new cmdInvite());
        commandHandler.commands.put("shutdown", new cmdShutdown());
        logger.info("Commands loaded...");

        try {
            JDA jda = builder.buildBlocking();
            jda.getPresence().setGame(Game.playing("auf " + jda.getGuilds().size() + " Servern"));
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    }
