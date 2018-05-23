package template;

public class CompilationDriver {
    public static void main(String[] args){
        CompileWithCLRNoCheck ccnk = new CompileWithCLRNoCheck();
        CompileWithCoreCLR ccc = new CompileWithCoreCLR();
        ccc.prepareMachineLanguage();
        ccnk.prepareMachineLanguage();
    }
}
