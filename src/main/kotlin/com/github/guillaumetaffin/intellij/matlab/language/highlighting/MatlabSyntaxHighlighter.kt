package com.github.guillaumetaffin.intellij.matlab.language.highlighting

import com.github.guillaumetaffin.intellij.matlab.language.lexer.MatlabLexer
import com.github.guillaumetaffin.intellij.matlab.language.lexer.tokens.*
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Colors

class MatlabSyntaxHighlighter: SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): Lexer = FlexAdapter(MatlabLexer())

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey>  = when(tokenType) {
        is MatlabTokenType -> when(tokenType) {
            Identifier -> AttributeKeys.IDENTIFIER
            IntLiteral -> AttributeKeys.NUMBER
            Semicolon -> AttributeKeys.SEMICOLON
            Equal, Plus, Minus, Mul, Div -> AttributeKeys.OPERATOR
            OpenParens, CloseParens, OpenBracket, CloseBracket -> AttributeKeys.PARENS
            Comma -> AttributeKeys.COMMA
            LineBreak, SingleQuote -> AttributeKeys.NO_HIGHLIGHTING
        }
        TokenType.BAD_CHARACTER -> AttributeKeys.BAD_CHARACTER
        else -> AttributeKeys.NO_HIGHLIGHTING
    }

}

object AttributeKeys {
    val IDENTIFIER = keys("IDENTIFIER", Colors.IDENTIFIER)
    val NUMBER = keys("NUMBER", Colors.NUMBER)
    val SEMICOLON = keys("SEMICOLON", Colors.SEMICOLON)
    val OPERATOR = keys("EQUAL", Colors.OPERATION_SIGN)
    val PARENS = keys("PARENS", Colors.PARENTHESES)
    val COMMA = keys("COMMA", Colors.COMMA)
    val BAD_CHARACTER = keys("BAD CHARACTER", HighlighterColors.BAD_CHARACTER)
    val NO_HIGHLIGHTING = keys("NO HIGHLIGHTING", HighlighterColors.NO_HIGHLIGHTING)
}

fun keys(text: String, color: TextAttributesKey) = arrayOf(createTextAttributesKey(text,  color))
