package chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "Два";
        switch (str){
            case "Один":
                System.out.println("Один");
                break;
            case "Два":
                System.out.println("Два");
                break;
            case "Три":
                System.out.println("Три");
                break;
            default:
                System.out.println("Не совпало");
                break;
        }
    }
}
