package com.github.guillaumetaffin.matlabintellij.lang.psi

import com.github.guillaumetaffin.matlabintellij.lang.MatlabLanguage
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.psi.tree.IElementType


object Tokens {
    @JvmField
    val STRING_LITERAL = StringLiteral
}

sealed class MatlabTokenType(debugName: String) :
    IElementType(debugName, MatlabLanguage) {
    abstract val highlight: Array<TextAttributesKey>

    override fun toString(): String {
        return "MatlabTokenType." + super.toString()
    }
}

data object StringLiteral : MatlabTokenType("STRING") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.STRING_LITERAL
}

object AttributeKeys {
    val STRING_LITERAL = keys("STRING", DefaultLanguageHighlighterColors.STRING)
}

private fun keys(text: String, color: TextAttributesKey) = arrayOf(createTextAttributesKey(text, color))