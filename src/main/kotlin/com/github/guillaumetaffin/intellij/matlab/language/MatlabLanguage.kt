package com.github.guillaumetaffin.intellij.matlab.language

import com.intellij.lang.Language

object MatlabLanguage : Language("Matlab") {
    private fun readResolve(): Any = MatlabLanguage
}