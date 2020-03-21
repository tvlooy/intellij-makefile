// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import name.kropp.intellij.makefile.psi.MakefileInlineCommand;
import name.kropp.intellij.makefile.psi.MakefileVisitor;
import org.jetbrains.annotations.NotNull;

public class MakefileInlineCommandImpl extends ASTWrapperPsiElement implements MakefileInlineCommand {

  public MakefileInlineCommandImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MakefileVisitor visitor) {
    visitor.visitInlineCommand(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MakefileVisitor) accept((MakefileVisitor)visitor);
    else super.accept(visitor);
  }

}
