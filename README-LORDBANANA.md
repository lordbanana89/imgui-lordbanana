# imgui-lordbanana

Our **own** Dear ImGui Java binding for Flash Replay — built from upstream
[SpaiR/imgui-java](https://github.com/SpaiR/imgui-java) `v1.90.0` (Dear ImGui
**1.90.9 docking** branch), Apache-2.0. This is **not** a fork of moulberry's
binding; it is an independent rebrand we own end-to-end, designed to be *better*:
arch coverage upstream/moulberry lack, and a wider curated extension set for a
cinematic/replay editor.

## What makes it ours / better

- **Package** relocated `imgui` → `imgui.lordbanana` (every binding class, the
  generated tree, and the LWJGL3 glue). JNI symbols are emitted by `javac -h`
  from the FQN, so the recompiled natives export `Java_imgui_lordbanana_*`.
- **Native library** renamed `imgui-java64` → `imgui-lordbanana-java64`, extracted
  from a private resource folder `com/lordbanana/imgui-natives/` — collision-proof
  on a shared Minecraft classloader (coexists with any other imgui-java a mod ships).
- **Arch-aware loader** (`ImGui.nativeClassifierDir()`): resolves
  `com/lordbanana/imgui-natives/<classifier>/<lib>` where classifier ∈
  `windows-x86_64 | linux-x86_64 | linux-arm64 | macos` (macOS = universal
  x86_64+arm64). Upstream SpaiR and the moulberry fork branch on OS only, so they
  cannot ship linux-x86_64 and linux-arm64 in one jar — we can. Falls back to a flat
  `com/lordbanana/imgui-natives/<lib>` path for compatibility.
- **Extensions compiled in** (curated for a cinematic timeline editor): Dear ImGui
  core (docking), ImPlot, imnodes, imgui-node-editor, ImGuizmo, imgui-knobs,
  imgui_memory_editor, **ImGuiColorTextEdit** and **ImGuiFileDialog** (the last two
  are present-but-disabled upstream — we enable them). Author-our-own bindings for
  imspinner / imgui-notify / the ImGuizmo sub-tools (ImCurveEdit/ImSequencer/
  ImGradient/ImZoomSlider) is a planned follow-up phase.

## Build

The Java binding compiles locally; the **native binaries must be built in CI**
(per-OS toolchains: mingw cross for Windows, an arm64 runner for linux-arm64,
`lipo` universal for macOS). See `.github/workflows/build-natives.yml` — it runs
`./gradlew imgui-binding:generateLibs -Denvs=<env> -Dfreetype=true` per classifier
(FreeType statically vendored, no runtime dependency) and assembles
`imgui-lordbanana-natives.jar` with the classifier-folder layout the loader expects.

Submodules must be checked out recursively (`include/imgui` = ocornut/imgui at the
1.90.9 docking commit, plus implot/imnodes/imguizmo/imgui-node-editor/imgui-knobs/
imgui_club/ImGuiColorTextEdit/ImGuiFileDialog).

## Consuming in Flash Replay

Replace the two vendored jars in `tharidia-replay/deps/`:
`imgui-binding-1.90.0.jar` (now `imgui.lordbanana.*` classes) and `imgui-natives.jar`
(now `com/lordbanana/imgui-natives/<classifier>/imgui-lordbanana-java64.*`), then
migrate the 91 source files importing `imgui.moulberry90.*` → `imgui.lordbanana.*`
and update the native-path filter in `build.gradle`
(`com/moulberry/imgui-natives/` → `com/lordbanana/imgui-natives/`).

## Provenance / license

Derived from SpaiR/imgui-java (Apache-2.0); Dear ImGui and the bundled extensions
retain their own (MIT/zlib) licenses — see each `include/<ext>` submodule. The
relocation + arch-aware loader + extension selection are our changes.
