package com.github.guillaumetaffin.matlabintellij.lang.psi

import com.github.guillaumetaffin.matlabintellij.lang.MatlabLanguage
import com.github.guillaumetaffin.matlabintellij.lang.matlabFileType
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider


class MatlabFile(viewProvider: FileViewProvider) :
    PsiFileBase(viewProvider, MatlabLanguage) {

    override fun getFileType(): FileType {
        return matlabFileType
    }

    override fun toString(): String {
        return "Matlab File"
    }
}