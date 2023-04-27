package cn.codetector.tablegenintellij.plugin.tablegenlang

import cn.codetector.tablegenintellij.TableGenLexerAdapter
import cn.codetector.tablegenintellij.psi.TableGenTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

class TableGenSyntaxHighlighter : SyntaxHighlighterBase() {

    private val tokenHighlighters: MutableMap<IElementType, Array<TextAttributesKey>> = HashMap()

    init {
        // Keywords
        tokenHighlighters[TableGenTypes.KEYWORDDEF] =
            arrayOf(createTextAttributesKey("TABLEGEN_DEF", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDLET] =
            arrayOf(createTextAttributesKey("TABLEGEN_LET", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDIN] =
            arrayOf(createTextAttributesKey("TABLEGEN_IN", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDCODE] =
            arrayOf(createTextAttributesKey("TABLEGEN_CODE", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDDAG] =
            arrayOf(createTextAttributesKey("TABLEGEN_DAG", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDFIELD] =
            arrayOf(createTextAttributesKey("TABLEGEN_FIELD", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDINCLUDE] =
            arrayOf(createTextAttributesKey("TABLEGEN_INCLUDE", DefaultLanguageHighlighterColors.METADATA))
        tokenHighlighters[TableGenTypes.KEYWORDDEFM] =
            arrayOf(createTextAttributesKey("TABLEGEN_DEFM", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDFOREACH] =
            arrayOf(createTextAttributesKey("TABLEGEN_FOREACH", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDDEFSET] =
            arrayOf(createTextAttributesKey("TABLEGEN_DEFSET", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDDEFVAR] =
            arrayOf(createTextAttributesKey("TABLEGEN_DEFVAR", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDIF] =
            arrayOf(createTextAttributesKey("TABLEGEN_IF", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDTHEN] =
            arrayOf(createTextAttributesKey("TABLEGEN_THEN", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDELSE] =
            arrayOf(createTextAttributesKey("TABLEGEN_ELSE", DefaultLanguageHighlighterColors.KEYWORD))

        tokenHighlighters[TableGenTypes.KEYWORDCLASS] =
            arrayOf(createTextAttributesKey("TABLEGEN_CLASS", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDINT] =
            arrayOf(createTextAttributesKey("TABLEGEN_INT", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDSTRING] =
            arrayOf(createTextAttributesKey("TABLEGEN_STRING", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDLIST] =
            arrayOf(createTextAttributesKey("TABLEGEN_LIST", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDBIT] =
            arrayOf(createTextAttributesKey("TABLEGEN_BIT", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDBITS] =
            arrayOf(createTextAttributesKey("TABLEGEN_BITS", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDMULTICLASS] =
            arrayOf(createTextAttributesKey("TABLEGEN_MULTICLASS", DefaultLanguageHighlighterColors.KEYWORD))

        // INCLUDE
        tokenHighlighters[TableGenTypes.KEYWORDINCLUDE] =
            arrayOf(createTextAttributesKey("TABLEGEN_INCLUDE", DefaultLanguageHighlighterColors.METADATA))

        // Constants
        tokenHighlighters[TableGenTypes.INTEGER] =
            arrayOf(createTextAttributesKey("TABLEGEN_INTLIT", DefaultLanguageHighlighterColors.NUMBER))
        tokenHighlighters[TableGenTypes.STRING] =
            arrayOf(createTextAttributesKey("TABLEGEN_STRINGLIT", DefaultLanguageHighlighterColors.STRING))
        tokenHighlighters[TableGenTypes.CODE_FRAGMENT] =
            arrayOf(createTextAttributesKey("TABLEGEN_CODE_FRAGMENT", DefaultLanguageHighlighterColors.INSTANCE_METHOD))

        // Identifiers
        tokenHighlighters[TableGenTypes.IDENTIFIER] =
            arrayOf(createTextAttributesKey("TABLEGEN_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER))
        tokenHighlighters[TableGenTypes.VARNAME] =
            arrayOf(createTextAttributesKey("TABLEGEN_VARNAME", DefaultLanguageHighlighterColors.IDENTIFIER))

        // Comments
        tokenHighlighters[TableGenTypes.BLOCK_COMMENT] =
            arrayOf(createTextAttributesKey("TABLEGEN_BLOCK_COMMENTS", DefaultLanguageHighlighterColors.BLOCK_COMMENT))
        tokenHighlighters[TableGenTypes.LINE_COMMENT] =
            arrayOf(createTextAttributesKey("TABLEGEN_LINE_COMMENTS", DefaultLanguageHighlighterColors.LINE_COMMENT))

        // Bang Operators
        tokenHighlighters[TableGenTypes.CONDITION] =
            arrayOf(createTextAttributesKey("TABLEGEN_CONDITION", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGADD] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_ADD", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGAND] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_AND", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGCAST] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_CAST", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGCON] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_CON", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGDAG] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_DAG", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGDIV] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_DIV", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGEMPTY] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_EMPTY", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGEQ] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_EQ", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGEXISTS] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_EXISTS", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGFILTER] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_FILTER", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGFIND] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_FIND", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGFOLDL] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_FOLDL", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGFOREACH] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_FOREACH", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGGE] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_GE", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGGETDAGOP] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_GETDAGOP", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGGT] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_GT", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGHEAD] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_HEAD", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGIF] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_IF", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGINTERLEAVE] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_INTERLEAVE", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGISA] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_ISA", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGLE] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_LE", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGLISTCONCAT] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_LISTCONCAT", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGLISTREMOVE] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_LISTREMOVE", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGLISTSPLAT] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_LISTSPLAT", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGLOGTWO] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_LOGTWO", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGLT] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_LT", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGMUL] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_MUL", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGNE] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_NE", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGNOT] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_NOT", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGOR] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_OR", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGRANGE] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_RANGE", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSETDAGOP] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_SETDAGOP", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSHL] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_SHL", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSIZE] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_SIZE", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSRA] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_SRA", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSRL] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_SRL", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSTRCONCAT] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_STRCONCAT", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSUB] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_SUB", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSUBST] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_SUBST", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGSUBSTR] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_SUBSTR", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGTAIL] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_TAIL", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGTOLOWER] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_TOLOWER", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGTOUPPER] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_BANGTOUPPER", DefaultLanguageHighlighterColors.FUNCTION_CALL))
        tokenHighlighters[TableGenTypes.BANGXOR] =
            arrayOf(createTextAttributesKey("TABLEGEN_BANG_OPERATOR_XOR", DefaultLanguageHighlighterColors.FUNCTION_CALL))
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return tokenHighlighters[tokenType] ?: arrayOf()
    }

    override fun getHighlightingLexer(): Lexer = TableGenLexerAdapter()
}