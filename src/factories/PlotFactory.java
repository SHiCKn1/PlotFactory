package factories;

import epicCrisies.EpicCrisis;
import plots.Plot;
import characters.Character;

public interface PlotFactory {
    Character createCharacter();
    EpicCrisis createEpicCrisis();
    Plot createPlot();
    //ClassicDisneyPlotFactory
    //ContemporaryDisneyPlotFactory
    //MarvelCharacterPlotFactory
}
