package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotBarsFlags {
    private ImPlotBarsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotBarsFlags_")
    public Void __;
}
