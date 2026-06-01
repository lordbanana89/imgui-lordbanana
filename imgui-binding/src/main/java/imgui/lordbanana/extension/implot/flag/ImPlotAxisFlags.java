package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotAxisFlags {
    private ImPlotAxisFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotAxisFlags_")
    public Void __;
}
