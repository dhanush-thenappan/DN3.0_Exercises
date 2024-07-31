
public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a Computer using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG")
                .setPowerSupply("750W")
                .setCoolingSystem("Liquid Cooling")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("Integrated Graphics")
                .setMotherboard("Gigabyte")
                .setPowerSupply("500W")
                .setCoolingSystem("Air Cooling")
                .build();

        // Print the configurations
        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
