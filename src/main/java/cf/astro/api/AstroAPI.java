package cf.astro.api;

import cf.astro.api.event.registry.AstroEventRegistry;

public enum AstroAPI {
    INSTANCE;
    private static AstroEventRegistry astroEventRegistry;

    public void init() {
        astroEventRegistry = getAstroEventRegistry();
    }

    public void terminate() {
        getAstroEventRegistry().shutdown();
    }

    public AstroEventRegistry getAstroEventRegistry() {
        if(astroEventRegistry == null) astroEventRegistry = new AstroEventRegistry();
        return astroEventRegistry;
    }
}
