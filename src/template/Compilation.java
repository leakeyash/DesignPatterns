package template;

public abstract class Compilation {
    public void prepareMachineLanguage(){
        writeSourceCode();
        compileSourceCode();
        if(CheckCLR()){
            compileIntermediaryLanguage();
        }
    }

    protected abstract void writeSourceCode();
    protected final void compileSourceCode(){
        System.out.println("Compiled source code to exe or dll which composed by MSIL and metadata.");
    }
    // this method named hook~
    protected boolean CheckCLR(){
        return true;
    }
    protected abstract void compileIntermediaryLanguage();
}
