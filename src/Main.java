import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Service service = new Service();
        while (true) {
            System.out.println("1. Create");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Show");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    service.creatStaff(create());
                    break;
                case 2:
                    System.out.println("Enter id to edit");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    int indexUpdate = service.findIndexById(idUpdate);
                    if (indexUpdate >= 0) {
                        service.updateStaff(indexUpdate, create());
                    }
                    break;
                case 3:
                    System.out.println("Enter id to delete");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    int indexDelete = service.findIndexById(idDelete);
                    if (indexDelete >= 0) {
                        service.deleteStaff(indexDelete);
                    }
                    break;
                case 4:
                    service.show();
                    break;
            }
        }
    }

    public static Staff create() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter age");
        int age = Integer.parseInt(scanner.nextLine());
        return new Staff(name, age);
    }
}
