package optional;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> op1 = Optional.empty();
        Optional<Integer> op2 = Optional.of(1);
        Optional<Integer> op3 = Optional.ofNullable(2);


        if (op3.isPresent()) {
            // kiểm tra giá trị khác null
            // lấy ra giá trị
            System.out.println(op3);
        }

        // lấy trực tiếp giá trị nếu nó tồn tại hoặc 1 giá trị chỉ định
        Integer value = op3.orElse(0);

        // lấy trực tiếp giá trị hoặc nếm ra ngoại lệ
        Integer val = op3.orElseThrow(() -> new RuntimeException());

        // ví dụ :
        List<Integer> randomList = Stream.generate(() -> new Random().nextInt(400) - 200).limit(200).toList();


    }
}
