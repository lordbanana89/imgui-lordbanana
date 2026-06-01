package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotItemFlags {
    private ImPlotItemFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotItemFlags_")
    public Void __;
}
