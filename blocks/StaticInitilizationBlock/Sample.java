package blocks.StaticInitilizationBlock;

public class Sample {
    // Static Initialization Block 1
    static {
        System.out.println("SIB1");
        // This block will be executed first when the class is loaded
    }

    // Static Initialization Block 2
    static {
        System.out.println("SIB2");
        // This block will be executed second when the class is loaded
    }

    // Static Initialization Block 3
    static {
        System.out.println("SIB3");
        // This block will be executed third when the class is loaded
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        // This message will be printed when the main method is executed
    }
}
