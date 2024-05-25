package com.github.guillaumetaffin.matlabintellij.lang

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon


object MatlabLanguage : Language("MATLAB") {
    private fun readResolve(): Any = MatlabLanguage
}

object MatlabIcons {
    @JvmField
    val MATLAB_FILE_ICON = IconLoader.getIcon("/icons/icons8-matlab-16.svg", javaClass)
}

class MatlabFileType : LanguageFileType(MatlabLanguage) {
    override fun getName(): String {
        return "Matlab File"
    }

    override fun getDescription(): String {
        return "Matlab language file"
    }

    override fun getDefaultExtension(): String {
        return "m"
    }

    override fun getIcon(): Icon {
        return MatlabIcons.MATLAB_FILE_ICON
    }

}

val matlabFileType = MatlabFileType()