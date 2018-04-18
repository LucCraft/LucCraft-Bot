package listeners;
        import net.dv8tion.jda.core.EmbedBuilder;
        import net.dv8tion.jda.core.entities.ChannelType;
        import net.dv8tion.jda.core.entities.PrivateChannel;
        import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
        import net.dv8tion.jda.core.hooks.ListenerAdapter;

        import util.DATA;

public class PrivateMessage extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            if (event.getChannelType().equals(ChannelType.PRIVATE)) {

                String Content = event.getMessage().getContentDisplay();
                String Author = event.getAuthor().getName() + "#" + event.getAuthor().getDiscriminator();

                PrivateChannel byBackfish = event.getJDA().getUserById(DATA.byBackfish).openPrivateChannel().complete();
                PrivateChannel TheDev = event.getJDA().getUserById(DATA.TheDev).openPrivateChannel().complete();

                byBackfish.sendMessage(new EmbedBuilder().setTitle("Neue Private Nachricht von " + Author + " .").setDescription(Content).build()).queue();
                TheDev.sendMessage(new EmbedBuilder().setTitle("Neue Private Nachricht von " + Author + " .").setDescription(Content).build()).queue();

            }
        }
    }
}