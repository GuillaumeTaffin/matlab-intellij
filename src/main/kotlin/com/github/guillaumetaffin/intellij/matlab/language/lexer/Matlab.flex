package com.github.guillaumetaffin.intellij.matlab.language.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.guillaumetaffin.intellij.matlab.language.lexer.tokens.Tokens.*;

%%

%{
  public MatlabLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class MatlabLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

HORIZONTAL_WHITESPACE=[ \t\f]+
LINE_BREAK=[\n\r]+

//ID=_?([a-zA-Z][a-zA-Z_0-9]*)?
INT_LITERAL=[0-9][0-9_]*
//STRING_LITERAL=\"([^\"\r\n]|(\\\"))*\"
//LINE_COMMENT="//".*
//BLOCK_COMMENT="/*"~"*/"

%%
<YYINITIAL> {
  ";"                          { return SEMICOLON; }

  {INT_LITERAL}                { return INT_LITERAL; }

  {HORIZONTAL_WHITESPACE}      { return WHITE_SPACE; }
  {LINE_BREAK}                 { return LINE_BREAK; }
}

[^] { return BAD_CHARACTER; }
