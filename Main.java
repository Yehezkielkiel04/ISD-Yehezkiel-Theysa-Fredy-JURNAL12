import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah task");
            System.out.println("2. Tampilkan task terdekat");
            System.out.println("3. Selesaikan task terdekat");
            System.out.println("4. Hapus semua task");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan deadline (integer): ");
                    int deadline = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Masukkan deskripsi task: ");
                    String description = scanner.nextLine();
                    todoList.addTask(deadline, description);
                    break;
                case 2:
                    todoList.showNextTask();
                    break;
                case 3:
                    todoList.removeTask();
                    break;
                case 4:
                    todoList.clearTasks();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }
}

