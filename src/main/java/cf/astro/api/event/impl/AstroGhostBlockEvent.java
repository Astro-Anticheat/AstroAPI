package cf.astro.api.event.impl;

import cf.astro.api.event.AstroEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

@RequiredArgsConstructor
@Getter
public class AstroGhostBlockEvent extends AstroEvent {
    private final Player astroPlayer;
    private final Location position;
}
