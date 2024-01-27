package de.guntram.mcmod.fabrictools.Types;

/**
 * @author gbl
 */
public interface SliderValueConsumer {
    public void onConfigChanging(String option, Object value);
    public boolean wasMouseReleased();
    public void setMouseReleased(boolean value);
}
