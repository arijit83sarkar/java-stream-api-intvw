# java-stream-api
## Java Stream API

### 1. Write a Java Stream pipeline to filter EVEN and ODD numbers from a list and collect them into a new list.
```java
List<Integer> integerList = Arrays.asList(2, 4, 9, 53, 69, 5, 6, 8, 7, 13, 26, 76, 48);
List<Integer> evenList = integerList.stream()
                .filter(e -> e % 2 == 0)
                .toList();
```


### 2. Given a list of strings, write a Stream pipeline to transform them to uppercase and collect them into a set.
```java
List<String> sList = Arrays.asList("aa","bb","cc","dd","ee","aa","cc");
Set<String> result = sList.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toSet());
```


### 3. Write a Stream pipeline to find the sum of all elements in a list of integers.
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


### 4. Write a Stream pipeline to find the average of all elements in a list of integers.
```java
List<Integer> integerList = Arrays.asList(2, 4, 1, -5, 6, 7, 9);
average = integerList.stream()
        .collect(Collectors.averagingInt(e -> e));
System.out.println(average);

List<Double> doubleList = List.of(2.4, 5.6, 9.12, 7.34);
average = doubleList.stream()
        .collect(Collectors.averagingDouble(e -> e));
System.out.println(average);
```


### 5. Write a Stream pipeline to find the MAX and MIN from all elements in a list of elements.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98);

// MAX
// option #1
int max = integerList.stream()
          // .max(Comparator.comparing(Integer::valueOf))
          .max(Comparator.comparing(e -> e))
          .get();
System.out.println(max);

// option #2
Integer _max= integerList.stream()
            .reduce((num1, num2) -> num1 > num2 ? num1 : num2)
            .get();
System.out.println("Max :: " + _max);

// option #3
_max = integerList.stream()
      .reduce(Integer::max)
      .get();
System.out.println("Max :: " + _max);

// MIN
// option #1
int min = integerList.stream()
            // .min(Comparator.comparing(Integer::valueOf))
            .min(Comparator.comparing(e -> e))
            .get();
System.out.println(min);

// option #2
Integer _min=integerList.stream()
            .reduce((num1, num2) -> num1 < num2 ? num1 : num2)
            .get();
System.out.println("Min ::: " + _min);

// option #3
_min = integerList.stream()
       .reduce(Integer::min)
        .get();
System.out.println("Min ::: " + _min);
```


### 6. Write a Stream pipeline to find the distinct elements from a list of elements that contains duplicate elements also.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 222, 24, 98, 230, 73, -45, 54, 60, 22, 30, 29);
System.out.println(integerList.stream()
                .filter(e -> Collections.frequency(integerList, e) == 1)
                .collect(Collectors.toList())
        );
```


### 7. Write a Stream pipeline to find the duplicate elements from a list of elements that contains duplicate elements also.
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


### 8. Write a Stream pipeline to sort a list of elements in ASCENDING ORDER.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
List<Integer> sortedAscending = integerList.stream()
                                  .sorted()
                                  .collect(Collectors.toList());
System.out.println(sortedAscending);
```


### 9. Write a Stream pipeline to sort a list of elements in DESCENDING ORDER.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
List<Integer> sortedDescending = integerList.stream()
                                  .sorted(Collections.reverseOrder())
                                  .collect(Collectors.toList());
System.out.println(sortedDescending);
```


### 10. Create a Stream pipeline to retrieve the first n elements from a list of elements.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
List<Integer> limitList = integerList.stream()
                            .limit(5)
                            .collect(Collectors.toList());
System.out.println(limitList);
```


### 11. Make a Stream pipeline to retrieve all the elements after n from a list of elements.
(Create a Stream pipeline to retrieve all the elements after n number of elements from a list of elements.)
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
List<Integer> skipList = integerList.stream()
                          .skip(5)
                          .collect(Collectors.toList());
System.out.println(skipList);
```


### 12. Create a Stream pipeline that adds the first n elements from a list of elements.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
int limitSum = integerList.stream()
                .limit(5)
                .reduce((a, b) -> (a + b))
                .get();
System.out.println(limitSum);
```


### 13. Create a Stream pipeline to SUM all elements after the (n)th element from a list of elements.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
int skipSum = integerList.stream()
                .skip(5)
                .reduce((a, b) -> (a + b))
                .get();
System.out.println(skipSum);
```


### 14. Create a Stream pipeline to choose the first n elements from a list of elements. Then, after n elements, retrieve all of them from the list.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
List<Integer> subList = integerList.stream()
                        .limit(10)
                        .skip(5)
                        .collect(Collectors.toList());
System.out.println(subList);
```


### 15. Build a Stream pipeline to select the LAST n elements from a list of elements. 
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
List<Integer> subList = integerList.stream()
                      .skip(integerList.size() - 5)
                      .collect(Collectors.toList());
System.out.println(subList);
```


### 16. Write a Stream pipeline to find the HIGHEST number from the list of elements.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
int highest = integerList.stream()
              .sorted(Collections.reverseOrder())
              .distinct()
              .limit(1)
              .findFirst()
              .get();
System.out.println("Highest number :: " + highest);
```


### 17. Write a Stream pipeline to find the SECOND HIGHEST number from the list of elements.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
int highest = integerList.stream()
              .sorted(Collections.reverseOrder())
              .distinct()
              .limit(2)
              .skip(1)
              .findFirst()
              .get();
System.out.println("Second highest number :: " + highest);
```


### 18. Write a Stream pipeline to find the LOWEST number from the list of elements.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
int lowest = integerList.stream()
              .sorted()
              .distinct()
              .limit(1)
              .findFirst()
              .get();
System.out.println("Smallest number :: " + lowest);
```


### 19. Write a Stream pipeline to find the SECOND LOWEST number from the list of elements.
```java
List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
int lowest = integerList.stream()
              .sorted()
              .distinct()
              .limit(2)
              .skip(1)
              .findFirst()
              .get();
System.out.println("Second smallest number :: " + lowest);
```


### 20. Create a Stream pipeline to count the number of elements in a list that meet a specific condition.
```java
List<Integer> integers = List.of(34, 89, 2, 90, 59, 10, 58, 48, 72, 51, 65);
long _count = integers.stream()
                .filter(e -> e % 2 == 0)
                .count();
System.out.println("Condition met count :: " + _count);
```


### 21. Given a list of objects with a getPrice() method, write a Stream pipeline to collect the average of all elements in a list.
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


### 22. Create a Stream pipeline to collect the names of objects from a list using the getName() method.
```java
public class StreamExample {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Kai Le", "Controls Engineer"),
                new Person("Robert Patel", "Analyst"),
                new Person("Cameron Lo", "Network Administrator"));
        List<String> personNames = persons.stream()
                .map(Person::name) // .map(m -> m.name())
                .toList();
        System.out.println(personNames);
    }
}

record Person(String name, String jobTitle) {
}
```


### 23. Create a Stream pipeline from a list of strings to find the first string that begins with a specific character.
```java
List<String> strings = List.of("Bear", "Bee", "Cat", "Horse", "Dear", "Fox", "Donkey", "Elephant", "Duck",
                "Parrot");
List<String> _result = strings.stream()
                      .filter(s -> s.startsWith("D"))
                      .toList();
System.out.println(_result);
```


### 24. Write a Stream pipeline to group a list of objects by a specific property.
```java
public class Questions_01 {
    public static void main(String[] args) {
        List<Person> employees = List.of(
                new Person("Kai Le", "Controls Engineer"),
                new Person("Robert Patel", "Analyst"),
                new Person("Cameron Lo", "Network Administrator"),
                new Person("Harper Castillo", "IT Systems Architect"),
                new Person("Harper Dominguez", "Manager"),
                new Person("Miles Chang", "Analyst"));

        Map<String, List<Person>> _resultGroupBy = employees.stream()
                .collect(Collectors.groupingBy(Person::jobTitle));

        _resultGroupBy.forEach((k, v) -> {
            System.out.println("Job title: " + k + " -> " + v.stream().map(Person::name).toList());
        });
    }
}

record Person(String name, String jobTitle) {
}
```

## Happy coding :slightly_smiling_face:
