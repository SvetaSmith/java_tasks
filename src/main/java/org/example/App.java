package org.example;


import org.apache.commons.lang3.StringUtils;

public class App
{
    public static void main(String[] args)
    {
        System.out.println(getNumberExplanation(7));
    }

/*    Реализуйте метод getHiddenCard(), который принимает на вход номер кредитки (всегда состоит из 16 цифр)
    в виде строки и возвращает его скрытую версию, которая может использоваться на сайте для отображения.
    Если исходная карта имела номер 2034399002125581, то скрытая версия выглядит так ****5581.
    Другими словами, функция заменяет первые 12 символов, на звездочки. Количество звездочек регулируется
    вторым необязательным параметром. Значение по умолчанию — 4.*/

    public static String getHiddenCard(String cardNum, int starsCount)
    {
        String hiddenCard = cardNum.substring(cardNum.length() - 4, cardNum.length());
        hiddenCard = "*".repeat(starsCount) + hiddenCard;
        return hiddenCard;
    }

    public static String getHiddenCard(String cardNum)
    {
        return getHiddenCard(cardNum, 4);
    }

    public static String truncate(String text, int length)
    {
        // BEGIN (write your solution here)
        String a = text.substring(0, length);
        a = a + "...";
        // END
        return a;
    }

    public static boolean isLeapYear(int str)
    {
        //он кратен (то есть делится без остатка) 400 или он одновременно кратен 4 и не кратен 100.
        return ((str % 400 == 0) || ((str % 4 == 0) && (str % 100 != 0)));
    }

    public static String convertString(String str)
    {
        //если первая буква не заглавная, возвращает перевернутый вариант исходной строки.
        // Если первая буква заглавная, то строка возвращается без изменений.
        // Если на вход передана пустая строка, метод должен вернуть пустую строку.
        String res = "";
        if (str.length() == 0) {
        } else if (Character.isUpperCase(str.charAt(0))) {
            res = str;
        } else if (!Character.isUpperCase(str.charAt(0))) {
            res = StringUtils.reverse(str);
        }

        return res;
    }

    /*    * 666 - devil number
     * 42 - answer for everything
     * 7 - prime number*/
    public static String getNumberExplanation(int num)
    {
        String res;
        switch (num) {
            case 666:
                res = "devil number";
                break;
            case 42:
                res = "answer for everything";
                break;
            case 7:
                res = "prime number";
                break;
            default:
                res = "just a number";

        }
        return res;
    }

    public static void printNumbers(int lastNumber)
    {
        // i — это сокращение от index (порядковый номер)
        // Используется по общему соглашению во множестве языков как счетчик цикла
        var i = 1;

        while (i <= lastNumber) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("finished!");
    }

/*App.printNumbers(3);
// => 1
// => 2
// => 3
// => finished!*/

}