import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

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

        try {
            String capital = getCapital(countries,"インド");
            System.out.println("インド:" + capital);
        } catch (NoSuchElementException e) {
            System.out.print('\n');
            System.out.println("※指定された国は存在しません");
        }
    }

    private static String getCapital(Map<String,String> map,String country) {
        // 存在する場合は対応する首都を返し、存在しない場合はNoSuchElementExceptionをスロー
        if (map.containsKey(country)) {
            return map.get(country);
        } else {
            throw new NoSuchElementException();
        }
    }
}