package cc.astroac.api.event.impl;

import cc.astroac.api.event.AstroEvent;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class AstroAddUserEvent extends AstroEvent {
    private int protocolVersion;
    private UUID uuid;
}
