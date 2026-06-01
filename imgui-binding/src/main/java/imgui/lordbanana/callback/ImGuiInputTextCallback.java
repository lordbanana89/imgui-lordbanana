package imgui.lordbanana.callback;

import imgui.lordbanana.ImGuiInputTextCallbackData;

import java.util.function.Consumer;

/**
 * Callback to use in {@link imgui.lordbanana.ImGui#inputText(String, imgui.lordbanana.type.ImString, int, ImGuiInputTextCallback)}.
 */
public abstract class ImGuiInputTextCallback implements Consumer<ImGuiInputTextCallbackData> {
    /**
     * This function will be called by the native Callback and wrapped.
     */
    public final void accept(final long ptr) {
        accept(new ImGuiInputTextCallbackData(ptr));
    }
}
