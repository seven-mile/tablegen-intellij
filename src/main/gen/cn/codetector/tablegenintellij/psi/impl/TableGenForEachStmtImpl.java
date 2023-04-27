// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cn.codetector.tablegenintellij.psi.TableGenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cn.codetector.tablegenintellij.psi.*;

public class TableGenForEachStmtImpl extends ASTWrapperPsiElement implements TableGenForEachStmt {

  public TableGenForEachStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TableGenVisitor visitor) {
    visitor.visitForEachStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TableGenVisitor) accept((TableGenVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public TableGenForEachIterator getForEachIterator() {
    return findNotNullChildByClass(TableGenForEachIterator.class);
  }

  @Override
  @NotNull
  public List<TableGenStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TableGenStatement.class);
  }

}
