package com.github.guillaumetaffin.intellij.matlab.language.parser.psi

import com.github.guillaumetaffin.intellij.matlab.language.MatlabFileType
import com.github.guillaumetaffin.intellij.matlab.language.MatlabLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class MatlabFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, MatlabLanguage) {
    override fun getFileType(): FileType = MatlabFileType

    override fun toString(): String {
        return "Matlab File"
    }

}