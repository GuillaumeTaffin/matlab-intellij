package com.github.guillaumetaffin.intellij.matlab.language

import com.github.guillaumetaffin.intellij.matlab.MatlabIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


object MatlabFileType : LanguageFileType(MatlabLanguage) {

    override fun getName(): String = "Matlab File"

    override fun getDescription(): String = "Matlab language file"

    override fun getDefaultExtension(): String = "m"

    override fun getIcon(): Icon = MatlabIcons.MATLAB_FILE_ICON

}