package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotBin {
    private ImPlotBin() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotBin_")
    public Void __;
}
