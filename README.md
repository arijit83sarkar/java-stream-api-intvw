# java-stream-api
## Java Stream API

### :arrow_right_hook: Write a Java Stream pipeline to filter EVEN and ODD numbers from a list and collect them into a new list.
```java
List<Integer> integerList = Arrays.asList(2, 4, 9, 53, 69, 5, 6, 8, 7, 13, 26, 76, 48);
List<Integer> evenList = integerList.stream()
                .filter(e -> e % 2 == 0)
                .toList();
```


### :arrow_right_hook: Given a list of strings, write a Stream pipeline to transform them to uppercase and collect them into a set.
```java
List<String> sList = Arrays.asList("aa","bb","cc","dd","ee","aa","cc");
Set<String> result = sList.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toSet());
```


### :arrow_right_hook: Write a Stream pipeline to find the sum of all elements in a list of integers.
```java
List<Integer> integerList = Arrays.asList(2, 4, 1, 5, 6)

// method #1
Integer sum = integerList.stream().reduce((a, b) -> (a + b)).get();
System.out.println(sum);

// method #2
sum = integerList.stream().reduce(Integer::sum).get();
System.out.println(sum);

// method #3
Integer sum1 = integerList.stream().mapToInt(Integer::intValue).sum();
System.out.println(sum1);
```


### :arrow_right_hook: Write a Stream pipeline to find the average of all elements in a list of integers.
```java
List<Integer> integerList = Arrays.asList(2, 4, 1, -5, 6, 7, 9);
Double average = integerList.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
System.out.println(average);
```


### :arrow_right_hook: Write a Stream pipeline to find the distinct elements from a list of elements that contains duplicate elements also.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 222, 24, 98, 230, 73, -45, 54, 60, 22, 30, 29);
System.out.println(integerList.stream()
                .filter(e -> Collections.frequency(integerList, e) == 1)
                .collect(Collectors.toList())
        );
```


### :arrow_right_hook: Write a Stream pipeline to find the duplicate elements from a list of elements that contains duplicate elements also.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 222, 24, 98, 230, 73, -45, 54, 60, 22, 30, 29);

// method #1
System.out.println(integerList.stream()
                .filter(e -> Collections.frequency(integerList, e) > 1)
                .collect(Collectors.toSet())
        );

// method #2
Set<Integer> numbers = new HashSet<>();
Set<Integer> duplicates = integerList.stream()
                .filter(e -> !numbers.add(e))
                .collect(Collectors.toSet());
System.out.println(duplicates);
```


### :arrow_right_hook: Given a list of objects with a getPrice() method, write a Stream pipeline to collect the average of all elements in a list.
```java
public class AverageOfNumbers {
    public static void main(String[] args) {
        Item item1 = new Item(35.5, 10);
        Item item2 = new Item(45.5, 15);
        Item item3 = new Item(55.5, 25);
        Item item4 = new Item(65.5, 40);
        Item item5 = new Item(75.5, 50);
        Item item6 = new Item(85.5, 60);
        Item item7 = new Item(95.5, 70);
        Item item8 = new Item(105.5, 80);

        List<Item> items = Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8);

        Double average = items.stream()
                .map(Item::getPrice)
                .mapToDouble(p -> p)
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}

public class Item {
    private double price;
    private int stock;

    public Item(double price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
```


### :arrow_right_hook: Given a list of objects with a getName() method, write a Stream pipeline to collect the names into a list.
```java
```

### :arrow_right_hook: Write a Stream pipeline to count the number of elements in a list that satisfy a certain condition.
```java
```


### :arrow_right_hook: Given a list of strings, write a Stream pipeline to find the first string that starts with a specific character.
```java
```


### :arrow_right_hook: Write a Stream pipeline to group a list of objects by a specific property.
```java
```


### :arrow_right_hook: Explain how you would use streams to read a file line by line and process each line.
```java
```


