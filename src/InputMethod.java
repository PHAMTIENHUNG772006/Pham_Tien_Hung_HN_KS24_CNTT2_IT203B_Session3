import java.util.Scanner;

public class InputMethod {

    public static Scanner input(){
        return new Scanner(System.in);
    }

    public static String inputData(String message){
        System.out.println(message);

        String string = input().nextLine();
        if (string.isBlank()){
            System.out.println("Lỗi : không được để trống");
        }else {
            return string;
        }
        return null;
    }
}
