package com.github.guillaumetaffin.intellij.matlab.language.parser

import com.github.guillaumetaffin.intellij.matlab.language.MatlabLanguage
import com.github.guillaumetaffin.intellij.matlab.language.lexer.MatlabLexer
import com.github.guillaumetaffin.intellij.matlab.language.parser.psi.MatlabFile
import com.github.guillaumetaffin.intellij.matlab.language.parser.psi.MatlabTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class MatlabParserDefinition: ParserDefinition {

    object Util {
        val FILE = IFileElementType(MatlabLanguage)
    }

    override fun createLexer(project: Project?): Lexer = FlexAdapter(MatlabLexer())

    override fun createParser(project: Project?): PsiParser = MatlabParser()

    override fun getFileNodeType(): IFileElementType = Util.FILE

    override fun getCommentTokens(): TokenSet = TokenSet.EMPTY

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: ASTNode?): PsiElement = MatlabTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = MatlabFile(viewProvider)

}