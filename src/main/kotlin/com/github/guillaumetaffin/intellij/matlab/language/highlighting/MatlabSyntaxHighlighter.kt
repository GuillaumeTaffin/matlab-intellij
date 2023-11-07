package com.github.guillaumetaffin.intellij.matlab.language.highlighting

import com.github.guillaumetaffin.intellij.matlab.language.lexer.MatlabLexer
import com.github.guillaumetaffin.intellij.matlab.language.lexer.tokens.IntLiteral
import com.github.guillaumetaffin.intellij.matlab.language.lexer.tokens.LineBreak
import com.github.guillaumetaffin.intellij.matlab.language.lexer.tokens.MatlabTokenType
import com.github.guillaumetaffin.intellij.matlab.language.lexer.tokens.Semicolon
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class MatlabSyntaxHighlighter: SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): Lexer = FlexAdapter(MatlabLexer())

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey>  = when(tokenType) {
        is MatlabTokenType -> when(tokenType) {
            IntLiteral -> AttributeKeys.NUMBER
            Semicolon -> AttributeKeys.SEMICOLON
            LineBreak -> AttributeKeys.NO_HIGHLIGHTING
        }
        TokenType.BAD_CHARACTER -> AttributeKeys.BAD_CHARACTER
        else -> AttributeKeys.NO_HIGHLIGHTING
    }

}

object AttributeKeys {
    val NUMBER = keys("NUMBER", DefaultLanguageHighlighterColors.NUMBER)
    val SEMICOLON = keys("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
    val BAD_CHARACTER = keys("BAD CHARACTER", HighlighterColors.BAD_CHARACTER)
    val NO_HIGHLIGHTING = keys("NO HIGHLIGHTING", HighlighterColors.NO_HIGHLIGHTING)
}

fun keys(text: String, color: TextAttributesKey) = arrayOf(createTextAttributesKey(text,  color))
