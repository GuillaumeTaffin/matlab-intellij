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
    val OPEN_PARENS = OpenParens
    @JvmField
    val CLOSE_PARENS = CloseParens
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

data object OpenParens: MatlabTokenType("(")

data object CloseParens: MatlabTokenType(")")

data object LineBreak: MatlabTokenType("Line Break")

data object IntLiteral: MatlabTokenType("Int Literal")

data object Identifier: MatlabTokenType("Identifier")
