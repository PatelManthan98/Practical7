public class P1
{
    public static <A> void printArray(A[] inputArray) {
        for (A element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O',',','M','A','N','T','H','A','N'};
        System.out.println("Array integerArray contains:");
        printArray(intArray);
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);
        System.out.println("\nArray characterArray contains:");
        printArray(charArray);
    }
}
