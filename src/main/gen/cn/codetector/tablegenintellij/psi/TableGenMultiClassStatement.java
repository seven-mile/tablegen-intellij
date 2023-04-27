// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TableGenMultiClassStatement extends PsiElement {

  @Nullable
  TableGenAssertStmt getAssertStmt();

  @Nullable
  TableGenDefStmt getDefStmt();

  @Nullable
  TableGenDefmStmt getDefmStmt();

  @Nullable
  TableGenDefvarStmt getDefvarStmt();

  @Nullable
  TableGenLetStmt getLetStmt();

}
