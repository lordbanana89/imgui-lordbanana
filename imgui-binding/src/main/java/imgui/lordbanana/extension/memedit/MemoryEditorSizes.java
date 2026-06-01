package imgui.lordbanana.extension.memedit;

import imgui.lordbanana.binding.ImGuiStructDestroyable;
import imgui.lordbanana.binding.annotation.BindingField;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class MemoryEditorSizes extends ImGuiStructDestroyable {
    public MemoryEditorSizes() {
        super();
    }

    public MemoryEditorSizes(final long ptr) {
        super(ptr);
    }

    @Override
    protected long create() {
        return nCreate();
    }

    /*JNI
        #include "_memedit.h"
        #define THIS ((MemoryEditor::Sizes*)STRUCT_PTR)
     */

    private native long nCreate(); /*
        return (uintptr_t)(new MemoryEditor::Sizes());
    */

    @BindingField
    public int AddrDigitsCount;

    @BindingField
    public float LineHeight;

    @BindingField
    public float GlyphWidth;

    @BindingField
    public float HexCellWidth;

    @BindingField
    public float SpacingBetweenMidCols;

    @BindingField
    public float PosHexStart;

    @BindingField
    public float PosHexEnd;

    @BindingField
    public float PosAsciiStart;

    @BindingField
    public float PosAsciiEnd;

    @BindingField
    public float WindowWidth;

    /*JNI
        #undef THIS
     */
}
