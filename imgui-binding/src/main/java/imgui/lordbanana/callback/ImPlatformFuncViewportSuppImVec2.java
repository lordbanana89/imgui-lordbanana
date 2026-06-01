package imgui.lordbanana.callback;

import imgui.lordbanana.ImGuiViewport;
import imgui.lordbanana.ImVec2;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*) - ImVec2
 */
public abstract class ImPlatformFuncViewportSuppImVec2 {
    public abstract void get(ImGuiViewport vp, ImVec2 dstImVec2);
}
