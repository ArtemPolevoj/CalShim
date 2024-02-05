import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ModText {
    public static final Map<Double, Integer> mapResult = new TreeMap<>();

    public static String getText(String inputShimValue){
        mapResult.clear();
        List<Double> list = ModList.getList();
        Collections.sort(list);
        StringBuilder outText = new StringBuilder();
        double sizeShimPak = 0;
        double max = 0;
        double dobInputShimValue = Number.getDouble(inputShimValue);
        for (Double i : list) {
            max = Math.nextDown(max) + Math.nextDown(i);
        }
        if (list.isEmpty()){
            return "Проверь введённые значения.";
        }
        if (dobInputShimValue <= 0){
            return  "Проверь искомое значение.";
        }
        if (dobInputShimValue > max){
            outText = new StringBuilder("Не хватает шимов");
        } else if (dobInputShimValue == max
                || (dobInputShimValue - list.get(0)/2) == max) {
            outText = new StringBuilder("Возьмите весь пакет целиком.\n" +
                    "Размер пакета шимов - " + max);
        } else if ((dobInputShimValue - list.get(0)/2) <= 0) {
            outText = new StringBuilder("Не используйте шимы.");
        } else {
            calShim(list, dobInputShimValue);
            for (Double k: mapResult.keySet()) {
                sizeShimPak = sizeShimPak + k * mapResult.get(k);
                outText.append("Шим ").append(k).append(" мм. - ")
                        .append(mapResult.get(k)).append(" шт.\n");
            }
            outText.append(String.format("Размер пакета шимов - %.2f мм.", sizeShimPak));

        }


        return outText.toString();

    }

    private static void calShim(List<Double> array, double value) {

        Collections.sort(array);
        double sum = 0;

        int count = 1;
        for (int i = array.size() - 1; i > 0; i--) {
            if (Math.nextDown(sum + array.get(i)) <= value) {
                sum = Math.nextDown(sum + array.get(i));
                if (mapResult.containsKey(array.get(i))) count++;
                else count = 1;
                mapResult.put(array.get(i), count);
            }
        }
        if ((value - sum) >= (array.get(0) / 2)) {
            if (mapResult.containsKey(array.get(0))) mapResult.put(array.get(0),
                    mapResult.get(array.get(0)) + 1);
            else  mapResult.put(array.get(0), 1);
        }
    }

}
