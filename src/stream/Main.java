package stream;


import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


//        for (int i : list){
//            if (i == 2){
//                list.remove(i);
//            }
//        }
//
//        System.out.println(list);


//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            int element = iterator.next();
//
//            if (element == 2){
//                iterator.remove();
//            }
//        }
//
//        System.out.println(list);


        //Tạo Stream :Array và Collection
        int[] arr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr);


        Stream<Integer> streams = list.stream();

        // thao tác trung gian : sorted , limit , distinct, filter,map

        IntStream intStream1 =  intStream.filter(value -> value % 2 == 0);

        // thao tác đầu cuối : sum , foreach, reduce , count , findFirt, findAny, allMath


//       1. lọc v và in ra các số nguyên dương ra màn hình
        Random random = new Random();

        List<Integer> randomList = Stream.generate(() -> new Random().nextInt(400) - 200).limit(200).toList();


        randomList.stream().filter(value -> value > 0).forEach(value -> System.out.println(value + " "));
//       2. loại bỏ các số trùng lặp
        List<Integer> distinctList = randomList.stream().distinct().toList();

        System.out.println(distinctList);
//       3. sắp xếp các số theo thứ tự từ lớn đến bé
         randomList.stream().sorted(Comparator.reverseOrder()).toList().forEach(value -> System.out.print(value + " "));

//       4. tính min max

        Integer min = randomList.stream().min(Comparator.comparing(value ->value)).get();

        Integer max = randomList.stream().max(Comparator.comparing(value ->value)).get();


        System.out.println("\nMin : " + min + "\n" + "Max : " + max);

//       5. Tính tổng của tất cả các phần tử

        Integer sum = randomList.stream().reduce(0, Integer::sum);
//       6. kiểm tra n có tồn tại trong danh sách hay không
        boolean isExist = randomList.stream().anyMatch(number -> number == 100);


        System.out.println("Số 100 có tồn tại hay không :" + isExist);
//       7. chuyển các số âm thành đối số của nó

        List<Integer> mathInt = randomList.stream().map(value -> value < 0 ?-value : value).toList();

        System.out.println(mathInt);



    }
}










