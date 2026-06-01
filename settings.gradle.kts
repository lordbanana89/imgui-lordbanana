plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.10.0")
}

rootProject.name = "imgui-lordbanana"
include("imgui-binding")
include("imgui-lwjgl3")
// imgui-binding-natives: legacy maven-natives packaging; our CI assembles the natives jar itself
// imgui-app + example are upstream demos, not part of the binding we ship
