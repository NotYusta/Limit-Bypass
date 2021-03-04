package id.raznar.limitbypass;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class Listeners implements Listener {
    @EventHandler
    public void bypassLimit(PlayerLoginEvent p) {
        String permission = "lb.bypass";
        Player player = p.getPlayer();
        if(p.getResult() == PlayerLoginEvent.Result.KICK_FULL && player.hasPermission(permission)) {
            p.setResult(PlayerLoginEvent.Result.ALLOWED);
            player.sendMessage(Utils.Color("&aSYou bypassed the player limit!"));
        }
    }
}
