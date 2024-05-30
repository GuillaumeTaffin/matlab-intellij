package com.github.guillaumetaffin.matlabintellij.lang

import com.github.guillaumetaffin.matlabintellij.lang.parser.MatlabParser
import com.github.guillaumetaffin.matlabintellij.lang.psi.MatlabFile
import com.github.guillaumetaffin.matlabintellij.lang.psi.MatlabTokenSets
import com.github.guillaumetaffin.matlabintellij.lang.psi.MatlabTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


class MatlabParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return MatlabFlexAdapter()
    }

    override fun getCommentTokens(): TokenSet {
        return MatlabTokenSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createParser(project: Project): PsiParser {
        return MatlabParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return MatlabFile(viewProvider)
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return MatlabTypes.Factory.createElement(node)
    }

//    override fun getWhitespaceTokens(): TokenSet {
//        return TokenSet.create(WhiteSpace)
//    }
}

val FILE: IFileElementType = IFileElementType(MatlabLanguage)