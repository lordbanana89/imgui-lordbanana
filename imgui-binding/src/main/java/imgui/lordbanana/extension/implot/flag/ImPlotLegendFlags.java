package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotLegendFlags {
    private ImPlotLegendFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotLegendFlags_")
    public Void __;
}
