package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotColormap {
    private ImPlotColormap() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotColormap_")
    public Void __;
}
