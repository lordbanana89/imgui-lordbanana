package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotLineFlags {
    private ImPlotLineFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotLineFlags_")
    public Void __;
}
