package cc.astroac.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class AstroBlacklistEvent {
    private final String name;
    private final UUID uuid;
}
