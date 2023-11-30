package cc.astroac.api.event.impl;

import cc.astroac.api.event.AstroEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class AstroAddUserEvent extends AstroEvent {
    @Setter
    private int protocolVersion;
    private UUID uuid;
}
