package com.github.gt.matlab.language

import com.intellij.lang.Language

class MatlabLanguage private constructor(): Language("Matlab") {
    companion object {
        val INSTANCE = MatlabLanguage()
    }
}