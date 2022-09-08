package cf.astro.api.event.impl;

import cf.astro.api.event.AstroEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
@AllArgsConstructor
public final class AstroPunishEvent extends AstroEvent {
    private final Player astroPlayer;
    private final String check, type;
    private final double currentBuffer;
}
