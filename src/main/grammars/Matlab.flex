package com.github.guillaumetaffin.matlabintellij.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.guillaumetaffin.matlabintellij.lang.psi.MatlabTypes;
import com.intellij.psi.TokenType;
import static com.github.guillaumetaffin.matlabintellij.lang.psi.Tokens.*;

%%

%class MatlabLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE=\s+
STRING_LITERAL='([^']|'')*'|\"([^\"]|\"\")*\"
DECIMAL_LITERAL=(\d+)(\.\d+)?([eE][+-]?\d+)?
HEXADECIMAL_LITERAL=0[xX][0-9a-fA-F]+
BINARY_LITERAL=0[bB][01]+
IMAGINARY_LITERAL=(\d+)?(\.\d+)?([eE][+-]?\d+)?[ij]
INF="Inf"
NAN="NaN"

%%

<YYINITIAL> {
    {WHITE_SPACE}         { return TokenType.WHITE_SPACE; }
    {STRING_LITERAL}      { return STRING_LITERAL; }
    {DECIMAL_LITERAL}     { return DECIMAL_LITERAL; }
    {HEXADECIMAL_LITERAL} { return HEXADECIMAL_LITERAL; }
    {BINARY_LITERAL}      { return BINARY_LITERAL; }
    {IMAGINARY_LITERAL}   { return IMAGINARY_LITERAL; }
    {INF}                 { return INF; }
    {NAN}                 { return NAN; }
}

[^]                    { return TokenType.BAD_CHARACTER; }