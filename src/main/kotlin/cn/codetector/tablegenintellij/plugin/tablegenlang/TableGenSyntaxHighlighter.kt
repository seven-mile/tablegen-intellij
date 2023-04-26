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

        // Comments
        tokenHighlighters[TableGenTypes.COMMENTS] =
            arrayOf(createTextAttributesKey("TABLEGEN_COMMENTS", DefaultLanguageHighlighterColors.BLOCK_COMMENT))
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return tokenHighlighters[tokenType] ?: arrayOf()
    }

    override fun getHighlightingLexer(): Lexer = TableGenLexerAdapter()
}