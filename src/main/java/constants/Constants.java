package constants;

import com.github.javafaker.Faker;

public class Constants {
    public static final String URL = "https://www.demoblaze.com/index.html";
    public static final String USERNAME = "Andreea12";
    public static final String PASSWORD = "123";
    public static final String WELCOME_MESSAGE = "Welcome";
    public static final String SIGN_UP_TITLE = "Sign up";
    public static final String SIGN_UP_TITLE_WRONG = "Sign up, dear user !";
    public static final String SIGN_UP_SUCCESSFUL_MESSAGE = "Sign up successful.";
    public static final String PRODUCT_ADDED_TEXT = "Product added.";

    public static String generateUsername(){
        Faker faker = new Faker();
        return faker.name().firstName() + "@gmail.com";
    }

    // rgb colors
    public static final String BLUE_COLOR = "rgba(2, 117, 216, 1)";
}
