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

public class TableGenBangFunctionImpl extends ASTWrapperPsiElement implements TableGenBangFunction {

  public TableGenBangFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TableGenVisitor visitor) {
    visitor.visitBangFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TableGenVisitor) accept((TableGenVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public TableGenBangOperator getBangOperator() {
    return findNotNullChildByClass(TableGenBangOperator.class);
  }

  @Override
  @Nullable
  public TableGenType getType() {
    return findChildByClass(TableGenType.class);
  }

  @Override
  @NotNull
  public TableGenValueListNE getValueListNE() {
    return findNotNullChildByClass(TableGenValueListNE.class);
  }

}
