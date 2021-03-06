package stuff;

import net.dv8tion.jda.core.EmbedBuilder;

import java.awt.*;

public class Embed {

    public static EmbedBuilder success(String title, String description) {
        return new EmbedBuilder().setTitle(":white_check_mark: " + title).setDescription(description).setColor(Color.C_SUCCES);
    }

    public static EmbedBuilder error(String title, String description) {
        return new EmbedBuilder().setTitle(":warning: " + title).setDescription(description).setColor(Color.C_ERROR);
    }

    public static EmbedBuilder normal(String title, String description) {
        return new EmbedBuilder().setTitle(title).setDescription(description).setColor(Color.C_NORMAL);
    }

    public static EmbedBuilder no_permission() {
        return new EmbedBuilder().setTitle(":warning: No permissions").setDescription("You dont have permission to excute this command!").setColor(Color.C_ERROR);
    }
}
