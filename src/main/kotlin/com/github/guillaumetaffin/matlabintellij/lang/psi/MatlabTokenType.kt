package com.github.guillaumetaffin.matlabintellij.lang.psi

import com.github.guillaumetaffin.matlabintellij.lang.MatlabLanguage
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.psi.tree.IElementType


object Tokens {
    @JvmField
    val STRING_LITERAL = StringLiteral

    @JvmField
    val DECIMAL_LITERAL = DecimalLiteral

    @JvmField
    val HEXADECIMAL_LITERAL = HexadecimalLiteral

    @JvmField
    val BINARY_LITERAL = BinaryLiteral

    @JvmField
    val IMAGINARY_LITERAL = ImaginaryLiteral

    @JvmField
    val LINE_COMMENT = LineComment

    @JvmField
    val BLOCK_COMMENT = BlockComment

    @JvmField
    val INF = InfLiteral

    @JvmField
    val NAN = NanLiteral
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


data object DecimalLiteral : MatlabTokenType("DECIMAL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.DECIMAL_LITERAL
}

data object HexadecimalLiteral : MatlabTokenType("HEXADECIMAL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.HEXADECIMAL_LITERAL
}

data object BinaryLiteral : MatlabTokenType("BINARY") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.BINARY_LITERAL
}

data object ImaginaryLiteral : MatlabTokenType("IMAGINARY") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.IMAGINARY_LITERAL
}

data object InfLiteral : MatlabTokenType("INF") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.INF_LITERAL
}

data object NanLiteral : MatlabTokenType("NAN") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.NAN_LITERAL
}

data object LineComment : MatlabTokenType("COMMENT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.LINE_COMMENT
}

data object BlockComment : MatlabTokenType("BLOCK COMMENT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.BLOCK_COMMENT
}

object AttributeKeys {
    val STRING_LITERAL = keys("STRING", DefaultLanguageHighlighterColors.STRING)
    val DECIMAL_LITERAL = keys("DECIMAL", DefaultLanguageHighlighterColors.NUMBER)
    val HEXADECIMAL_LITERAL = keys("HEXADECIMAL", DefaultLanguageHighlighterColors.NUMBER)
    val BINARY_LITERAL = keys("BINARY", DefaultLanguageHighlighterColors.NUMBER)
    val IMAGINARY_LITERAL = keys("IMAGINARY", DefaultLanguageHighlighterColors.NUMBER)
    val INF_LITERAL = keys("INF", DefaultLanguageHighlighterColors.KEYWORD)
    val NAN_LITERAL = keys("NAN", DefaultLanguageHighlighterColors.KEYWORD)
    val LINE_COMMENT = keys("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT = keys("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
}

private fun keys(text: String, color: TextAttributesKey) = arrayOf(createTextAttributesKey(text, color))