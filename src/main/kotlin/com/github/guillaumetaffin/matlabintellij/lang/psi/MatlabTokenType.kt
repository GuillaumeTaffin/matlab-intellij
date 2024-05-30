package com.github.guillaumetaffin.matlabintellij.lang.psi

import com.github.guillaumetaffin.matlabintellij.lang.MatlabLanguage
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.psi.tree.IElementType


object Tokens {
    @JvmField
    val STRING_LITERAL = StringLiteral

    @JvmField
    val DECIMAL_LITERAL = DecimalLiteral

    @JvmField
    val HEXADECIMAL_LITERAL = HexadecimalLiteral

    @JvmField
    val BINARY_LITERAL = BinaryLiteral

    @JvmField
    val IMAGINARY_LITERAL = ImaginaryLiteral

    @JvmField
    val LINE_COMMENT = LineComment

    @JvmField
    val BLOCK_COMMENT = BlockComment

    @JvmField
    val INF = InfLiteral

    @JvmField
    val NAN = NanLiteral

    @JvmField
    val SEMICOLON = Semicolon

    @JvmField
    val TRUE = True

    @JvmField
    val FALSE = False

    @JvmField
    val EQ = Eq

    @JvmField
    val NOT_EQ = NotEq

    @JvmField
    val LT = Lt

    @JvmField
    val LTEQ = Lteq

    @JvmField
    val GT = Gt

    @JvmField
    val GTEQ = Gteq

    @JvmField
    val PLUS = Plus

    @JvmField
    val MINUS = Minus

    @JvmField
    val MUL = Mul

    @JvmField
    val DIV = Div

    @JvmField
    val POW = Pow

    @JvmField
    val EWPOW = EwPow

    @JvmField
    val EWMUL = EwMul

    @JvmField
    val EWDIV = EwDiv

    @JvmField
    val EWLDIV = EwLDiv

    @JvmField
    val AND_AND = AndAnd

    @JvmField
    val OR_OR = OrOr

    @JvmField
    val AND = And

    @JvmField
    val OR = Or

    @JvmField
    val EQUALS = AssignmentOperator

    @JvmField
    val IDENTIFIER = Identifier

    @JvmField
    val LPAREN = LeftParen

    @JvmField
    val RPAREN = RightParen

    @JvmField
    val LINE_BREAK = LineBreak

    @JvmField
    val WHITE_SPACE = WhiteSpace

    @JvmField
    val DOT = Dot

    @JvmField
    val COMMA = Comma

    @JvmField
    val COLON = Colon

    @JvmField
    val SINGLE_QUOTE = SingleQuote

    @JvmField
    val DOUBLE_QUOTE = DoubleQuote

    @JvmField
    val LBRACKET = LBracket

    @JvmField
    val RBRACKET = RBracket

    @JvmField
    val LBRACE = LBrace

    @JvmField
    val RBRACE = RBrace

    @JvmField
    val TILDE = Tilde

    @JvmField
    val AT = At

    @JvmField
    val BANG = Bang

    @JvmField
    val BREAK = Break

    @JvmField
    val CASE = Case

    @JvmField
    val CATCH = Catch

    @JvmField
    val CLASSDEF = Classdef

    @JvmField
    val CONTINUE = Continue

    @JvmField
    val ELSE = Else

    @JvmField
    val ELSEIF = Elseif

    @JvmField
    val END = End

    @JvmField
    val FOR = For

    @JvmField
    val FUNCTION = Function

    @JvmField
    val GLOBAL = Global

    @JvmField
    val IF = If

    @JvmField
    val OTHERWISE = Otherwise

    @JvmField
    val PARFOR = Parfor

    @JvmField
    val PERSISTENT = Persistent

    @JvmField
    val RETURN = Return

    @JvmField
    val SPMD = Spmd

    @JvmField
    val SWITCH = Switch

    @JvmField
    val TRY = Try

    @JvmField
    val WHILE = While

    @JvmField
    val BACKSLASH = Backslash

}

sealed class MatlabTokenType(debugName: String) :
    IElementType(debugName, MatlabLanguage) {
    abstract val highlight: Array<TextAttributesKey>?

    override fun toString(): String {
        return "MatlabTokenType." + super.toString()
    }
}

data object LeftParen : MatlabTokenType("LPAREN") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.PARENTHESES
}

data object RightParen : MatlabTokenType("RPAREN") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.PARENTHESES
}


data object StringLiteral : MatlabTokenType("STRING") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.STRING_LITERAL
}


data object DecimalLiteral : MatlabTokenType("DECIMAL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.DECIMAL_LITERAL
}

data object HexadecimalLiteral : MatlabTokenType("HEXADECIMAL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.HEXADECIMAL_LITERAL
}

data object BinaryLiteral : MatlabTokenType("BINARY") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.BINARY_LITERAL
}

data object ImaginaryLiteral : MatlabTokenType("IMAGINARY") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.IMAGINARY_LITERAL
}

data object InfLiteral : MatlabTokenType("INF") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.KEYWORD
}

data object NanLiteral : MatlabTokenType("NAN") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.KEYWORD
}

data object LineComment : MatlabTokenType("COMMENT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.LINE_COMMENT
}

data object BlockComment : MatlabTokenType("BLOCK COMMENT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.BLOCK_COMMENT
}

data object Semicolon : MatlabTokenType("SEMICOLON") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.SEMICOLON
}

data object True : MatlabTokenType("TRUE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.KEYWORD
}

data object False : MatlabTokenType("FALSE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.KEYWORD
}


data object Eq : MatlabTokenType("EQ") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object NotEq : MatlabTokenType("NOT_EQ") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Lt : MatlabTokenType("LT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Lteq : MatlabTokenType("LTEQ") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Gt : MatlabTokenType("GT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Gteq : MatlabTokenType("GTEQ") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Plus : MatlabTokenType("PLUS") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Minus : MatlabTokenType("MINUS") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Mul : MatlabTokenType("MUL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Div : MatlabTokenType("DIV") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Pow : MatlabTokenType("POW") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object EwPow : MatlabTokenType("EWPOW") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object EwMul : MatlabTokenType("EWMUL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object EwDiv : MatlabTokenType("EWDIV") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object EwLDiv : MatlabTokenType("EWLDIV") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object AndAnd : MatlabTokenType("AND_AND") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object OrOr : MatlabTokenType("OR_OR") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object And : MatlabTokenType("AND") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Or : MatlabTokenType("OR") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object AssignmentOperator : MatlabTokenType("EQUALS") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OPERATOR
}

data object Identifier : MatlabTokenType("IDENTIFIER") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.IDENTIFIER
}

data object LineBreak : MatlabTokenType("LINE_BREAK") {
    override val highlight: Array<TextAttributesKey>?
        get() = null
}

data object WhiteSpace : MatlabTokenType("WHITE_SPACE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.DOT
}

data object Dot : MatlabTokenType("DOT") {
    override val highlight: Array<TextAttributesKey>?
        get() = null
}

data object Comma : MatlabTokenType("COMMA") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.COMMA
}

data object Colon : MatlabTokenType("COLON") {
    override val highlight: Array<TextAttributesKey>?
        get() = null
}

data object SingleQuote : MatlabTokenType("SINGLE_QUOTE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.SINGLE_QUOTE
}

data object DoubleQuote : MatlabTokenType("DOUBLE_QUOTE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.DOUBLE_QUOTE
}

data object LBracket : MatlabTokenType("LBRACKET") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.LBRACKET
}

data object RBracket : MatlabTokenType("RBRACKET") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.RBRACKET
}

data object LBrace : MatlabTokenType("LBRACE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.LBRACE
}

data object RBrace : MatlabTokenType("RBRACE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.RBRACE
}

data object Tilde : MatlabTokenType("TILDE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.TILDE
}

data object At : MatlabTokenType("AT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.AT
}

data object Bang : MatlabTokenType("BANG") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.BANG
}

data object Break : MatlabTokenType("BREAK") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.BREAK
}

data object Case : MatlabTokenType("CASE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.CASE
}

data object Catch : MatlabTokenType("CATCH") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.CATCH
}

data object Classdef : MatlabTokenType("CLASSDEF") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.CLASSDEF
}

data object Continue : MatlabTokenType("CONTINUE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.CONTINUE
}

data object Else : MatlabTokenType("ELSE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.ELSE
}

data object Elseif : MatlabTokenType("ELSEIF") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.ELSEIF
}

data object End : MatlabTokenType("END") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.END
}

data object For : MatlabTokenType("FOR") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.FOR
}

data object Function : MatlabTokenType("FUNCTION") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.FUNCTION
}

data object Global : MatlabTokenType("GLOBAL") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.GLOBAL
}

data object If : MatlabTokenType("IF") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.IF
}

data object Otherwise : MatlabTokenType("OTHERWISE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.OTHERWISE
}

data object Parfor : MatlabTokenType("PARFOR") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.PARFOR
}

data object Persistent : MatlabTokenType("PERSISTENT") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.PERSISTENT
}

data object Return : MatlabTokenType("RETURN") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.RETURN
}

data object Spmd : MatlabTokenType("SPMD") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.SPMD
}

data object Switch : MatlabTokenType("SWITCH") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.SWITCH
}

data object Try : MatlabTokenType("TRY") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.TRY
}

data object While : MatlabTokenType("WHILE") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.WHILE
}

data object Backslash : MatlabTokenType("BACKSLASH") {
    override val highlight: Array<TextAttributesKey>
        get() = AttributeKeys.BACKSLASH
}


object AttributeKeys {
    val PARENTHESES = keys("PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
    val IDENTIFIER = keys("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
    val STRING_LITERAL = keys("STRING", DefaultLanguageHighlighterColors.STRING)
    val SEMICOLON = keys("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
    val DECIMAL_LITERAL = keys("DECIMAL", DefaultLanguageHighlighterColors.NUMBER)
    val HEXADECIMAL_LITERAL = keys("HEXADECIMAL", DefaultLanguageHighlighterColors.NUMBER)
    val BINARY_LITERAL = keys("BINARY", DefaultLanguageHighlighterColors.NUMBER)
    val IMAGINARY_LITERAL = keys("IMAGINARY", DefaultLanguageHighlighterColors.NUMBER)
    val KEYWORD = keys("INF", DefaultLanguageHighlighterColors.KEYWORD)
    val LINE_COMMENT = keys("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT = keys("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
    val OPERATOR = keys("OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
    val DOT = keys("DOT", DefaultLanguageHighlighterColors.DOT)
    val COMMA = keys("COMMA", DefaultLanguageHighlighterColors.COMMA)
    val SINGLE_QUOTE = keys("SINGLE_QUOTE", DefaultLanguageHighlighterColors.STRING)
    val DOUBLE_QUOTE = keys("DOUBLE_QUOTE", DefaultLanguageHighlighterColors.STRING)
    val LBRACKET = keys("LBRACKET", DefaultLanguageHighlighterColors.BRACKETS)
    val RBRACKET = keys("RBRACKET", DefaultLanguageHighlighterColors.BRACKETS)
    val LBRACE = keys("LBRACE", DefaultLanguageHighlighterColors.BRACES)
    val RBRACE = keys("RBRACE", DefaultLanguageHighlighterColors.BRACES)
    val TILDE = keys("TILDE", DefaultLanguageHighlighterColors.OPERATION_SIGN)
    val AT = keys("AT", DefaultLanguageHighlighterColors.MARKUP_TAG)
    val BANG = keys("BANG", DefaultLanguageHighlighterColors.OPERATION_SIGN)
    val BREAK = keys("BREAK", DefaultLanguageHighlighterColors.KEYWORD)
    val CASE = keys("CASE", DefaultLanguageHighlighterColors.KEYWORD)
    val CATCH = keys("CATCH", DefaultLanguageHighlighterColors.KEYWORD)
    val CLASSDEF = keys("CLASSDEF", DefaultLanguageHighlighterColors.KEYWORD)
    val CONTINUE = keys("CONTINUE", DefaultLanguageHighlighterColors.KEYWORD)
    val ELSE = keys("ELSE", DefaultLanguageHighlighterColors.KEYWORD)
    val ELSEIF = keys("ELSEIF", DefaultLanguageHighlighterColors.KEYWORD)
    val END = keys("END", DefaultLanguageHighlighterColors.KEYWORD)
    val FOR = keys("FOR", DefaultLanguageHighlighterColors.KEYWORD)
    val FUNCTION = keys("FUNCTION", DefaultLanguageHighlighterColors.KEYWORD)
    val GLOBAL = keys("GLOBAL", DefaultLanguageHighlighterColors.KEYWORD)
    val IF = keys("IF", DefaultLanguageHighlighterColors.KEYWORD)
    val OTHERWISE = keys("OTHERWISE", DefaultLanguageHighlighterColors.KEYWORD)
    val PARFOR = keys("PARFOR", DefaultLanguageHighlighterColors.KEYWORD)
    val PERSISTENT = keys("PERSISTENT", DefaultLanguageHighlighterColors.KEYWORD)
    val RETURN = keys("RETURN", DefaultLanguageHighlighterColors.KEYWORD)
    val SPMD = keys("SPMD", DefaultLanguageHighlighterColors.KEYWORD)
    val SWITCH = keys("SWITCH", DefaultLanguageHighlighterColors.KEYWORD)
    val TRY = keys("TRY", DefaultLanguageHighlighterColors.KEYWORD)
    val WHILE = keys("WHILE", DefaultLanguageHighlighterColors.KEYWORD)
    val BACKSLASH = keys("BACKSLASH", DefaultLanguageHighlighterColors.OPERATION_SIGN)

}

private fun keys(text: String, color: TextAttributesKey) = arrayOf(createTextAttributesKey(text, color))