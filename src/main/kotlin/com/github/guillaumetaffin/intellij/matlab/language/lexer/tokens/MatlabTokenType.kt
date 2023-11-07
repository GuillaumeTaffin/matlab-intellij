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
}

sealed class MatlabTokenType(debugName: String) : IElementType(debugName, MatlabLanguage) {

    override fun toString(): String {
        return "MatlabTokenType.${super.toString()}"
    }

}

data object Semicolon : MatlabTokenType(";")

data object IntLiteral: MatlabTokenType("Int Literal")

data object LineBreak: MatlabTokenType("Line Break")
