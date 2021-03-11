
public class Fruit {
    private String name;
    private Float weight;
    
    public Fruit(String name, Float weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Float getWeight() {
        return weight;
    }
    
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Fruit [name=" + name + ", weight=" + weight + "]";
    }
    
}
