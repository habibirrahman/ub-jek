package UBJek;

import java.util.Scanner;

public class UBJekBeraksi {

    static String[] driver = {"paul", "dani", "choco"};
    static String[] password = {"paul123", "dani123", "choco123"};

    public static String auth() {
        Scanner in = new Scanner(System.in);
        System.out.print("Username: ");
        String user = in.nextLine();
        String user2 = user.toUpperCase();
        System.out.print("Password: ");
        String pass = in.nextLine();
        for (int j = 0; j < driver.length; j++) {
            if (user.equalsIgnoreCase(driver[j]) && pass.equals(password[j])) {
                System.out.println("Selamat Datang "+user2);
                return user2;
            }
        }

        return "failed";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("= = =\t Welcome UBJek Driver\t= = =");
        System.out.println("\t- - -\tLOGIN\t - - -");
        String login = auth();

        if (login.equals("failed")) {
            System.out.println("- - -\t Login Failed");
            System.out.println("= = =\t Exit");
            return;
        }

        
        System.out.println("");
        UBJek driver1 = new UBJek(login);
        
        System.out.println("--HOME--");
        System.out.println("1. Tambah Penumpang");
        System.out.println("2. Tambah Penumpang");
        System.out.println("1. Tambah Penumpang");
        Penumpang P1 = new Penumpang("Nay", 10);
        driver1.newCostumer(P1);
        P1 = new Penumpang("Tzui", 12);
        driver1.newCostumer(P1);
        P1 = new Penumpang("Sana", 10);
        driver1.newCostumer(P1);
        P1 = new Penumpang("Jeni", 9);
        driver1.newCostumer(P1);

        driver1.cetakPenumpang();
        System.out.println(driver1);
        driver1.omsetUbJek();

    }
}
