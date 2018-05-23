package template;

public class CompileWithCoreCLR extends Compilation{
    @Override
    protected void writeSourceCode() {
        System.out.println("write some codes in core");
    }

    @Override
    protected void compileIntermediaryLanguage() {
        System.out.println("compiled MSIL to machine language via JIT in core CLR");
    }
}
