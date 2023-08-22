package cc.astroac.api.event.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
@AllArgsConstructor
public class AstroMitigationEvent {
    private final Player player;
    private final String check, type, info, description;
    private final int currentViolationLevel, maxVl;
    private boolean experimental;
}
