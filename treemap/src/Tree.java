import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        String str = "Hom nay Troi dep oi la dep, Nen Toi di choi";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i);
            if (num > 64 && num < 91) {
                num += 32;
            }
            if (num > 96 && num < 122 || num == 32) {
                newStr += (char) num;
            }
        }
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String[] stringStr = newStr.split("\\s");
        for (int i = 0; i < stringStr.length; i++) {
            if (treeMap.get(stringStr[i]) == null) {
                treeMap.put(stringStr[i], 1);
            } else {
                treeMap.replace(stringStr[i], treeMap.get(stringStr[i]), treeMap.get(stringStr[i]) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

    }
}
