import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("日本", "東京");
        countries.put("アメリカ", "ワシントンD.C.");
        countries.put("デンマーク王国", "コペンハーゲン");
        countries.put("オーストラリア連邦", "キャンベラ");

        System.out.println("国とその首都:");

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        String capital = getCapital(countries, "インド");
        if ("指定された国は存在しません".equals(capital)) {
            System.out.println('\n' + capital);
        } else {
            System.out.println("インド:" + capital);
        }
    }   

 private static String getCapital(Map<String, String> map, String country) {
        // キーが存在する場合は対応する首都を返す
        // 存在しない場合はデフォルト値を返す
        return map.getOrDefault(country, "指定された国は存在しません");
    }
}
