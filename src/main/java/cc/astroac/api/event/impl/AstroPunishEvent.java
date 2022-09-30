package cc.astroac.api.event.impl;

import cc.astroac.api.event.AstroEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
@AllArgsConstructor
public final class AstroPunishEvent extends AstroEvent {
    private final Player player;
    private final String check, type;
    private final double currentBuffer;
}