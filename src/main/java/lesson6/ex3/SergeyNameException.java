package lesson6.ex3;

public class SergeyNameException extends Exception {
    @Override
    public String getMessage(){
        return "Sergey name is forbidden!!";
    }

}
