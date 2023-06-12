public class Number {
    static int getInt(String str){
        int val = -1;
        if (str.isEmpty()) return 0;
        if (str.equals("0")) return val;
        else {
            try {
                val = Integer.parseInt(str);
                return val;
            } catch (NumberFormatException n){
                return val;
            }
        }
    }
    static double getDouble(String str){
        double val = -1;
        if (str.isEmpty()) return 0;
        if (str.equals("0")) return val;
        else {
            try {
                val = Double.parseDouble(str.replace(",", "."));
                return  val;
            } catch (NumberFormatException n){
                return  val;
            }
        }
    }
}
