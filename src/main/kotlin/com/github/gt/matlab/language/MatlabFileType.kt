package com.github.gt.matlab.language

import com.intellij.openapi.fileTypes.LanguageFileType

class MatlabFileType private constructor() : LanguageFileType(MatlabLanguage.INSTANCE) {

    companion object {
        val INSTANCE = MatlabFileType()
    }

    override fun getName() = "Matlab File"

    override fun getDescription() = "Matlab language file."

    override fun getDefaultExtension() = "m"

    override fun getIcon() = Icons.Matlab

}