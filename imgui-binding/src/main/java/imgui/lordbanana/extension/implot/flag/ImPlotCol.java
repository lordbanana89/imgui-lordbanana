package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotCol {
    private ImPlotCol() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotCol_")
    public Void __;
}
