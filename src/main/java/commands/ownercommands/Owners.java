package commands.ownercommands;

import net.dv8tion.jda.core.entities.User;
import util.DATA;

public class Owners {
    public static Boolean get(User user) {
        boolean yes=false;
        if (user.getId().equals(DATA.byBackfish)||user.getId().equals(DATA.TheDev) || user.getId().equals(DATA.Dave)) {
            yes=true;
        }
        return yes;
    }
}
