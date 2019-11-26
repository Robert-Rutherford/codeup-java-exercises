import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input inputUtil = new Input();
        System.out.println(inputUtil.getString());

        System.out.println(inputUtil.yesNo());

        System.out.println(inputUtil.getDouble());

        System.out.println(inputUtil.getDouble(2,12));

        System.out.println(inputUtil.getInt());

        System.out.println(inputUtil.getInt(1,10));






    }
}
