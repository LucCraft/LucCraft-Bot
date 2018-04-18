package core;


import commands.*;

import commands.moderation.CommandBan;
import commands.moderation.CommandClear;
import commands.moderation.CommandKick;
import commands.moderation.CommandRole;
import commands.ownercommands.*;
import commands.ownercommands.CommandRoles;
import listeners.PrivateMessage;
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
    public static JDA shardManager;




    public static void main(String[] Args)   {
        try{

        EmbedBuilder eb = new EmbedBuilder()
                .setColor(Color.CYAN)
                .setFooter("© LucCraft Bot v." + STATIC.VERSION, "https://cdn.discordapp.com/avatars/385131037975642112/5b01b8df1556a4900a43cc70f22daf81.png");


        JDABuilder builder = new JDABuilder(AccountType.BOT);


        builder.setToken(secrets.Token);
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.DO_NOT_DISTURB);


        builder.addEventListener(new commandListener());
        builder.addEventListener(new PrivateMessage());
        logger.info("Listeners loaded....");
        MySQL.connect();

        logger.info("MySQL connected!");


        commandHandler.commands.put("ping", new cmdPing());
        commandHandler.commands.put("help", new cmdHelp());
        commandHandler.commands.put("info", new cmdInfo());
        commandHandler.commands.put("shutdown", new cmdShutdown());
        commandHandler.commands.put("status", new cmdsetGame());
        commandHandler.commands.put("ban", new CommandBan());
        commandHandler.commands.put("kick", new CommandKick());
        commandHandler.commands.put("clear", new CommandClear());
        commandHandler.commands.put("guilds", new CommandGuilds());
        commandHandler.commands.put("ginvite", new CommandInvite());
        commandHandler.commands.put("invite", new cmdInvite());
        commandHandler.commands.put("role", new CommandRole());
        commandHandler.commands.put("roles", new CommandRoles());
        shardManager = builder.buildAsync();


        logger.info("Commands loaded...");
;

    } catch (Exception e) {
        e.printStackTrace();
    }

    }



    }
