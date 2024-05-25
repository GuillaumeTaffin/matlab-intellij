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

%%

<YYINITIAL> {
    {WHITE_SPACE}      { return TokenType.WHITE_SPACE; }
    {STRING_LITERAL}   { return STRING_LITERAL; }
}

[^]                    { return TokenType.BAD_CHARACTER; }