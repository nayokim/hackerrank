public class RegexExample {

    class MyRegex
    {
        String a="(2([0-4]\\d|5[0-5])|1\\d{2}|(0?)\\d{2}|(0?){2}\\d)";
        String pattern=a+"[.]"+a+"[.]"+a+"[.]"+a;
    }
    //2[0-4]\d|5[0-5] matches 200 to 249 or 250 to 255.
// 1\d{2} matches 100 to 199.
// (0?)\d{2} matches 000 to 099 or 00 to 99
// (0?){2}\d matches 000 to 009 or 00 to 09 or 0 to 9.
//    Note that \d matches [0-9].
}
