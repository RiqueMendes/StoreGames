
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String userName, password;
        String[] products = {" 0 - Computer", " 1 - Keyboard", " 2 - Mouse", " 3 - Router"};
        System.out.println("Welcome to the store app!");

        try {
            User u = MockUser.getUser();
            Products p0 = new Products();
            System.out.println("Login: ");
            userName = sc.next();

            System.out.println("Password:");
            password = sc.next();

            if (u.AccVerify(password, userName) == false) {
                do {
                    System.out.println("Welcome to the Store" + u.getUserName());

                    System.out.println("\n.......... MENU ........... ");
                    System.out.println("1- Buy Products");
                    System.out.println("2- List your products");
                    System.out.println("3- Exit");
                    System.out.print("Choose an option: ");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Select products to buy:");
                            System.out.println("\n"+ products[0] + "\n"+ products[1] + "\n"+ products[2] + "\n"+ products[3]);
                            int productBuy = sc.nextInt();
                            System.out.println("You have selected the product: " + productBuy + "wish to buy another? (1 to Yes /2 to No) ");
                            int option12 = sc.nextInt();
                            
                            if(option12 == 1){
                                System.out.println("Select other product to buy:");
                            } else {
                                System.out.println("Continue");
                                continue;
                            }

                        case 2:
                            System.out.println("Your products: ");
                            break;

                        case 3:
                            System.out.println(" Thank you. \n GoodBye!");
                            break;

                        

                    }
                } while (true);
            }
        } catch (Exception e) {
            System.out.println("ERROR.");
            System.out.println("ERRO" + e);

        }
        ;

    }
}
