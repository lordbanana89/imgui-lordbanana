package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotInfLinesFlags {
    private ImPlotInfLinesFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotInfLinesFlags_")
    public Void __;
}
