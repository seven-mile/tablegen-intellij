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

public class TableGenConditionFunctionImpl extends ASTWrapperPsiElement implements TableGenConditionFunction {

  public TableGenConditionFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TableGenVisitor visitor) {
    visitor.visitConditionFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TableGenVisitor) accept((TableGenVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TableGenCondClause> getCondClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TableGenCondClause.class);
  }

  @Override
  @NotNull
  public TableGenCondOperator getCondOperator() {
    return findNotNullChildByClass(TableGenCondOperator.class);
  }

}
