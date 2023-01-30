import java.util.LinkedHashMap;
import java.util.Map;

// Задача
// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: String str =
// "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …

public class MainSql {
public static void main(String[] args) {
Map<String, String> map = new LinkedHashMap<>();
    map.put("name","Ivanov");
    map.put("country","Russia");
    map.put("city","Nigniy Novgorod");
    map.put("age",null);



    System.out.println(getMainSql(map));
}

public static String getMainSql(Map<String, String> param) {
    StringBuilder result = new StringBuilder();
    if (param == null || param.isEmpty())
        return result.toString();

for (Map.Entry<String, String> param_1 : param.entrySet()) {
    if (param_1.getKey() == null || param_1.getValue() == null)
        continue;

        result.append(param_1.getKey()).append(" = '").append(param_1.getValue()).append("' and ");
}

    if (result.length() > 5)
        result.delete(result.length() - 5, result.length());

    return result.toString();
    }
}
