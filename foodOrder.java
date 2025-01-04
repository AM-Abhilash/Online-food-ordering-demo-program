import java.util.Scanner;

public class foodOrder {
    public static void main(String[] args) {
       System.out.println("Zomato Welcomes you");
        Scanner scanner = new Scanner(System.in);
        String n = "Abhilash";
        int p = 1234;
        String id = " ";
        int p1;
        
     System.out.println(" ");
    System.out.println("Select your account status");
    System.out.println("1.Already exist      2.Create new account ");
    int n1 = scanner.nextInt();
        scanner.nextLine();
        
   switch (n1) {
        case 1:
                System.out.println("Enter the Id");
                id = scanner.nextLine();
                System.out.println("Enter the Password");
                p1 = scanner.nextInt();
                scanner.nextLine();
                if (id.equals(n) && p1 == p) {
                    System.out.println("Welcome back " + id);
                } else {
                    System.out.println("Invalid credentials");
                }
                break;
            case 2:
                System.out.println("Enter the Id");
                id = scanner.nextLine();
                System.out.println("Set the Password");
                p1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Welcome " + id);
                break;
            default:
                System.out.println("Invalid option");
                return;
        }
        
        System.out.println("Enter your Location");
        String l = scanner.nextLine();
        
        if (l.equalsIgnoreCase("Karur")) {
            System.out.println("Enter your type");
            System.out.println("1.veg      2.non-veg");
            int n2 = scanner.nextInt();
            scanner.nextLine();
            
        switch (n2) {
              case 1:
                    System.out.println("Select the restaurant");
                    System.out.println("1.Uduppi Hotel");
                    System.out.println("2.Iyer Mess");
                    System.out.println("3.Brahmin Hotel");
                    int n3 = scanner.nextInt();
                    scanner.nextLine();
                    
                  switch (n3) {
                        default:
                            System.out.println("Menu");
                            System.out.println("======");
                            System.out.println("1.Biriyani $150");
                            System.out.println("2.Paneer Tikka $100");
                            System.out.println("3.Veg fried rice $80");
                            System.out.println("  ");
                            System.out.println("Select Your Order");
                            int n4 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter the quantity");
                            int n5 = scanner.nextInt();
                            scanner.nextLine();
                            
                            switch (n4) {
                                case 1:
                                    System.out.println("Your order of " + n5 + " Biriyani will be delivered to your destination");
                                    System.out.println("Your total cost: " + (n5 * 150) + "$");
                                    break;
                                case 2:
                                    System.out.println("Your order of " + n5 + " Paneer Tikka will be delivered to your destination");
                                    System.out.println("Your total cost: " + (n5 * 100) + "$");
                                    break;
                                case 3:
                                    System.out.println("Your order of " + n5 + " Veg fried rice will be delivered to your destination");
                                    System.out.println("Your total cost: " + (n5 * 80) + "$");
                                    break;
                                default:
                                    System.out.println("Invalid selection");
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Select the restaurant");
                    System.out.println("1.Arabian");
                    System.out.println("2.Althaza");
                    System.out.println("3.Paragon");
                    int n7 = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (n7) {
                        default:
                            System.out.println("Menu");
                       System.out.println("======");
                        System.out.println("1.Biriyani $150");
                      System.out.println("2.Alfaham $100");
                       System.out.println("3.Chicken fried rice $80");
                            System.out.println("  ");
                            System.out.println("Select Your Order");
                            int n8 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter the quantity");
                            int n9 = scanner.nextInt();
                            scanner.nextLine();
                            
                            switch (n8) {
                                case 1:
                                    System.out.println("Your order of " + n9 + " Biriyani will be delivered to your destination");
                          System.out.println("Your total cost: " + (n9 * 150) + "$");
                                    break;
                                case 2:
                            System.out.println("Your order of " + n9 + " Alfaham will be delivered to your destination");
                                    System.out.println("Your total cost: " + (n9 * 100) + "$");
                                    break;
                          case 3:
                               System.out.println("Your order of " + n9 + " Chicken fried rice will be delivered to your destination");
                                    System.out.println("Your total cost: " + (n9 * 80) + "$");
                                    break;
                                default:
                                    System.out.println("Invalid selection");
                              break;
                            }
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } else {
            System.out.println("Service not available in your location");
        }
    }
}
