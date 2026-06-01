package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotStyleVar {
    private ImPlotStyleVar() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotStyleVar_")
    public Void __;
}
