package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotCond {
    private ImPlotCond() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotCond_")
    public Void __;
}
