// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TableGenValue extends PsiElement {

  @NotNull
  TableGenSimpleValue getSimpleValue();

  @NotNull
  List<TableGenValue> getValueList();

  @NotNull
  List<TableGenValueSuffix> getValueSuffixList();

}
