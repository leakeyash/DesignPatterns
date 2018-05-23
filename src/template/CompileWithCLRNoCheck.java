package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileWithCLRNoCheck extends Compilation{
    @Override
    protected void writeSourceCode() {
        System.out.println("write some codes in core");
    }

    @Override
    protected void compileIntermediaryLanguage() {
        System.out.println("compiled MSIL to machine language via JIT in CLR");
    }
    @Override
    protected boolean CheckCLR(){
        String check = getUserInput();
        boolean result;
        try {
            result = Boolean.parseBoolean(check);
        }
        catch (NumberFormatException e) {
            // Use whatever default you like
            result = false;
        }
        return result;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Do you want to check CLR (true/false)?");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = bf.readLine();
        }
        catch (IOException ioe){
            System.err.println("IO error trying to read your answer.");
        }

        if(answer==null){
            return "no";
        }
        return answer;
    }
}
