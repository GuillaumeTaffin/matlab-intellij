package com.github.guillaumetaffin.matlabintellij.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
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

WHITE_SPACE=[ \t\x0B\f]+
LINE_BREAK=[\r\n\u2028\u2029]+
STRING_LITERAL='([^'\r\n\u2028\u2029]|'')*'|\"([^\"\r\n\u2028\u2029]|\"\")*\"
DECIMAL_LITERAL=(\d+)(\.\d+)?([eE][+-]?\d+)?
HEXADECIMAL_LITERAL=0[xX][0-9a-fA-F]+
BINARY_LITERAL=0[bB][01]+
IMAGINARY_LITERAL=(\d+)?(\.\d+)?([eE][+-]?\d+)?[ij]
LINE_COMMENT=%.*
MULTI_LINE_COMMENT=%\{(.|\n)*?%}
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*

%%

<YYINITIAL> {
    "Inf"                 { return INF; }
    "NaN"                 { return NAN; }
    ";"                   { return SEMICOLON; }
    "true"                { return TRUE; }
    "false"               { return FALSE; }
    "=="                  { return EQ; }
    "~="                  { return NOT_EQ; }
    "<"                   { return LT; }
    "<="                  { return LTEQ; }
    ">="                  { return GTEQ; }
    ">"                   { return GT; }
    "+"                   { return PLUS; }
    "-"                   { return MINUS; }
    "*"                   { return MUL; }
    "/"                   { return DIV; }
    "^"                   { return POW; }
    ".^"                  { return EWPOW; }
    ".*"                  { return EWMUL; }
    "./"                  { return EWDIV; }
    ".\\"                 { return EWLDIV; }
    "&&"                  { return AND_AND; }
    "||"                  { return OR_OR; }
    "&"                   { return AND; }
    "|"                   { return OR; }
    "="                   { return EQUALS; }
    "("                   { return LPAREN; }
    ")"                   { return RPAREN; }
    "."                   { return DOT; }
    ","                   { return COMMA; }
    ":"                   { return COLON; }
    "'"                   { return SINGLE_QUOTE; }
    "\""                  { return DOUBLE_QUOTE; }
    "["                   { return LBRACKET; }
    "]"                   { return RBRACKET; }
    "{"                   { return LBRACE; }
    "}"                   { return RBRACE; }
    "~"                   { return TILDE; }
    "@"                   { return AT; }
    "!"                   { return BANG; }
    "break"               { return BREAK; }
    "case"                { return CASE; }
    "catch"               { return CATCH; }
    "classdef"            { return CLASSDEF; }
    "continue"            { return CONTINUE; }
    "else"                { return ELSE; }
    "elseif"              { return ELSEIF; }
    "end"                 { return END; }
    "for"                 { return FOR; }
    "function"            { return FUNCTION; }
    "global"              { return GLOBAL; }
    "if"                  { return IF; }
    "otherwise"           { return OTHERWISE; }
    "parfor"              { return PARFOR; }
    "persistent"          { return PERSISTENT; }
    "return"              { return RETURN; }
    "spmd"                { return SPMD; }
    "switch"              { return SWITCH; }
    "try"                 { return TRY; }
    "while"               { return WHILE; }
    "\\"                  { return BACKSLASH; }
    "..."                 { return THREE_DOTS; }

    {STRING_LITERAL}      { return STRING_LITERAL; }
    {DECIMAL_LITERAL}     { return DECIMAL_LITERAL; }
    {HEXADECIMAL_LITERAL} { return HEXADECIMAL_LITERAL; }
    {BINARY_LITERAL}      { return BINARY_LITERAL; }
    {IMAGINARY_LITERAL}   { return IMAGINARY_LITERAL; }
    {LINE_COMMENT}        { return LINE_COMMENT; }
    {MULTI_LINE_COMMENT}  { return BLOCK_COMMENT; }
    {IDENTIFIER}          { return IDENTIFIER; }
    {WHITE_SPACE}         { return WHITE_SPACE; }
    {LINE_BREAK}          { return LINE_BREAK; }


}

[^]                    { return TokenType.BAD_CHARACTER; }