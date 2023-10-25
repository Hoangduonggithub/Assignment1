public class StackFrames{
        public static void main(String[] args) {
            int result = multiply(5, 7);
            System.out.println("Result: " + result);
        }
        public static int multiply(int a, int b) {
            int product = a * b;
            int squaredProduct = square(product);
            return squaredProduct;
        }
        public static int square(int num) {
            int squaredNum = num * num;
            return squaredNum;
        }
    }

