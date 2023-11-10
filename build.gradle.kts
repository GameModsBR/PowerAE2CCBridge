import java.net.URI

/*
 * Copyright (c) 2022 Leon Linhart
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

plugins {
    java
    alias(libs.plugins.loom)
}

version = "1.1.0.0-1.20.1-FABRIC"

tasks {
    compileJava {
        options.release.set(17)
    }

    processResources {
        inputs.property("version", version)

        filesMatching("fabric.mod.json") {
            expand("version" to "${project.version}")
        }
    }
}

repositories {
    mavenCentral()

    maven(url = "https://maven.bai.lol") {
        content {
            includeGroup("lol.bai")
            includeGroup("mcp.mobius.waila")
        }
    }

    maven(url = "https://maven.shedaniel.me/") {
        content {
            includeGroup("me.shedaniel.cloth")
            includeGroup("me.shedaniel.cloth.api")
        }
    }

    maven(url = "https://maven.terraformersmc.com/") {
        content {
            includeGroup("com.terraformersmc")
        }
    }

    maven(url = "https://modmaven.dev/") {
        content {
            includeGroup("appeng")
            includeGroup("mezz.jei")
        }
    }

    maven(url = "https://squiddev.cc/maven") {
        content {
            includeGroup("org.squiddev")
        }
    }

    maven(url = "https://squiddev.cc/maven/") {
        content {
            includeGroup("cc.tweaked")
            includeModule("org.squiddev", "Cobalt")
        }
    }

    exclusiveContent {
        forRepository {
            maven {
                name = "Modrinth"
                url = URI("https://api.modrinth.com/maven")
            }
        }
        filter {
            includeGroup("maven.modrinth")
        }
    }
}

dependencies {
    minecraft(libs.minecraft)
    mappings("net.fabricmc:yarn:1.20.1+build.10")

    modImplementation(libs.fabric.api)
    modImplementation(libs.fabric.loader)

    modImplementation(libs.ae2)
    modRuntimeOnly(libs.ae2.runtime)

    modImplementation(libs.cc.tweaked)
    modRuntimeOnly(libs.cc.tweaked.runtime)
}
