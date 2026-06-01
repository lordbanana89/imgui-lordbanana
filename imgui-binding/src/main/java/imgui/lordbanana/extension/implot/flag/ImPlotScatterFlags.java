package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotScatterFlags {
    private ImPlotScatterFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotScatterFlags_")
    public Void __;
}
