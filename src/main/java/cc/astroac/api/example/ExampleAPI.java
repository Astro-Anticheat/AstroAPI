package cc.astroac.api.example;

import cc.astroac.api.AstroAPI;
import cc.astroac.api.event.AstroEvent;
import cc.astroac.api.event.AstroListener;
import cc.astroac.api.event.impl.AstroFlagEvent;
import cc.astroac.api.event.impl.AstroPunishEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleAPI extends JavaPlugin implements AstroListener {

    @Override
    public void onEnable() {
        AstroAPI.INSTANCE.init();
        AstroAPI.INSTANCE.getAstroEventRegistry().addListener(this);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        AstroAPI.INSTANCE.terminate();
        super.onDisable();
    }

    @Override
    public void onAstroEvent(AstroEvent event) {
        if(event instanceof AstroFlagEvent) {
            // Stuff here
        } else if(event instanceof AstroPunishEvent) {
            // Stuff here
        }
    }
}
