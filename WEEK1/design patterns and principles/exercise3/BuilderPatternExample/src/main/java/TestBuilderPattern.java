package main.java;
// TestBuilderPattern.java
public class TestBuilderPattern {
    public static void main(String[] args) {
        // Creating a basic computer configuration
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Computer Configuration:");
        System.out.println("CPU: " + basicComputer.getCPU());
        System.out.println("RAM: " + basicComputer.getRAM());
        System.out.println("Storage: " + basicComputer.getStorage());
        System.out.println();

        // Creating an advanced computer configuration
        Computer advancedComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 10 Pro")
                .setPowerSupply("750W")
                .build();

        System.out.println("Advanced Computer Configuration:");
        System.out.println("CPU: " + advancedComputer.getCPU());
        System.out.println("RAM: " + advancedComputer.getRAM());
        System.out.println("Storage: " + advancedComputer.getStorage());
        System.out.println("Graphics Card: " + advancedComputer.getGraphicsCard());
        System.out.println("Operating System: " + advancedComputer.getOperatingSystem());
        System.out.println("Power Supply: " + advancedComputer.getPowerSupply());
    }
}

