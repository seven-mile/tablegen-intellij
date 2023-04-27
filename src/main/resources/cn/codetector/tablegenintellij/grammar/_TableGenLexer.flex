package cn.codetector.tablegenintellij.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static cn.codetector.tablegenintellij.psi.TableGenTypes.*;

%%

%{
  public _TableGenLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _TableGenLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_BREAK=[\r\n]
WHITE_SPACE=[ \t\n\x0B\f\r]+
IDENTIFIER=[0-9]*[a-zA-Z_]([a-zA-Z_]|[0-9])*
VARNAME=[$][a-zA-Z_]([a-zA-Z_]|[0-9])*
BIN_INT=0b[0-1]+
HEX_INT=0x[0-9a-fA-F]+
DEC_INT=[0-9]+
STRING=\"([^\n\r\"]|\\n|\\\")*\"
CODE_FRAGMENT=\[\{([^}]|\}+(\]\}+)*([^}]]|\][^}>,]))*\}+(([^}>]|\}+(\]\}+)*([^}]]|\][^}]))*\}|(}+)*)\]
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*([^*]|\*+[^*/])*(\*+"/")?

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "def"                { return KEYWORDDEF; }
  "let"                { return KEYWORDLET; }
  "in"                 { return KEYWORDIN; }
  "code"               { return KEYWORDCODE; }
  "dag"                { return KEYWORDDAG; }
  "field"              { return KEYWORDFIELD; }
  "include"            { return KEYWORDINCLUDE; }
  "defm"               { return KEYWORDDEFM; }
  "foreach"            { return KEYWORDFOREACH; }
  "defset"             { return KEYWORDDEFSET; }
  "defvar"             { return KEYWORDDEFVAR; }
  "if"                 { return KEYWORDIF; }
  "then"               { return KEYWORDTHEN; }
  "else"               { return KEYWORDELSE; }
  "class"              { return KEYWORDCLASS; }
  "int"                { return KEYWORDINT; }
  "string"             { return KEYWORDSTRING; }
  "list"               { return KEYWORDLIST; }
  "bit"                { return KEYWORDBIT; }
  "bits"               { return KEYWORDBITS; }
  "multiclass"         { return KEYWORDMULTICLASS; }
  "!cond"              { return CONDITION; }
  "!add"               { return BANGADD; }
  "!and"               { return BANGAND; }
  "!cast"              { return BANGCAST; }
  "!con"               { return BANGCON; }
  "!dag"               { return BANGDAG; }
  "!div"               { return BANGDIV; }
  "!empty"             { return BANGEMPTY; }
  "!eq"                { return BANGEQ; }
  "!exists"            { return BANGEXISTS; }
  "!filter"            { return BANGFILTER; }
  "!find"              { return BANGFIND; }
  "!foldl"             { return BANGFOLDL; }
  "!foreach"           { return BANGFOREACH; }
  "!ge"                { return BANGGE; }
  "!getdagop"          { return BANGGETDAGOP; }
  "!gt"                { return BANGGT; }
  "!head"              { return BANGHEAD; }
  "!if"                { return BANGIF; }
  "!interleave"        { return BANGINTERLEAVE; }
  "!isa"               { return BANGISA; }
  "!le"                { return BANGLE; }
  "!listconcat"        { return BANGLISTCONCAT; }
  "!listremove"        { return BANGLISTREMOVE; }
  "!listsplat"         { return BANGLISTSPLAT; }
  "!logtwo"            { return BANGLOGTWO; }
  "!lt"                { return BANGLT; }
  "!mul"               { return BANGMUL; }
  "!ne"                { return BANGNE; }
  "!not"               { return BANGNOT; }
  "!or"                { return BANGOR; }
  "!range"             { return BANGRANGE; }
  "!setdagop"          { return BANGSETDAGOP; }
  "!shl"               { return BANGSHL; }
  "!size"              { return BANGSIZE; }
  "!sra"               { return BANGSRA; }
  "!srl"               { return BANGSRL; }
  "!strconcat"         { return BANGSTRCONCAT; }
  "!sub"               { return BANGSUB; }
  "!subst"             { return BANGSUBST; }
  "!substr"            { return BANGSUBSTR; }
  "!tail"              { return BANGTAIL; }
  "!tolower"           { return BANGTOLOWER; }
  "!toupper"           { return BANGTOUPPER; }
  "!xor"               { return BANGXOR; }
  "KeywordAssert"      { return KEYWORDASSERT; }

  {LINE_BREAK}         { return LINE_BREAK; }
  {WHITE_SPACE}        { return WHITE_SPACE; }
  {IDENTIFIER}         { return IDENTIFIER; }
  {VARNAME}            { return VARNAME; }
  {BIN_INT}            { return BIN_INT; }
  {HEX_INT}            { return HEX_INT; }
  {DEC_INT}            { return DEC_INT; }
  {STRING}             { return STRING; }
  {CODE_FRAGMENT}      { return CODE_FRAGMENT; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
