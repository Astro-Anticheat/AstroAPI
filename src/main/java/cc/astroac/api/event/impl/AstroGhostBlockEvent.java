package cc.astroac.api.event.impl;

import cc.astroac.api.event.AstroEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

@Deprecated
@RequiredArgsConstructor
@Getter
public class AstroGhostBlockEvent extends AstroEvent {
    private final Player astroPlayer;
    private final Location position;
}
