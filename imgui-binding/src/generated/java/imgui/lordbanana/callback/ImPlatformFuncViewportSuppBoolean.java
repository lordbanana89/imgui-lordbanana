package imgui.lordbanana.callback;

import imgui.lordbanana.ImGuiViewport;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*) - Boolean
 */
public abstract class ImPlatformFuncViewportSuppBoolean {
    public abstract boolean get(ImGuiViewport vp);
}
