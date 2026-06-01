package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotDragToolFlags {
    private ImPlotDragToolFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotDragToolFlags_")
    public Void __;
}
