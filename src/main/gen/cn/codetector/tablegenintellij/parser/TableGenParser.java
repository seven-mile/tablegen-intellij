// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static cn.codetector.tablegenintellij.psi.TableGenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TableGenParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return tableGenFile(b, l + 1);
  }

  /* ********************************************************** */
  // KeywordAssert conditionFunction "," STRING ";"
  public static boolean assertStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertStmt")) return false;
    if (!nextTokenIs(b, KEYWORDASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDASSERT);
    r = r && conditionFunction(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, ASSERT_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // bangOperator ('<' type '>')? '(' valueListNE ')'
  public static boolean bangFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bangFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BANG_FUNCTION, "<bang function>");
    r = bangOperator(b, l + 1);
    r = r && bangFunction_1(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && valueListNE(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('<' type '>')?
  private static boolean bangFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bangFunction_1")) return false;
    bangFunction_1_0(b, l + 1);
    return true;
  }

  // '<' type '>'
  private static boolean bangFunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bangFunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BangAdd
  //                 | BangAnd
  //                 | BangCast
  //                 | BangCon
  //                 | BangDag
  //                 | BangDiv
  //                 | BangEmpty
  //                 | BangEq
  //                 | BangExists
  //                 | BangFilter
  //                 | BangFind
  //                 | BangFoldl
  //                 | BangForeach
  //                 | BangGe
  //                 | BangGetdagop
  //                 | BangGt
  //                 | BangHead
  //                 | BangIf
  //                 | BangInterleave
  //                 | BangIsa
  //                 | BangLe
  //                 | BangListConcat
  //                 | BangListRemove
  //                 | BangListSplat
  //                 | BangLogTwo
  //                 | BangLt
  //                 | BangMul
  //                 | BangNe
  //                 | BangNot
  //                 | BangOr
  //                 | BangRange
  //                 | BangSetdagop
  //                 | BangShl
  //                 | BangSize
  //                 | BangSra
  //                 | BangSrl
  //                 | BangStrConcat
  //                 | BangSub
  //                 | BangSubst
  //                 | BangSubstr
  //                 | BangTail
  //                 | BangToLower
  //                 | BangToUpper
  //                 | BangXor
  public static boolean bangOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bangOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BANG_OPERATOR, "<bang operator>");
    r = consumeToken(b, BANGADD);
    if (!r) r = consumeToken(b, BANGAND);
    if (!r) r = consumeToken(b, BANGCAST);
    if (!r) r = consumeToken(b, BANGCON);
    if (!r) r = consumeToken(b, BANGDAG);
    if (!r) r = consumeToken(b, BANGDIV);
    if (!r) r = consumeToken(b, BANGEMPTY);
    if (!r) r = consumeToken(b, BANGEQ);
    if (!r) r = consumeToken(b, BANGEXISTS);
    if (!r) r = consumeToken(b, BANGFILTER);
    if (!r) r = consumeToken(b, BANGFIND);
    if (!r) r = consumeToken(b, BANGFOLDL);
    if (!r) r = consumeToken(b, BANGFOREACH);
    if (!r) r = consumeToken(b, BANGGE);
    if (!r) r = consumeToken(b, BANGGETDAGOP);
    if (!r) r = consumeToken(b, BANGGT);
    if (!r) r = consumeToken(b, BANGHEAD);
    if (!r) r = consumeToken(b, BANGIF);
    if (!r) r = consumeToken(b, BANGINTERLEAVE);
    if (!r) r = consumeToken(b, BANGISA);
    if (!r) r = consumeToken(b, BANGLE);
    if (!r) r = consumeToken(b, BANGLISTCONCAT);
    if (!r) r = consumeToken(b, BANGLISTREMOVE);
    if (!r) r = consumeToken(b, BANGLISTSPLAT);
    if (!r) r = consumeToken(b, BANGLOGTWO);
    if (!r) r = consumeToken(b, BANGLT);
    if (!r) r = consumeToken(b, BANGMUL);
    if (!r) r = consumeToken(b, BANGNE);
    if (!r) r = consumeToken(b, BANGNOT);
    if (!r) r = consumeToken(b, BANGOR);
    if (!r) r = consumeToken(b, BANGRANGE);
    if (!r) r = consumeToken(b, BANGSETDAGOP);
    if (!r) r = consumeToken(b, BANGSHL);
    if (!r) r = consumeToken(b, BANGSIZE);
    if (!r) r = consumeToken(b, BANGSRA);
    if (!r) r = consumeToken(b, BANGSRL);
    if (!r) r = consumeToken(b, BANGSTRCONCAT);
    if (!r) r = consumeToken(b, BANGSUB);
    if (!r) r = consumeToken(b, BANGSUBST);
    if (!r) r = consumeToken(b, BANGSUBSTR);
    if (!r) r = consumeToken(b, BANGTAIL);
    if (!r) r = consumeToken(b, BANGTOLOWER);
    if (!r) r = consumeToken(b, BANGTOUPPER);
    if (!r) r = consumeToken(b, BANGXOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BIN_INT
  public static boolean binaryInt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryInt")) return false;
    if (!nextTokenIs(b, BIN_INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIN_INT);
    exit_section_(b, m, BINARY_INT, r);
    return r;
  }

  /* ********************************************************** */
  // ";" | "{" bodyList "}"
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY, "<body>");
    r = consumeToken(b, ";");
    if (!r) r = body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "{" bodyList "}"
  private static boolean body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && bodyList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declaration ";"
  //              | KeywordLet IDENTIFIER ["{" rangeList "}"] "=" value ";"
  //              | KeywordDefVar IDENTIFIER "=" value ";"
  //              | assertStmt
  public static boolean bodyItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY_ITEM, "<body item>");
    r = bodyItem_0(b, l + 1);
    if (!r) r = bodyItem_1(b, l + 1);
    if (!r) r = bodyItem_2(b, l + 1);
    if (!r) r = assertStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declaration ";"
  private static boolean bodyItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // KeywordLet IDENTIFIER ["{" rangeList "}"] "=" value ";"
  private static boolean bodyItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDLET, IDENTIFIER);
    r = r && bodyItem_1_2(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ["{" rangeList "}"]
  private static boolean bodyItem_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_1_2")) return false;
    bodyItem_1_2_0(b, l + 1);
    return true;
  }

  // "{" rangeList "}"
  private static boolean bodyItem_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && rangeList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // KeywordDefVar IDENTIFIER "=" value ";"
  private static boolean bodyItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDDEFVAR, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bodyItem*
  public static boolean bodyList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyList")) return false;
    Marker m = enter_section_(b, l, _NONE_, BODY_LIST, "<body list>");
    while (true) {
      int c = current_position_(b);
      if (!bodyItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bodyList", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean classID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classID")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_ID, r);
    return r;
  }

  /* ********************************************************** */
  // (classID | multiClassID) ("<" valueList? ">")?
  public static boolean classRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classRef")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classRef_0(b, l + 1);
    r = r && classRef_1(b, l + 1);
    exit_section_(b, m, CLASS_REF, r);
    return r;
  }

  // classID | multiClassID
  private static boolean classRef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classRef_0")) return false;
    boolean r;
    r = classID(b, l + 1);
    if (!r) r = multiClassID(b, l + 1);
    return r;
  }

  // ("<" valueList? ">")?
  private static boolean classRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classRef_1")) return false;
    classRef_1_0(b, l + 1);
    return true;
  }

  // "<" valueList? ">"
  private static boolean classRef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classRef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && classRef_1_0_1(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // valueList?
  private static boolean classRef_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classRef_1_0_1")) return false;
    valueList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KeywordClass IDENTIFIER templateArgList? recordBody
  public static boolean classStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classStmt")) return false;
    if (!nextTokenIs(b, KEYWORDCLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDCLASS, IDENTIFIER);
    r = r && classStmt_2(b, l + 1);
    r = r && recordBody(b, l + 1);
    exit_section_(b, m, CLASS_STMT, r);
    return r;
  }

  // templateArgList?
  private static boolean classStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classStmt_2")) return false;
    templateArgList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // value ":" value
  public static boolean condClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_CLAUSE, "<cond clause>");
    r = value(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONDITION
  public static boolean condOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condOperator")) return false;
    if (!nextTokenIs(b, CONDITION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONDITION);
    exit_section_(b, m, COND_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // condOperator '(' condClause (',' condClause)* ')'
  public static boolean conditionFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionFunction")) return false;
    if (!nextTokenIs(b, CONDITION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = condOperator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && condClause(b, l + 1);
    r = r && conditionFunction_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, CONDITION_FUNCTION, r);
    return r;
  }

  // (',' condClause)*
  private static boolean conditionFunction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionFunction_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditionFunction_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditionFunction_3", c)) break;
    }
    return true;
  }

  // ',' condClause
  private static boolean conditionFunction_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionFunction_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && condClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // value (':' VARNAME)? | VARNAME
  public static boolean dagArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DAG_ARG, "<dag arg>");
    r = dagArg_0(b, l + 1);
    if (!r) r = consumeToken(b, VARNAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // value (':' VARNAME)?
  private static boolean dagArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && dagArg_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' VARNAME)?
  private static boolean dagArg_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArg_0_1")) return false;
    dagArg_0_1_0(b, l + 1);
    return true;
  }

  // ':' VARNAME
  private static boolean dagArg_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArg_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && consumeToken(b, VARNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dagArg (',' dagArg)*
  public static boolean dagArgList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArgList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DAG_ARG_LIST, "<dag arg list>");
    r = dagArg(b, l + 1);
    r = r && dagArgList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' dagArg)*
  private static boolean dagArgList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArgList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dagArgList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dagArgList_1", c)) break;
    }
    return true;
  }

  // ',' dagArg
  private static boolean dagArgList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArgList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && dagArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ["-"] DEC_INT
  public static boolean decimalInteger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalInteger")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECIMAL_INTEGER, "<decimal integer>");
    r = decimalInteger_0(b, l + 1);
    r = r && consumeToken(b, DEC_INT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ["-"]
  private static boolean decimalInteger_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalInteger_0")) return false;
    consumeToken(b, "-");
    return true;
  }

  /* ********************************************************** */
  // ([KeywordField] type | KeywordCode) IDENTIFIER ("=" value)?
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = declaration_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && declaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [KeywordField] type | KeywordCode
  private static boolean declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration_0_0(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORDCODE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [KeywordField] type
  private static boolean declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration_0_0_0(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [KeywordField]
  private static boolean declaration_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0_0_0")) return false;
    consumeToken(b, KEYWORDFIELD);
    return true;
  }

  // ("=" value)?
  private static boolean declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2")) return false;
    declaration_2_0(b, l + 1);
    return true;
  }

  // "=" value
  private static boolean declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordDefset type IDENTIFIER "=" "{" statement* "}"
  public static boolean defSetStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defSetStmt")) return false;
    if (!nextTokenIs(b, KEYWORDDEFSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDDEFSET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, "{");
    r = r && defSetStmt_5(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, DEF_SET_STMT, r);
    return r;
  }

  // statement*
  private static boolean defSetStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defSetStmt_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defSetStmt_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KeywordDef value? recordBody
  public static boolean defStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defStmt")) return false;
    if (!nextTokenIs(b, KEYWORDDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDDEF);
    r = r && defStmt_1(b, l + 1);
    r = r && recordBody(b, l + 1);
    exit_section_(b, m, DEF_STMT, r);
    return r;
  }

  // value?
  private static boolean defStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defStmt_1")) return false;
    value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KeywordDefm [value] parentClassList ";"
  public static boolean defmStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmStmt")) return false;
    if (!nextTokenIs(b, KEYWORDDEFM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDDEFM);
    r = r && defmStmt_1(b, l + 1);
    r = r && parentClassList(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, DEFM_STMT, r);
    return r;
  }

  // [value]
  private static boolean defmStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmStmt_1")) return false;
    value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KeywordDefVar IDENTIFIER "=" value ";"
  public static boolean defvarStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defvarStmt")) return false;
    if (!nextTokenIs(b, KEYWORDDEFVAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDDEFVAR, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, DEFVAR_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER "=" ("{" rangeList "}" | rangePiece | value)
  public static boolean forEachIterator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachIterator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && forEachIterator_2(b, l + 1);
    exit_section_(b, m, FOR_EACH_ITERATOR, r);
    return r;
  }

  // "{" rangeList "}" | rangePiece | value
  private static boolean forEachIterator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachIterator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = forEachIterator_2_0(b, l + 1);
    if (!r) r = rangePiece(b, l + 1);
    if (!r) r = value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "{" rangeList "}"
  private static boolean forEachIterator_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachIterator_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && rangeList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordForEach forEachIterator KeywordIn "{" statement* "}"
  //                 | KeywordForEach forEachIterator KeywordIn statement
  public static boolean forEachStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachStmt")) return false;
    if (!nextTokenIs(b, KEYWORDFOREACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = forEachStmt_0(b, l + 1);
    if (!r) r = forEachStmt_1(b, l + 1);
    exit_section_(b, m, FOR_EACH_STMT, r);
    return r;
  }

  // KeywordForEach forEachIterator KeywordIn "{" statement* "}"
  private static boolean forEachStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachStmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDFOREACH);
    r = r && forEachIterator(b, l + 1);
    r = r && consumeToken(b, KEYWORDIN);
    r = r && consumeToken(b, "{");
    r = r && forEachStmt_0_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean forEachStmt_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachStmt_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forEachStmt_0_4", c)) break;
    }
    return true;
  }

  // KeywordForEach forEachIterator KeywordIn statement
  private static boolean forEachStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDFOREACH);
    r = r && forEachIterator(b, l + 1);
    r = r && consumeToken(b, KEYWORDIN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" statement* "}" | statement
  public static boolean ifBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_BODY, "<if body>");
    r = ifBody_0(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "{" statement* "}"
  private static boolean ifBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && ifBody_0_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean ifBody_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifBody_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifBody_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KeywordIf value KeywordThen ifBody
  //             | KeywordIf value KeywordThen ifBody KeywordElse ifBody
  public static boolean ifStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt")) return false;
    if (!nextTokenIs(b, KEYWORDIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifStmt_0(b, l + 1);
    if (!r) r = ifStmt_1(b, l + 1);
    exit_section_(b, m, IF_STMT, r);
    return r;
  }

  // KeywordIf value KeywordThen ifBody
  private static boolean ifStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDIF);
    r = r && value(b, l + 1);
    r = r && consumeToken(b, KEYWORDTHEN);
    r = r && ifBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KeywordIf value KeywordThen ifBody KeywordElse ifBody
  private static boolean ifStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDIF);
    r = r && value(b, l + 1);
    r = r && consumeToken(b, KEYWORDTHEN);
    r = r && ifBody(b, l + 1);
    r = r && consumeToken(b, KEYWORDELSE);
    r = r && ifBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordInclude STRING
  public static boolean includeDirective(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeDirective")) return false;
    if (!nextTokenIs(b, KEYWORDINCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDINCLUDE, STRING);
    exit_section_(b, m, INCLUDE_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // binaryInt | decimalInteger | HEX_INT
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER, "<integer>");
    r = binaryInt(b, l + 1);
    if (!r) r = decimalInteger(b, l + 1);
    if (!r) r = consumeToken(b, HEX_INT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER [rangeList] "=" value
  public static boolean letItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letItem")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && letItem_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, LET_ITEM, r);
    return r;
  }

  // [rangeList]
  private static boolean letItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letItem_1")) return false;
    rangeList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // letItem ("," letItem)*
  public static boolean letList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = letItem(b, l + 1);
    r = r && letList_1(b, l + 1);
    exit_section_(b, m, LET_LIST, r);
    return r;
  }

  // ("," letItem)*
  private static boolean letList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!letList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letList_1", c)) break;
    }
    return true;
  }

  // "," letItem
  private static boolean letList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && letItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordLet letList KeywordIn "{" statement* "}"
  //             | KeywordLet letList KeywordIn statement
  public static boolean letStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letStmt")) return false;
    if (!nextTokenIs(b, KEYWORDLET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = letStmt_0(b, l + 1);
    if (!r) r = letStmt_1(b, l + 1);
    exit_section_(b, m, LET_STMT, r);
    return r;
  }

  // KeywordLet letList KeywordIn "{" statement* "}"
  private static boolean letStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letStmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDLET);
    r = r && letList(b, l + 1);
    r = r && consumeToken(b, KEYWORDIN);
    r = r && consumeToken(b, "{");
    r = r && letStmt_0_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean letStmt_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letStmt_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letStmt_0_4", c)) break;
    }
    return true;
  }

  // KeywordLet letList KeywordIn statement
  private static boolean letStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDLET);
    r = r && letList(b, l + 1);
    r = r && consumeToken(b, KEYWORDIN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean multiClassID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiClassID")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, MULTI_CLASS_ID, r);
    return r;
  }

  /* ********************************************************** */
  // assertStmt | defStmt | defmStmt | defvarStmt | forEachStmt | ifStmt | letStmt
  public static boolean multiClassStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiClassStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_CLASS_STATEMENT, "<multi class statement>");
    r = assertStmt(b, l + 1);
    if (!r) r = defStmt(b, l + 1);
    if (!r) r = defmStmt(b, l + 1);
    if (!r) r = defvarStmt(b, l + 1);
    if (!r) r = forEachStmt(b, l + 1);
    if (!r) r = ifStmt(b, l + 1);
    if (!r) r = letStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KeywordMultiClass IDENTIFIER templateArgList? parentClassList
  //                     "{" multiClassStatement+ "}"
  public static boolean multiClassStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiClassStmt")) return false;
    if (!nextTokenIs(b, KEYWORDMULTICLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDMULTICLASS, IDENTIFIER);
    r = r && multiClassStmt_2(b, l + 1);
    r = r && parentClassList(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && multiClassStmt_5(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, MULTI_CLASS_STMT, r);
    return r;
  }

  // templateArgList?
  private static boolean multiClassStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiClassStmt_2")) return false;
    templateArgList(b, l + 1);
    return true;
  }

  // multiClassStatement+
  private static boolean multiClassStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiClassStmt_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiClassStatement(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!multiClassStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiClassStmt_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> (statement | includeDirective | preprocessorDirective)
  static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_0(b, l + 1);
    r = r && object_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // statement | includeDirective | preprocessorDirective
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    boolean r;
    r = statement(b, l + 1);
    if (!r) r = includeDirective(b, l + 1);
    if (!r) r = preprocessorDirective(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (":" parentClassListNE)?
  public static boolean parentClassList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentClassList")) return false;
    Marker m = enter_section_(b, l, _NONE_, PARENT_CLASS_LIST, "<parent class list>");
    parentClassList_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ":" parentClassListNE
  private static boolean parentClassList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentClassList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && parentClassListNE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // classRef ("," classRef)*
  public static boolean parentClassListNE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentClassListNE")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classRef(b, l + 1);
    r = r && parentClassListNE_1(b, l + 1);
    exit_section_(b, m, PARENT_CLASS_LIST_NE, r);
    return r;
  }

  // ("," classRef)*
  private static boolean parentClassListNE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentClassListNE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parentClassListNE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parentClassListNE_1", c)) break;
    }
    return true;
  }

  // "," classRef
  private static boolean parentClassListNE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentClassListNE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && classRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "#define" | "#ifdef" | "#ifndef"
  public static boolean preprocessorDirective(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "preprocessorDirective")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREPROCESSOR_DIRECTIVE, "<preprocessor directive>");
    r = consumeToken(b, "#define");
    if (!r) r = consumeToken(b, "#ifdef");
    if (!r) r = consumeToken(b, "#ifndef");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // rangePiece (',' rangePiece)*
  public static boolean rangeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_LIST, "<range list>");
    r = rangePiece(b, l + 1);
    r = r && rangeList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' rangePiece)*
  private static boolean rangeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rangeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rangeList_1", c)) break;
    }
    return true;
  }

  // ',' rangePiece
  private static boolean rangeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && rangePiece(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // integer '-' integer
  //              | integer '...' integer
  //              | integer integer
  //              | integer
  public static boolean rangePiece(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangePiece")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_PIECE, "<range piece>");
    r = rangePiece_0(b, l + 1);
    if (!r) r = rangePiece_1(b, l + 1);
    if (!r) r = rangePiece_2(b, l + 1);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // integer '-' integer
  private static boolean rangePiece_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangePiece_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer '...' integer
  private static boolean rangePiece_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangePiece_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    r = r && consumeToken(b, "...");
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer integer
  private static boolean rangePiece_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangePiece_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parentClassList body
  public static boolean recordBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recordBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD_BODY, "<record body>");
    r = parentClassList(b, l + 1);
    r = r && body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CODE_FRAGMENT | STRING+ | integer   // TokInteger | TokString+ | TokCode | "true" | "false"
  //                 // SimpleValue3
  //                 | '?'
  //                 // SimpleValue4
  //                 | '{' valueList '}'
  //                 // SimpleValue8
  //                 | classID '<' valueListNE '>'
  //                 // SimpleValue5
  //                 | '[' valueList ']' ('<' type '>')?  // "[" ValueList "]" ["<" Type ">"]
  //                 // SimpleValue6
  //                 | '(' dagArg dagArgList? ')'
  //                 // SimpleValue9
  //                 | bangFunction
  //                 | conditionFunction
  //                 // SimpleValue7
  //                 | IDENTIFIER
  public static boolean simpleValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_VALUE, "<simple value>");
    r = consumeToken(b, CODE_FRAGMENT);
    if (!r) r = simpleValue_1(b, l + 1);
    if (!r) r = integer(b, l + 1);
    if (!r) r = consumeToken(b, "?");
    if (!r) r = simpleValue_4(b, l + 1);
    if (!r) r = simpleValue_5(b, l + 1);
    if (!r) r = simpleValue_6(b, l + 1);
    if (!r) r = simpleValue_7(b, l + 1);
    if (!r) r = bangFunction(b, l + 1);
    if (!r) r = conditionFunction(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STRING+
  private static boolean simpleValue_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, STRING)) break;
      if (!empty_element_parsed_guard_(b, "simpleValue_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' valueList '}'
  private static boolean simpleValue_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && valueList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // classID '<' valueListNE '>'
  private static boolean simpleValue_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classID(b, l + 1);
    r = r && consumeToken(b, "<");
    r = r && valueListNE(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' valueList ']' ('<' type '>')?
  private static boolean simpleValue_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && valueList(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && simpleValue_6_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('<' type '>')?
  private static boolean simpleValue_6_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_6_3")) return false;
    simpleValue_6_3_0(b, l + 1);
    return true;
  }

  // '<' type '>'
  private static boolean simpleValue_6_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_6_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' dagArg dagArgList? ')'
  private static boolean simpleValue_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && dagArg(b, l + 1);
    r = r && simpleValue_7_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // dagArgList?
  private static boolean simpleValue_7_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_7_2")) return false;
    dagArgList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // value
  //                 | value "..." value
  //                 | value "-" value
  //                 | value integer
  public static boolean sliceElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLICE_ELEMENT, "<slice element>");
    r = value(b, l + 1);
    if (!r) r = sliceElement_1(b, l + 1);
    if (!r) r = sliceElement_2(b, l + 1);
    if (!r) r = sliceElement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // value "..." value
  private static boolean sliceElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceElement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && consumeToken(b, "...");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // value "-" value
  private static boolean sliceElement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceElement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // value integer
  private static boolean sliceElement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceElement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (sliceElement ",")* sliceElement ","?
  public static boolean sliceElements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceElements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLICE_ELEMENTS, "<slice elements>");
    r = sliceElements_0(b, l + 1);
    r = r && sliceElement(b, l + 1);
    r = r && sliceElements_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (sliceElement ",")*
  private static boolean sliceElements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceElements_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sliceElements_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sliceElements_0", c)) break;
    }
    return true;
  }

  // sliceElement ","
  private static boolean sliceElements_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceElements_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sliceElement(b, l + 1);
    r = r && consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  // ","?
  private static boolean sliceElements_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceElements_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // assertStmt | classStmt | defStmt | defmStmt | defSetStmt | defvarStmt | forEachStmt | ifStmt | letStmt |
  //                 multiClassStmt
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = assertStmt(b, l + 1);
    if (!r) r = classStmt(b, l + 1);
    if (!r) r = defStmt(b, l + 1);
    if (!r) r = defmStmt(b, l + 1);
    if (!r) r = defSetStmt(b, l + 1);
    if (!r) r = defvarStmt(b, l + 1);
    if (!r) r = forEachStmt(b, l + 1);
    if (!r) r = ifStmt(b, l + 1);
    if (!r) r = letStmt(b, l + 1);
    if (!r) r = multiClassStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // object*
  static boolean tableGenFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableGenFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tableGenFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "<" declaration ("," declaration)* ">"
  public static boolean templateArgList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ARG_LIST, "<template arg list>");
    r = consumeToken(b, "<");
    r = r && declaration(b, l + 1);
    r = r && templateArgList_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," declaration)*
  private static boolean templateArgList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgList_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!templateArgList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "templateArgList_2", c)) break;
    }
    return true;
  }

  // "," declaration
  private static boolean templateArgList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordString | KeywordCode | KeywordBit | KeywordInt
  //             | KeywordDag
  //             | KeywordBits "<" integer ">"
  //             | KeywordList "<" type ">"
  //             | classID
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, KEYWORDSTRING);
    if (!r) r = consumeToken(b, KEYWORDCODE);
    if (!r) r = consumeToken(b, KEYWORDBIT);
    if (!r) r = consumeToken(b, KEYWORDINT);
    if (!r) r = consumeToken(b, KEYWORDDAG);
    if (!r) r = type_5(b, l + 1);
    if (!r) r = type_6(b, l + 1);
    if (!r) r = classID(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KeywordBits "<" integer ">"
  private static boolean type_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDBITS);
    r = r && consumeToken(b, "<");
    r = r && integer(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // KeywordList "<" type ">"
  private static boolean type_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDLIST);
    r = r && consumeToken(b, "<");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleValue valueSuffix* ( "#" value )*
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = simpleValue(b, l + 1);
    r = r && value_1(b, l + 1);
    r = r && value_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // valueSuffix*
  private static boolean value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valueSuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value_1", c)) break;
    }
    return true;
  }

  // ( "#" value )*
  private static boolean value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!value_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value_2", c)) break;
    }
    return true;
  }

  // "#" value
  private static boolean value_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "#");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // valueListNE?
  public static boolean valueList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueList")) return false;
    Marker m = enter_section_(b, l, _NONE_, VALUE_LIST, "<value list>");
    valueListNE(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // value (',' value)*
  public static boolean valueListNE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueListNE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_LIST_NE, "<value list ne>");
    r = value(b, l + 1);
    r = r && valueListNE_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' value)*
  private static boolean valueListNE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueListNE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valueListNE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueListNE_1", c)) break;
    }
    return true;
  }

  // ',' value
  private static boolean valueListNE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueListNE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' rangeList '}'
  //                | '[' sliceElements ']'
  //                | '.' IDENTIFIER
  public static boolean valueSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_SUFFIX, "<value suffix>");
    r = valueSuffix_0(b, l + 1);
    if (!r) r = valueSuffix_1(b, l + 1);
    if (!r) r = valueSuffix_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' rangeList '}'
  private static boolean valueSuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueSuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && rangeList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' sliceElements ']'
  private static boolean valueSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && sliceElements(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' IDENTIFIER
  private static boolean valueSuffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueSuffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

}
