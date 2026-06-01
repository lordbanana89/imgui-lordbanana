package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotHistogramFlags {
    private ImPlotHistogramFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotHistogramFlags_")
    public Void __;
}
