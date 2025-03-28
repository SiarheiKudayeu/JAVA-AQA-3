package lesson5.enums.ex1;

public class StartPlatform {
    public static void main(String[] args) {
        startPlatform(Platforms.FIREFOX);
        System.out.println(Platforms.FIREFOX);
    }

    public static void startPlatform(Platforms platforms){
        switch (platforms){
            case EDGE -> System.out.println("Edge started!");
            case SAFARI -> System.out.println("Safari started!");
            case CHROME -> System.out.println("Chrome started!");
            case FIREFOX -> System.out.println("Firefox started!");
        }
    }
}
