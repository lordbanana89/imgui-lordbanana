package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotStemsFlags {
    private ImPlotStemsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotStemsFlags_")
    public Void __;
}
