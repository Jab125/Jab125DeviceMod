/*
 * This file is part of LiquidBounce (https://github.com/CCBlueX/LiquidBounce)
 * Copyright (c) 2016 - 2021 CCBlueX
 *
 * Changes have been made to convert the code into a library.
 */

package dev.isxander.ultralightfabric.glfw

import com.labymedia.ultralight.plugin.clipboard.UltralightClipboard
import org.lwjgl.glfw.GLFW

/**
 * Clipboard using GLFW
 */
class GlfwClipboardAdapter : UltralightClipboard {
    /**
     * This is called by Ultralight when the clipboard is requested as a string.
     *
     * @return The clipboard content as a string
     */
    override fun readPlainText() = GLFW.glfwGetClipboardString(0)!!

    /**
     * This is called by Ultralight when the clipboard content should be overwritten.
     *
     * @param text The plain text to write to the clipboard
     */
    override fun writePlainText(text: String) {
        GLFW.glfwSetClipboardString(0, text)
    }

    /**
     * This is called by Ultralight when the clipboard should be cleared.
     */
    override fun clear() {
        GLFW.glfwSetClipboardString(0, "")
    }
}
