import java.util.Scanner;


class userCard{
  
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя и фамилию: ");
        String name = scanner.nextLine();
        System.out.print("Введите ваш пол: ");
        String sex = scanner.nextLine();
        System.out.print("Введите ваше семейное положение: ");
        String maritalStatus = scanner.nextLine();
        System.out.print("Введите место работы: ");
        String job = scanner.nextLine();
        System.out.print("Введите должность: ");
        String position = scanner.nextLine();
        System.out.print("Введите ваши увлечения: ");
        String hobbi = scanner.nextLine();
        System.out.print("Введите лубимый лозунг или афоризм: ");
        String slogan = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.print("Дату рождения: ");
        int dateofBirth = scanner.nextInt();
        System.out.print("Сколько времени в день работайте(часов): ");
        int hoursOfWork = scanner.nextInt();
        System.out.print("Сколько времени в день отдыхаите(часов): ");
        int hoursOfRest = scanner.nextInt();

        System.out.printf("Карточка пользователя: %n");
        System.out.printf("------------------------------------ %n");
        System.out.printf("имя и фамилия: %26s%n", name);
        System.out.printf("Возраст: %26d%n",age);
        System.out.printf("Ваша дата рождения: %16d%n",dateofBirth);
        System.out.printf("Пол: %33s%n", sex);
        System.out.printf("Семейное положение: %20s%n", maritalStatus);
        System.out.printf("Место работы: %28s%n", job);
        System.out.printf("Должность: %28s%n", position );
        System.out.printf("Время работы в день: %14d%n", hoursOfWork);
        System.out.printf("Время отдыха в день: %14d%n", hoursOfRest);
        System.out.printf("Увлечения, хобби: %20s%n", hobbi);
        System.out.printf("Любимый лозунг, афоризм: %20s%n", slogan); 
        System.out.printf("------------------------------------ %n");
      
    } 
}
