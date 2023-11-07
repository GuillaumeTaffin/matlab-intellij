package com.github.guillaumetaffin.intellij.matlab.language.lexer.tokens

import com.github.guillaumetaffin.intellij.matlab.language.MatlabLanguage
import com.intellij.psi.tree.IElementType


object Tokens {
    @JvmField
    val SEMICOLON = Semicolon
    @JvmField
    val INT_LITERAL = IntLiteral
    @JvmField
    val LINE_BREAK = LineBreak
    @JvmField
    val ID = Identifier
    @JvmField
    val EQUAL = Equal
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
    val ELEMENT_WISE_MUL = ElementWiseMul
    @JvmField
    val ELEMENT_WISE_DIV = ElementWiseDiv
    @JvmField
    val ELEMENT_WISE_POW = ElementWisePow
    @JvmField
    val OPEN_PARENS = OpenParens
    @JvmField
    val CLOSE_PARENS = CloseParens
    @JvmField
    val OPEN_BRACKET = OpenBracket
    @JvmField
    val CLOSE_BRACKET = CloseBracket
    @JvmField
    val COMMA = Comma
    @JvmField
    val SINGLE_QUOTE = SingleQuote
    @JvmField
    val COLON = Colon
}

sealed class MatlabTokenType(debugName: String) : IElementType(debugName, MatlabLanguage) {

    override fun toString(): String {
        return "MatlabTokenType.${super.toString()}"
    }

}

data object Equal: MatlabTokenType("=")

data object Semicolon : MatlabTokenType(";")

data object Plus: MatlabTokenType("+")

data object Minus: MatlabTokenType("-")

data object Mul: MatlabTokenType("*")

data object Div: MatlabTokenType("/")

data object Pow: MatlabTokenType("^")

data object ElementWiseMul: MatlabTokenType(".*")

data object ElementWiseDiv: MatlabTokenType("./")

data object ElementWisePow: MatlabTokenType(".^")

data object OpenParens: MatlabTokenType("(")

data object CloseParens: MatlabTokenType(")")

data object OpenBracket: MatlabTokenType("[")

data object CloseBracket: MatlabTokenType("]")

data object Comma: MatlabTokenType(",")

data object SingleQuote: MatlabTokenType("'")

data object Colon: MatlabTokenType(":")

data object LineBreak: MatlabTokenType("Line Break")

data object IntLiteral: MatlabTokenType("Int Literal")

data object Identifier: MatlabTokenType("Identifier")
