package exercise18_19;

import java.util.Objects;

public class Computer {
    private String processor;
    private String ram;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer(){}

    public Computer(String processor, String ram, String graphicsCard, String company, String model){
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }



    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
              //  ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) && Objects.equals(ram, computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram);
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("3.5", "16.0", "4.0", "HP", "Pavillion");
        Computer computer2 = new Computer("3.5", "16.0", "2.0", "Lenovo", "Ideapad");
        Computer computer3 = new Computer("2.5", "8.0", "4.0", "HP", "Pavillion");

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        System.out.println(computer3.toString());
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.equals(computer3));
        System.out.println(computer2.equals(computer3));
        System.out.println(computer1.hashCode());
        System.out.println(computer2.hashCode());
        System.out.println(computer3.hashCode());
    }
}
