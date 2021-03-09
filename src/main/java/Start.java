import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    
    public static void main(String[] args) {
        
        // task 1
        System.out.println("Task 1");
        
        Integer[] arr = new Integer[] {1, 2, 3, 4};
        System.out.println("Init array: " + Arrays.toString(arr));
        
        swap(arr, 1, 2);
        System.out.println("Fixed array: " + Arrays.toString(arr));
        
        String[] arr2 = new String[] {"a", "b", "c", "d"};
        System.out.println("Init array: " + Arrays.toString(arr2));
        
        swap(arr2, 2, 3);
        System.out.println("Fixed array: " + Arrays.toString(arr2));
        
        // task 2
        System.out.println("Task 2");
        
        ArrayList<Integer> listOne = toArrayList(arr);
        System.out.println(listOne.toString());
        
        ArrayList<String> listTwo = toArrayList(arr2);
        System.out.println(listTwo.toString());
        
        // task 3
        System.out.println("Task 3");
        List<Orange> oranges = toArrayList(new Orange[] {new Orange(), new Orange(), new Orange(), new Orange()});
        List<Apple> apples = toArrayList(
            new Apple[] {new Apple(), new Apple(), new Apple(), new Apple(), new Apple(), new Apple()});
        Box<Orange> boxWithOranges = new Box<>(oranges);
        Box<Apple> boxWithApple = new Box<>(apples);
        
        boolean result = boxWithOranges.compare(boxWithApple);
        System.out.println("The weight of two box: " + (result ? "equals" : "not equals"));
        
        boxWithApple.toEmpty(1);
        result = boxWithOranges.compare(boxWithApple);
        System.out.println("The weight of two box: " + (result ? "equals" : "not equals"));
        
        Box<Apple> boxWithAppleTwo = new Box<>(new ArrayList<Apple>());
        
        System.out.println("Weight of the first box: " + boxWithApple.getWeight() + ", weight of the second box: "
            + boxWithAppleTwo.getWeight());
        
        boxWithAppleTwo.setContent(boxWithApple.toEmpty());
        
        System.out.println("Weight of the first box: " + boxWithApple.getWeight() + ", weight of the second box: "
            + boxWithAppleTwo.getWeight());
        
    }
    
    public static <T> void swap(T[] arr, int i, int j) {
        
        T change = arr[i];
        arr[i] = arr[j];
        arr[j] = change;
    }
    
    public static <T> ArrayList<T> toArrayList(T[] arr) {
        
        ArrayList<T> list = new ArrayList<T>();
        
        for (T oneElement : arr) {
            list.add(oneElement);
        }
        
        return list;
        
    }
    
}
