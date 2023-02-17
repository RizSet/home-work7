import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() {
        int code;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter HTTP status code!");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter valid number");
                scanner.next();
                continue;
            }
                code = scanner.nextInt();
                break;
        }
        scanner.close();
        try {
            new HttpStatusImageDownloader().downloadStatusImage(code);
        } catch (Exception e) {
            System.out.println("There is not image for HTTP status " + code);
        }
    }
}
