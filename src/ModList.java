import java.util.ArrayList;
import java.util.List;

public class ModList {
    private static final List<Double> list = new ArrayList<>();


    public static void setLisl(String sizeShim1, String countShim1,
                               String sizeShim2, String countShim2,
                               String sizeShim3, String countShim3,
                               String sizeShim4, String countShim4,
                               String sizeShim5, String countShim5) {
        list.clear();
        int intCountShim1 = Number.getInt(countShim1);
        int intCountShim2 = Number.getInt(countShim2);
        int intCountShim3 = Number.getInt(countShim3);
        int intCountShim4 = Number.getInt(countShim4);
        int intCountShim5 = Number.getInt(countShim5);
        double dobSizeShim1 = Number.getDouble(sizeShim1);
        double dobSizeShim2 = Number.getDouble(sizeShim2);
        double dobSizeShim3 = Number.getDouble(sizeShim3);
        double dobSizeShim4 = Number.getDouble(sizeShim4);
        double dobSizeShim5 = Number.getDouble(sizeShim5);
        if (dobSizeShim1 >= 0 && intCountShim1 >= 0 &&
                dobSizeShim2 >= 0 && intCountShim2 >= 0 &&
                dobSizeShim3 >= 0 && intCountShim3 >= 0 &&
                dobSizeShim4 >= 0 && intCountShim4 >= 0 &&
                dobSizeShim5 >= 0 && intCountShim5 >= 0) {
            addList(dobSizeShim1, intCountShim1);
            addList(dobSizeShim2, intCountShim2);
            addList(dobSizeShim3, intCountShim3);
            addList(dobSizeShim4, intCountShim4);
            addList(dobSizeShim5, intCountShim5);
        }
    }

    private static void addList(double value, int count) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                list.add(value);
            }
        }
    }


    public static List<Double> getList() {
        return list;
    }
}
