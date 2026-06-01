package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotMouseTextFlags {
    private ImPlotMouseTextFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotMouseTextFlags_")
    public Void __;
}
