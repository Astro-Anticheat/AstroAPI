package cc.astroac.api.event.impl;

import cc.astroac.api.data.AstroPlayer;
import cc.astroac.api.event.AstroEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
@AllArgsConstructor
public class AstroMitigationEvent extends AstroEvent {
    private final AstroPlayer player;
    private final String check, type, info, description;
    private final int currentViolationLevel, maxVl;
    private boolean experimental;

    @Setter
    private boolean cancelAlert, cancelSetBack;
}
