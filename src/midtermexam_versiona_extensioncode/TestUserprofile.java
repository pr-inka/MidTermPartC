/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author prink
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Sci-Fi");
        System.out.println("5. Romance");
        
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();
        
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Sci-Fi";
                break;
            case 5:
                genre = "Romance";
                break;
            default:
                genre = "Unknown";
        }
        
        System.out.println("Your user profile was created");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}

    

