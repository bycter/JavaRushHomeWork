package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution {

    public static HashSet<String> createSet() {

        Set<String> stringSet = new HashSet<>();

        stringSet.add("лХеЮБъкуиГР");
        stringSet.add("лш5ЕбНГЦ5ИР");
        stringSet.add("льх6фэН03бд");
        stringSet.add("лЦрОцЧНЪВцб");
        stringSet.add("лАзЬЦрёЦРШн");

        stringSet.add("лУГюлА2ЮпЙЯ");
        stringSet.add("л5уямкд6Ъеу");
        stringSet.add("лЙтжщх7ЦЯЧ1");
        stringSet.add("лЦМйВНЮшоШП");
        stringSet.add("лВ08ЖНЁъбУ8");

        stringSet.add("лфбд4НЖЙфКщ");
        stringSet.add("леДЧЫхмПмрЫ");
        stringSet.add("лЬюЮм5Ци4еС");
        stringSet.add("лНИ0Щтп2ц7Ф");
        stringSet.add("л0вТуЕЙк456");

        stringSet.add("лКБАПУуЩшМН");
        stringSet.add("лъзЯМдирг1к");
        stringSet.add("лФЮАэИСиКъы");
        stringSet.add("лэёа5зежЫАЫ");
        stringSet.add("лУйЫнйсГЕЗи");

        return (HashSet<String>) stringSet;
    }
}
