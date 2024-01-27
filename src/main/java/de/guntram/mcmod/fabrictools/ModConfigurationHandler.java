package de.guntram.mcmod.fabrictools;

/**
 * @author gbl
 */
public interface ModConfigurationHandler {
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event);
    default public void onConfigChanging(ConfigChangedEvent.OnConfigChangingEvent event) {}
    public Configuration getConfig();
    default public IConfiguration getIConfig() { return getConfig(); }
}
