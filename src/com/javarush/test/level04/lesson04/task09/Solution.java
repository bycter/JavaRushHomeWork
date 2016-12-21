package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        while (true)
        {
            InputStream inputStream = System.in;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String bufferVar = reader.readLine();

            if (bufferVar.equals("exit"))
            {
                System.out.println("Program terminated.");
                return;
            }

            Double duration;
            try
            {
                duration = Double.parseDouble(bufferVar);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Не верные данные! Введите число.");
                continue;
            }

            if (duration < 0 || duration > 60)
            {
                System.out.println("Не верные данные! Вещественное число должно быть в диапазоне от 0 до 60.");
                continue;
            }

            Integer durationGreen = 3, durationYellow = 1, durationRed = 1;
            Double resDuration = (duration % (durationGreen + durationYellow + durationRed));

            if (resDuration < durationGreen)
            {
                System.out.println("зеленый");
            } else if (resDuration < (durationGreen + durationYellow))
            {
                System.out.println("желтый");
            } else if (resDuration < (durationGreen + durationYellow + durationRed))
            {
                System.out.println("красный");
            }
        }
    }
}