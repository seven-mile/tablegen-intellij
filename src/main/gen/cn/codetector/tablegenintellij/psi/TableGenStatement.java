// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TableGenStatement extends PsiElement {

  @Nullable
  TableGenAssertStmt getAssertStmt();

  @Nullable
  TableGenClassStmt getClassStmt();

  @Nullable
  TableGenDefSetStmt getDefSetStmt();

  @Nullable
  TableGenDefStmt getDefStmt();

  @Nullable
  TableGenDefmStmt getDefmStmt();

  @Nullable
  TableGenDefvarStmt getDefvarStmt();

  @Nullable
  TableGenForEachStmt getForEachStmt();

  @Nullable
  TableGenIfStmt getIfStmt();

  @Nullable
  TableGenLetStmt getLetStmt();

  @Nullable
  TableGenMultiClassStmt getMultiClassStmt();

}
