package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {

        HashMap<String,String> map = new HashMap<>();

        map.put("Yoshchyk", "Denis");
        map.put("Dergachev", "Denis");
        map.put("Popkova", "Anna");
        map.put("Omelchenko", "Anna");
        map.put("Kirosirova", "Masha");

        map.put("Krekoten", "Nina");
        map.put("Koleda", "Kolya");
        map.put("Sakun", "Kate");
        map.put("Pilipchik", "Kate");
        map.put("Shikulin", "Dima");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        Iterator iterator = map.entrySet().iterator();

        for (iterator ) {

        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
