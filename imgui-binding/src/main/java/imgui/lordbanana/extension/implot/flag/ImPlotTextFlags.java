package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotTextFlags {
    private ImPlotTextFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotTextFlags_")
    public Void __;
}
