package study.java.self.test;

public class Sample {
    public static void main(String[] args) {
        String sampleStr = "elephant";

        int resultCharE = useRecur(sampleStr, 'e', 0);
        System.out.println("Total char (e): " + resultCharE);

        int resultCharH = useRecur(sampleStr, 'h', 0);
        System.out.println("Total char (h): " + resultCharH);
    }

    public static int useRecur(String keyword, char data, int index) {
        if(index >= keyword.length()){
            return 0;
        }

        int count = keyword.charAt(index) == data ? 1 : 0;

        return count + useRecur(keyword, data, index + 1);
    }
}
