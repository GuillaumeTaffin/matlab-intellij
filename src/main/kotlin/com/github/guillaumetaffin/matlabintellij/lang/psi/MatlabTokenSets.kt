package com.github.guillaumetaffin.matlabintellij.lang.psi

import com.github.guillaumetaffin.matlabintellij.lang.psi.Tokens.BLOCK_COMMENT
import com.github.guillaumetaffin.matlabintellij.lang.psi.Tokens.LINE_COMMENT
import com.intellij.psi.tree.TokenSet


interface MatlabTokenSets {
    companion object {
        val COMMENTS: TokenSet = TokenSet.create(LINE_COMMENT, BLOCK_COMMENT)
    }
}