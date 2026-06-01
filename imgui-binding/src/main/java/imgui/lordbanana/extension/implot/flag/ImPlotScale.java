package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotScale {
    private ImPlotScale() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotScale_")
    public Void __;
}
