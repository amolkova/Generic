import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    
    private List<T> content;
    
    public Box(List<T> content) {
        this.content = content;
        
    }
    
    public Box(T one) {
        content = new ArrayList<>();
        content.add(one);
    }
    
    public void setContent(List<T> fruits) {
        if (fruits == null) {
            return;
        }
        content.addAll(fruits);
    }
    
    public void setContent(T e) {
        if (e == null) {
            return;
        }
        content.add(e);
    }
    
    public List<T> toEmpty() {
        List<T> buf = content;
        content = new ArrayList<T>();
        return buf;
    }
    
    public List<T> toEmpty(int count) {
        if (count <= content.size()) {
            List<T> buf = content.subList(0, count);
            content.removeAll(buf);
            return buf;
        }
        throw new RuntimeException("Size of box less than you want");
    }
    
    public Float getWeight() {
        if (!content.isEmpty()) {
            return content.get(0).getWeight() * content.size();
        }
        
        return 0.0f;
    }
    
    public boolean compare(Box<?> box) {
        if (box == null) {
            return false;
        }
        
        return getWeight().equals(box.getWeight());
    }
}
