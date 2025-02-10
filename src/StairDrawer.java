public class StairDrawer {
    public void drawStairs(String direction) {
        // Convert direction to lower case for easier comparison
        direction = direction.toLowerCase();

        if (direction.equals("up")) {
            drawStairsUp();
        } else if (direction.equals("down")) {
            drawStairsDown();
        } else if (direction.equals("upside down")) {
            drawStairsUpsideDown();
        } else if (direction.equals("upside down left")) {
            drawStairsUpsideDownLeft();
        } else {
            System.out.println("Invalid direcion");
        }
    }
    private void drawStairsUp() {
        System.out.println("Dawing stairs ging up:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(" ".repeat(5 - i) + "#".repeat(i));
        }
    }
    private void drawStairsDown() {
        System.out.println("Drawing stairs going down:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(" ".repeat(5 - i) + "#".repeat(i));
        }
    }

    private void drawStairsUpsideDown() {
        System.out.println("Drawing upside down stairs:");
        for (int i = 5; i >= 1; i--) {
            System.out.println("#".repeat(i));
        }
    }

    private void drawStairsUpsideDownLeft() {
        System.out.println("Drawing upside down stairs left:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("#".repeat(i));
        }
    }
}
