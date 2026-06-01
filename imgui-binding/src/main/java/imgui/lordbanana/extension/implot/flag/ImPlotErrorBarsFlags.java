package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotErrorBarsFlags {
    private ImPlotErrorBarsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotErrorBarsFlags_")
    public Void __;
}
