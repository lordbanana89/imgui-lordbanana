package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotAxis {
    private ImPlotAxis() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImAxis_")
    public Void __;
}
