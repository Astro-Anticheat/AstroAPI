package cc.astroac.api.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class AstroPlayer {
    UUID player;

    String playerName;
    String clientName;
    String version;

    long currentTick;
    long ping;

    Location location;
}
