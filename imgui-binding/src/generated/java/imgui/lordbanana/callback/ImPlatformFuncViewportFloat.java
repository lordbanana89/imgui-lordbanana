package imgui.lordbanana.callback;

import imgui.lordbanana.ImGuiViewport;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*, String)
 */
public abstract class ImPlatformFuncViewportFloat {
    public abstract void accept(ImGuiViewport vp, float f);
}
