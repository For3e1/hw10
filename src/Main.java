public class Main {
    public static void main(String[] args) {
        //Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName  = "Ivanov";
        String fullName  = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
        //Задача 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //Задача 3
        fullName = new String("Иванов Семён Семёнович");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

    }
}