public class ExceptionConcept {
    public static void main(String[] args) {
        throw new MyCompileTimeException("Exception occurred"); //user defined exception
    }
}

class MyCompileTimeException extends Exception {
    public MyCompileTimeException (String message){
        super(message);
    }
}