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

    fun testLogicalOperators() = parsingShouldSucceed("logical_operators")

    fun testAssignStatements() = parsingShouldSucceed("assign_statements")

    fun testVariableReference() = parsingShouldSucceed("variable_reference")

    fun testParensExpressions() = parsingShouldSucceed("parens_expressions")

    fun testMeanCalculation() = parsingShouldSucceed("mean_calculation")

    fun testSaveWorkspaceData() = parsingShouldSucceed("save_workspace_data")

    fun testFunctionCall() = parsingShouldSucceed("function_call")

    fun testArrays() = parsingShouldSucceed("arrays")

    fun testRanges() = parsingShouldSucceed("ranges")

    fun testMultiOutputAssign() = parsingShouldSucceed("multi_output_assign")


    private fun parsingShouldSucceed(fileName: String) {
        val loadFile = this.loadFile("$fileName.m")
        parseFile(fileName, loadFile)
        ensureNoErrorElements()
    }

    override fun getTestDataPath(): String {
        return "src/test/testData/parsing/valid"
    }
}