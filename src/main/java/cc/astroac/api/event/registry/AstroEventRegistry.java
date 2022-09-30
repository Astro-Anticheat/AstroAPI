package cc.astroac.api.event.registry;


import cc.astroac.api.event.AstroEvent;
import cc.astroac.api.event.AstroListener;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

public class AstroEventRegistry {
    private final List<AstroListener> listeners = new ArrayList<>();

    public boolean fireEvent(AstroEvent event) {
        this.listeners.forEach(e -> e.onAstroEvent(event));
        return event.isCancel();
    }

    public void addListener(AstroListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        } else {
            Bukkit.getLogger().warning("You already have registered event " + listener.getClass().getSimpleName());
        }
    }

    public void removeListener(AstroListener listener) {
        listeners.remove(listener);
    }

    public void shutdown() {
        listeners.clear();
    }
}
