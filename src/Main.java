import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел так, чтобы их сумма составлялаtarget .
//Вы можете предположить, что каждый вход будет иметь ровно одно решение , и вы не можете использовать один и тот же элемент дважды.
// Ввод: nums = [2,7,11,15], target = 9
// Выход: [0,1]
// Объяснение: поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
public class Main {
  public static void main(String[] args) {
    int[] inputArray = new int[]{2, 7, 11, 15};
    System.out.println(summa(inputArray));
  }
  // метод возращающий индексы двух чисел, сумма которых = target
  public static ArrayList<Character> summa(int[] inputArray) {
    int target = 9;
    ArrayList<Character> indexArray = new ArrayList<>();
    for (int i = 0; i < inputArray.length; i++) {
      for (int j = i+1; j < inputArray.length; j++) {
        if (i != j && inputArray[i] + inputArray[j] == target) { // условие получения target
          System.out.printf("[%s, %s]", i, j); // для наглядности, получилось или нет
          indexArray.add(Character.forDigit(i, 10)); // записываем индексы
          indexArray.add(Character.forDigit(j, 10)); // записываем индексы
        }
      }

    }
    return indexArray;
  }
}

