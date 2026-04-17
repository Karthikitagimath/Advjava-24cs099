//2 a. Develop a java program for performing various string operations with different string handling functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()

package collections;

public class StringPerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        // Test for StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        // Test for StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("StringBuffer Time: " + timeBuffer + " ns");
        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

        // Conclusion
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}
