package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotStairsFlags {
    private ImPlotStairsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotStairsFlags_")
    public Void __;
}
