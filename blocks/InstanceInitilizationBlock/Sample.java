package blocks.InstanceInitilizationBlock;

public class Sample {
    // Instance Initialization Block 1
    {
        System.out.println("SIB1");
        // This block will be executed every time an instance of Sample is created
    }

    // Instance Initialization Block 2
    {
        System.out.println("SIB2");
        // This block will also be executed every time an instance of Sample is created
    }

    // Instance Initialization Block 3
    {
        System.out.println("SIB3");
        // This block will be executed every time an instance of Sample is created
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        System.out.println("Main start");
        // Creating an instance of Sample
        new Sample();
        // When an instance is created, all instance initialization blocks will be executed in order
    }
}
