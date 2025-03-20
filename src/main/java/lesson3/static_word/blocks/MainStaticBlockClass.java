package lesson3.static_word.blocks;

public class MainStaticBlockClass {
    public static void main(String[] args) {
        StaticBlocksOfCode.method();
        StaticBlocksOfCode s = new StaticBlocksOfCode();
        StaticBlocksOfCode s1 = new StaticBlocksOfCode();
        System.out.println(StaticBlocksOfCode.date);
    }
}
