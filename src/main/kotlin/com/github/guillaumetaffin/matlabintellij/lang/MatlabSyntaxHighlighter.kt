package com.github.guillaumetaffin.matlabintellij.lang

import com.github.guillaumetaffin.matlabintellij.lang.psi.MatlabTokenType
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class MatlabSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter =
        MatlabSyntaxHighlighter()
}

class MatlabSyntaxHighlighter : SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): Lexer = MatlabFlexAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> = when (tokenType) {
        is MatlabTokenType -> tokenType.highlight
        TokenType.BAD_CHARACTER -> BAD_CHARACTER
        else -> NO_HIGHLIGHTING
    }

}

val BAD_CHARACTER = keys("BAD CHARACTER", HighlighterColors.BAD_CHARACTER)
val NO_HIGHLIGHTING = keys("NO HIGHLIGHTING", HighlighterColors.NO_HIGHLIGHTING)

private fun keys(text: String, color: TextAttributesKey) = arrayOf(createTextAttributesKey(text, color))