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

    @JvmField
    val SEMICOLON = Semicolon

    @JvmField
    val TRUE = True

    @JvmField
    val FALSE = False

    @JvmField
    val EQ = Eq

    @JvmField
    val NOT_EQ = NotEq

    @JvmField
    val LT = Lt

    @JvmField
    val LTEQ = Lteq

    @JvmField
    val GT = Gt

    @JvmField
    val GTEQ = Gteq

    @JvmField
    val PLUS = Plus

    @JvmField
    val MINUS = Minus

    @JvmField
    val MUL = Mul

    @JvmField
    val DIV = Div

    @JvmField
    val POW = Pow

    @JvmField
    val EWPOW = EwPow

    @JvmField
    val EWMUL = EwMul

    @JvmField
    val EWDIV = EwDiv

    @JvmField
    val EWLDIV = EwLDiv

    @JvmField
    val AND_AND = AndAnd

    @JvmField
    val OR_OR = OrOr

    @JvmField
    val AND = And

    @JvmField
    val OR = Or

    @JvmField
    val EQUALS = AssignmentOperator

    @JvmField
    val IDENTIFIER = Identifier

    @JvmField
    val LPAREN = LeftParen

    @JvmField
    val RPAREN = RightParen

    @JvmField
    val LINE_BREAK = LineBreak

}

sealed class MatlabTokenType(debugName: String) :
    IElementType(debugName, MatlabLanguage) {
    abstract val highlight: Array<TextAttributesKey>?

    override fun toString(): String {
        return "MatlabTokenType." + super.toString()
    }
}

data object LeftParen : MatlabTokenType("LPAREN") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.PARENTHESES
}

data object RightParen : MatlabTokenType("RPAREN") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.PARENTHESES
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
        get() = AttributeKeys.KEYWORD
}

data object NanLiteral : MatlabTokenType("NAN") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.KEYWORD
}

data object LineComment : MatlabTokenType("COMMENT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.LINE_COMMENT
}

data object BlockComment : MatlabTokenType("BLOCK COMMENT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.BLOCK_COMMENT
}

data object Semicolon : MatlabTokenType("SEMICOLON") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.SEMICOLON
}

data object True : MatlabTokenType("TRUE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.KEYWORD
}

data object False : MatlabTokenType("FALSE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.KEYWORD
}


data object Eq : MatlabTokenType("EQ") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object NotEq : MatlabTokenType("NOT_EQ") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Lt : MatlabTokenType("LT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Lteq : MatlabTokenType("LTEQ") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Gt : MatlabTokenType("GT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Gteq : MatlabTokenType("GTEQ") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Plus : MatlabTokenType("PLUS") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Minus : MatlabTokenType("MINUS") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Mul : MatlabTokenType("MUL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Div : MatlabTokenType("DIV") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Pow : MatlabTokenType("POW") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object EwPow : MatlabTokenType("EWPOW") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object EwMul : MatlabTokenType("EWMUL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object EwDiv : MatlabTokenType("EWDIV") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object EwLDiv : MatlabTokenType("EWLDIV") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object AndAnd : MatlabTokenType("AND_AND") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object OrOr : MatlabTokenType("OR_OR") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object And : MatlabTokenType("AND") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Or : MatlabTokenType("OR") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object AssignmentOperator : MatlabTokenType("EQUALS") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Identifier : MatlabTokenType("IDENTIFIER") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.IDENTIFIER
}

data object LineBreak : MatlabTokenType("LINE_BREAK") {
    override val highlight: Array<TextAttributesKey>?
        get() = null
}


object AttributeKeys {
    val PARENTHESES = keys("PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
    val IDENTIFIER = keys("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
    val STRING_LITERAL = keys("STRING", DefaultLanguageHighlighterColors.STRING)
    val SEMICOLON = keys("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
    val DECIMAL_LITERAL = keys("DECIMAL", DefaultLanguageHighlighterColors.NUMBER)
    val HEXADECIMAL_LITERAL = keys("HEXADECIMAL", DefaultLanguageHighlighterColors.NUMBER)
    val BINARY_LITERAL = keys("BINARY", DefaultLanguageHighlighterColors.NUMBER)
    val IMAGINARY_LITERAL = keys("IMAGINARY", DefaultLanguageHighlighterColors.NUMBER)
    val KEYWORD = keys("INF", DefaultLanguageHighlighterColors.KEYWORD)
    val LINE_COMMENT = keys("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT = keys("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
    val OPERATOR = keys("OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
}

private fun keys(text: String, color: TextAttributesKey) = arrayOf(createTextAttributesKey(text, color))