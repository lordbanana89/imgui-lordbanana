package imgui.lordbanana.internal;

import imgui.lordbanana.binding.ImGuiStruct;
import imgui.lordbanana.binding.annotation.BindingField;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public class ImGuiWindow extends ImGuiStruct {
    public ImGuiWindow(final long ptr) {
        super(ptr);
        ImGui.init();
    }

    /*JNI
        #include "_common.h"
        #include "_internal.h"
        #define THIS ((ImGuiWindow*)STRUCT_PTR)
     */

    /**
     * Is scrollbar visible?
     */
    @BindingField(accessors = BindingField.Accessor.GETTER)
    public boolean ScrollbarX;

    /**
     * Is scrollbar visible?
     */
    @BindingField(accessors = BindingField.Accessor.GETTER)
    public boolean ScrollbarY;

    /*JNI
        #undef THIS
     */
}
