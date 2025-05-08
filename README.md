# java-stream-api
## Java Stream API

### Write a Java Stream pipeline to filter EVEN and ODD numbers from a list and collect them into a new list.
```
List<Integer> integerList = Arrays.asList(2, 4, 9, 53, 69, 5, 6, 8, 7, 13, 26, 76, 48);
List<Integer> evenList = integerList.stream()
                .filter(e -> e % 2 == 0)
                .toList();
```

### Given a list of strings, write a Stream pipeline to transform them to uppercase and collect them into a set.
```
List<String> sList = Arrays.asList("aa","bb","cc","dd","ee","aa","cc");
Set<String> result = sList.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toSet());
```















