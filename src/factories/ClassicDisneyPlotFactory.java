package factories;

import characters.Character;
import characters.ClassicDisneyCharacter;
import epicCrisies.ClassicDisneyEpicCrisis;
import epicCrisies.EpicCrisis;
import plots.ClassicDisneyPlot;
import plots.Plot;

public class ClassicDisneyPlotFactory implements PlotFactory{
    @Override
    public Character createCharacter() {
        return new ClassicDisneyCharacter();
    }

    @Override
    public EpicCrisis createEpicCrisis() {
        return new ClassicDisneyEpicCrisis();
    }

    @Override
    public Plot createPlot() {
        return new ClassicDisneyPlot();
    }
}
