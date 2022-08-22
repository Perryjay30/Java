package Exercise8_10;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {
    public static void main(String[] args) {
        System.out.println("All Foods:");

        for(Food food : Food.values()) {
            System.out.printf("%-10s%-20s%s%n", food, food.getType(), food.getNumberOfCalories());
        }

    }

}