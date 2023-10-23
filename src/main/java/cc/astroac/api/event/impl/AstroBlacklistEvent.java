package cc.astroac.api.event.impl;

import cc.astroac.api.data.AstroPlayer;
import cc.astroac.api.event.AstroEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class AstroBlacklistEvent extends AstroEvent {
    private final AstroPlayer player;
}
