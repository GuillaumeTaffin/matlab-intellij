package com.github.guillaumetaffin.matlabintellij.lang.parsing

import com.github.guillaumetaffin.matlabintellij.lang.MatlabParserDefinition
import com.intellij.testFramework.ParsingTestCase

class ValidParsingTest : ParsingTestCase(
    "",
    "m",
    MatlabParserDefinition()
) {

    fun testStringLiterals() = parsingShouldSucceed("string_literals")

    fun testNumberLiterals() = parsingShouldSucceed("number_literals")

    fun testComments() = parsingShouldSucceed("comments")

    fun testBooleans() = parsingShouldSucceed("booleans")

    fun testRelationalOperators() = parsingShouldSucceed("relational_operators")

    fun testArithmeticOperators() = parsingShouldSucceed("arithmetic_operators")

    private fun parsingShouldSucceed(fileName: String) {
        val loadFile = this.loadFile("$fileName.m")
        parseFile(fileName, loadFile)
        ensureNoErrorElements()
    }

    override fun getTestDataPath(): String {
        return "src/test/testData/parsing/valid"
    }
}