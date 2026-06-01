package imgui.lordbanana.callback;

/**
 * Callback to supply Java string form native code.
 */
public abstract class ImStrConsumer {
    public abstract void accept(String str);
}
