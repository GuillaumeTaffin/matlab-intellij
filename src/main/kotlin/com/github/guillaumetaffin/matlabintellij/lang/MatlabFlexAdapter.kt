package com.github.guillaumetaffin.matlabintellij.lang

import com.intellij.lexer.FlexAdapter

class MatlabFlexAdapter : FlexAdapter(MatlabLexer(null))