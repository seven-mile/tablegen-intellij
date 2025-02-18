// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cn.codetector.tablegenintellij.psi.impl.*;

public interface TableGenTypes {

  IElementType ASSERT_STMT = new TableGenElementType("ASSERT_STMT");
  IElementType BANG_FUNCTION = new TableGenElementType("BANG_FUNCTION");
  IElementType BANG_OPERATOR = new TableGenElementType("BANG_OPERATOR");
  IElementType BINARY_INT = new TableGenElementType("BINARY_INT");
  IElementType BODY = new TableGenElementType("BODY");
  IElementType BODY_ITEM = new TableGenElementType("BODY_ITEM");
  IElementType BODY_LIST = new TableGenElementType("BODY_LIST");
  IElementType CLASS_ID = new TableGenElementType("CLASS_ID");
  IElementType CLASS_REF = new TableGenElementType("CLASS_REF");
  IElementType CLASS_STMT = new TableGenElementType("CLASS_STMT");
  IElementType CONDITION_FUNCTION = new TableGenElementType("CONDITION_FUNCTION");
  IElementType COND_CLAUSE = new TableGenElementType("COND_CLAUSE");
  IElementType COND_OPERATOR = new TableGenElementType("COND_OPERATOR");
  IElementType DAG_ARG = new TableGenElementType("DAG_ARG");
  IElementType DAG_ARG_LIST = new TableGenElementType("DAG_ARG_LIST");
  IElementType DECIMAL_INTEGER = new TableGenElementType("DECIMAL_INTEGER");
  IElementType DECLARATION = new TableGenElementType("DECLARATION");
  IElementType DEFM_STMT = new TableGenElementType("DEFM_STMT");
  IElementType DEFVAR_STMT = new TableGenElementType("DEFVAR_STMT");
  IElementType DEF_SET_STMT = new TableGenElementType("DEF_SET_STMT");
  IElementType DEF_STMT = new TableGenElementType("DEF_STMT");
  IElementType FOR_EACH_ITERATOR = new TableGenElementType("FOR_EACH_ITERATOR");
  IElementType FOR_EACH_STMT = new TableGenElementType("FOR_EACH_STMT");
  IElementType IF_BODY = new TableGenElementType("IF_BODY");
  IElementType IF_STMT = new TableGenElementType("IF_STMT");
  IElementType INCLUDE_DIRECTIVE = new TableGenElementType("INCLUDE_DIRECTIVE");
  IElementType INTEGER = new TableGenElementType("INTEGER");
  IElementType LET_ITEM = new TableGenElementType("LET_ITEM");
  IElementType LET_LIST = new TableGenElementType("LET_LIST");
  IElementType LET_STMT = new TableGenElementType("LET_STMT");
  IElementType MULTI_CLASS_ID = new TableGenElementType("MULTI_CLASS_ID");
  IElementType MULTI_CLASS_STATEMENT = new TableGenElementType("MULTI_CLASS_STATEMENT");
  IElementType MULTI_CLASS_STMT = new TableGenElementType("MULTI_CLASS_STMT");
  IElementType PARENT_CLASS_LIST = new TableGenElementType("PARENT_CLASS_LIST");
  IElementType PARENT_CLASS_LIST_NE = new TableGenElementType("PARENT_CLASS_LIST_NE");
  IElementType PREPROCESSOR_DIRECTIVE = new TableGenElementType("PREPROCESSOR_DIRECTIVE");
  IElementType RANGE_LIST = new TableGenElementType("RANGE_LIST");
  IElementType RANGE_PIECE = new TableGenElementType("RANGE_PIECE");
  IElementType RECORD_BODY = new TableGenElementType("RECORD_BODY");
  IElementType SIMPLE_VALUE = new TableGenElementType("SIMPLE_VALUE");
  IElementType SLICE_ELEMENT = new TableGenElementType("SLICE_ELEMENT");
  IElementType SLICE_ELEMENTS = new TableGenElementType("SLICE_ELEMENTS");
  IElementType STATEMENT = new TableGenElementType("STATEMENT");
  IElementType TEMPLATE_ARG_LIST = new TableGenElementType("TEMPLATE_ARG_LIST");
  IElementType TYPE = new TableGenElementType("TYPE");
  IElementType VALUE = new TableGenElementType("VALUE");
  IElementType VALUE_LIST = new TableGenElementType("VALUE_LIST");
  IElementType VALUE_LIST_NE = new TableGenElementType("VALUE_LIST_NE");
  IElementType VALUE_SUFFIX = new TableGenElementType("VALUE_SUFFIX");

  IElementType BANGADD = new TableGenTokenType("!add");
  IElementType BANGAND = new TableGenTokenType("!and");
  IElementType BANGCAST = new TableGenTokenType("!cast");
  IElementType BANGCON = new TableGenTokenType("!con");
  IElementType BANGDAG = new TableGenTokenType("!dag");
  IElementType BANGDIV = new TableGenTokenType("!div");
  IElementType BANGEMPTY = new TableGenTokenType("!empty");
  IElementType BANGEQ = new TableGenTokenType("!eq");
  IElementType BANGEXISTS = new TableGenTokenType("!exists");
  IElementType BANGFILTER = new TableGenTokenType("!filter");
  IElementType BANGFIND = new TableGenTokenType("!find");
  IElementType BANGFOLDL = new TableGenTokenType("!foldl");
  IElementType BANGFOREACH = new TableGenTokenType("!foreach");
  IElementType BANGGE = new TableGenTokenType("!ge");
  IElementType BANGGETDAGOP = new TableGenTokenType("!getdagop");
  IElementType BANGGT = new TableGenTokenType("!gt");
  IElementType BANGHEAD = new TableGenTokenType("!head");
  IElementType BANGIF = new TableGenTokenType("!if");
  IElementType BANGINTERLEAVE = new TableGenTokenType("!interleave");
  IElementType BANGISA = new TableGenTokenType("!isa");
  IElementType BANGLE = new TableGenTokenType("!le");
  IElementType BANGLISTCONCAT = new TableGenTokenType("!listconcat");
  IElementType BANGLISTREMOVE = new TableGenTokenType("!listremove");
  IElementType BANGLISTSPLAT = new TableGenTokenType("!listsplat");
  IElementType BANGLOGTWO = new TableGenTokenType("!logtwo");
  IElementType BANGLT = new TableGenTokenType("!lt");
  IElementType BANGMUL = new TableGenTokenType("!mul");
  IElementType BANGNE = new TableGenTokenType("!ne");
  IElementType BANGNOT = new TableGenTokenType("!not");
  IElementType BANGOR = new TableGenTokenType("!or");
  IElementType BANGRANGE = new TableGenTokenType("!range");
  IElementType BANGSETDAGOP = new TableGenTokenType("!setdagop");
  IElementType BANGSHL = new TableGenTokenType("!shl");
  IElementType BANGSIZE = new TableGenTokenType("!size");
  IElementType BANGSRA = new TableGenTokenType("!sra");
  IElementType BANGSRL = new TableGenTokenType("!srl");
  IElementType BANGSTRCONCAT = new TableGenTokenType("!strconcat");
  IElementType BANGSUB = new TableGenTokenType("!sub");
  IElementType BANGSUBST = new TableGenTokenType("!subst");
  IElementType BANGSUBSTR = new TableGenTokenType("!substr");
  IElementType BANGTAIL = new TableGenTokenType("!tail");
  IElementType BANGTOLOWER = new TableGenTokenType("!tolower");
  IElementType BANGTOUPPER = new TableGenTokenType("!toupper");
  IElementType BANGXOR = new TableGenTokenType("!xor");
  IElementType BIN_INT = new TableGenTokenType("BIN_INT");
  IElementType BLOCK_COMMENT = new TableGenTokenType("BLOCK_COMMENT");
  IElementType CODE_FRAGMENT = new TableGenTokenType("CODE_FRAGMENT");
  IElementType CONDITION = new TableGenTokenType("!cond");
  IElementType DEC_INT = new TableGenTokenType("DEC_INT");
  IElementType HEX_INT = new TableGenTokenType("HEX_INT");
  IElementType IDENTIFIER = new TableGenTokenType("IDENTIFIER");
  IElementType KEYWORDASSERT = new TableGenTokenType("KeywordAssert");
  IElementType KEYWORDBIT = new TableGenTokenType("bit");
  IElementType KEYWORDBITS = new TableGenTokenType("bits");
  IElementType KEYWORDCLASS = new TableGenTokenType("class");
  IElementType KEYWORDCODE = new TableGenTokenType("code");
  IElementType KEYWORDDAG = new TableGenTokenType("dag");
  IElementType KEYWORDDEF = new TableGenTokenType("def");
  IElementType KEYWORDDEFM = new TableGenTokenType("defm");
  IElementType KEYWORDDEFSET = new TableGenTokenType("defset");
  IElementType KEYWORDDEFVAR = new TableGenTokenType("defvar");
  IElementType KEYWORDELSE = new TableGenTokenType("else");
  IElementType KEYWORDFIELD = new TableGenTokenType("field");
  IElementType KEYWORDFOREACH = new TableGenTokenType("foreach");
  IElementType KEYWORDIF = new TableGenTokenType("if");
  IElementType KEYWORDIN = new TableGenTokenType("in");
  IElementType KEYWORDINCLUDE = new TableGenTokenType("include");
  IElementType KEYWORDINT = new TableGenTokenType("int");
  IElementType KEYWORDLET = new TableGenTokenType("let");
  IElementType KEYWORDLIST = new TableGenTokenType("list");
  IElementType KEYWORDMULTICLASS = new TableGenTokenType("multiclass");
  IElementType KEYWORDSTRING = new TableGenTokenType("string");
  IElementType KEYWORDTHEN = new TableGenTokenType("then");
  IElementType LINE_COMMENT = new TableGenTokenType("LINE_COMMENT");
  IElementType STRING = new TableGenTokenType("STRING");
  IElementType VARNAME = new TableGenTokenType("VARNAME");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSERT_STMT) {
        return new TableGenAssertStmtImpl(node);
      }
      else if (type == BANG_FUNCTION) {
        return new TableGenBangFunctionImpl(node);
      }
      else if (type == BANG_OPERATOR) {
        return new TableGenBangOperatorImpl(node);
      }
      else if (type == BINARY_INT) {
        return new TableGenBinaryIntImpl(node);
      }
      else if (type == BODY) {
        return new TableGenBodyImpl(node);
      }
      else if (type == BODY_ITEM) {
        return new TableGenBodyItemImpl(node);
      }
      else if (type == BODY_LIST) {
        return new TableGenBodyListImpl(node);
      }
      else if (type == CLASS_ID) {
        return new TableGenClassIDImpl(node);
      }
      else if (type == CLASS_REF) {
        return new TableGenClassRefImpl(node);
      }
      else if (type == CLASS_STMT) {
        return new TableGenClassStmtImpl(node);
      }
      else if (type == CONDITION_FUNCTION) {
        return new TableGenConditionFunctionImpl(node);
      }
      else if (type == COND_CLAUSE) {
        return new TableGenCondClauseImpl(node);
      }
      else if (type == COND_OPERATOR) {
        return new TableGenCondOperatorImpl(node);
      }
      else if (type == DAG_ARG) {
        return new TableGenDagArgImpl(node);
      }
      else if (type == DAG_ARG_LIST) {
        return new TableGenDagArgListImpl(node);
      }
      else if (type == DECIMAL_INTEGER) {
        return new TableGenDecimalIntegerImpl(node);
      }
      else if (type == DECLARATION) {
        return new TableGenDeclarationImpl(node);
      }
      else if (type == DEFM_STMT) {
        return new TableGenDefmStmtImpl(node);
      }
      else if (type == DEFVAR_STMT) {
        return new TableGenDefvarStmtImpl(node);
      }
      else if (type == DEF_SET_STMT) {
        return new TableGenDefSetStmtImpl(node);
      }
      else if (type == DEF_STMT) {
        return new TableGenDefStmtImpl(node);
      }
      else if (type == FOR_EACH_ITERATOR) {
        return new TableGenForEachIteratorImpl(node);
      }
      else if (type == FOR_EACH_STMT) {
        return new TableGenForEachStmtImpl(node);
      }
      else if (type == IF_BODY) {
        return new TableGenIfBodyImpl(node);
      }
      else if (type == IF_STMT) {
        return new TableGenIfStmtImpl(node);
      }
      else if (type == INCLUDE_DIRECTIVE) {
        return new TableGenIncludeDirectiveImpl(node);
      }
      else if (type == INTEGER) {
        return new TableGenIntegerImpl(node);
      }
      else if (type == LET_ITEM) {
        return new TableGenLetItemImpl(node);
      }
      else if (type == LET_LIST) {
        return new TableGenLetListImpl(node);
      }
      else if (type == LET_STMT) {
        return new TableGenLetStmtImpl(node);
      }
      else if (type == MULTI_CLASS_ID) {
        return new TableGenMultiClassIDImpl(node);
      }
      else if (type == MULTI_CLASS_STATEMENT) {
        return new TableGenMultiClassStatementImpl(node);
      }
      else if (type == MULTI_CLASS_STMT) {
        return new TableGenMultiClassStmtImpl(node);
      }
      else if (type == PARENT_CLASS_LIST) {
        return new TableGenParentClassListImpl(node);
      }
      else if (type == PARENT_CLASS_LIST_NE) {
        return new TableGenParentClassListNEImpl(node);
      }
      else if (type == PREPROCESSOR_DIRECTIVE) {
        return new TableGenPreprocessorDirectiveImpl(node);
      }
      else if (type == RANGE_LIST) {
        return new TableGenRangeListImpl(node);
      }
      else if (type == RANGE_PIECE) {
        return new TableGenRangePieceImpl(node);
      }
      else if (type == RECORD_BODY) {
        return new TableGenRecordBodyImpl(node);
      }
      else if (type == SIMPLE_VALUE) {
        return new TableGenSimpleValueImpl(node);
      }
      else if (type == SLICE_ELEMENT) {
        return new TableGenSliceElementImpl(node);
      }
      else if (type == SLICE_ELEMENTS) {
        return new TableGenSliceElementsImpl(node);
      }
      else if (type == STATEMENT) {
        return new TableGenStatementImpl(node);
      }
      else if (type == TEMPLATE_ARG_LIST) {
        return new TableGenTemplateArgListImpl(node);
      }
      else if (type == TYPE) {
        return new TableGenTypeImpl(node);
      }
      else if (type == VALUE) {
        return new TableGenValueImpl(node);
      }
      else if (type == VALUE_LIST) {
        return new TableGenValueListImpl(node);
      }
      else if (type == VALUE_LIST_NE) {
        return new TableGenValueListNEImpl(node);
      }
      else if (type == VALUE_SUFFIX) {
        return new TableGenValueSuffixImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
