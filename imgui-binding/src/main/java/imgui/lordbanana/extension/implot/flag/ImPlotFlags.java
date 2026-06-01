package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotFlags {
    private ImPlotFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotFlags_")
    public Void __;
}
