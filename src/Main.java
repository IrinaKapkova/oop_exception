public class Main {
    public static void main(String[] args) {

        boolean success =Data.validate("123456q_1231231231322222222222222222222222222222222222", "123456q_", "123456q_");
        if (success){
            System.out.println("Данные корректные");
        } else {
            System.out.println("Введенные логин и/или пароль не прошли проверку");
        }

    }
}