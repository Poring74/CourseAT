public class Switch { //название и обозначение доступа класса
    int z = 1;// приравнивание переменной и обозначение ее формата
    static String conclusion; // приравнивание переменной и обозначение ее формата




    public static void Switch1(int z) {

        switch (z) { // открытие switch case (выбор определенного варианта)
            case 5: // обозначаем чему равен кейс (5)
                conclusion = "bicycle";// обозначаем чему будет награда при это значении кейса
                break; // говорим прекратить если использовался этот вариант
            case 4:
                conclusion = "GoPro4";
                break;
            case 3:
                conclusion = "there will be no reward";
                break;
            case 2:
                conclusion = "bad mood";
                break;
            case 1:
                conclusion = "it's better not to ask";
                break;
            default:
                conclusion = "there is no such assessment";
                break;
            }
         }

    public static void  Switch2 (int z ){

        switch (z)     {
            case 1:
                conclusion = "January";
            break;

            case 2:
                conclusion = "Это февраль";
            break;
            case 3:
                conclusion="Это март";
                break;
            case 4:
                conclusion="Это апрель";
                break;
            case 5:
                conclusion= "Это май";
                break;
            case 6:
                conclusion= "Это июнь";
                break;
            case 7:
                conclusion= "Это июль";
                break;
            case 8:
                conclusion= "Это август";
                break;
            case 9:
                conclusion= "Это сентябрь";
                break;
            case 10:
                conclusion= "Это октябрь";
                break;
            case 11:
                conclusion= "Это ноябрь";
                break;
            case 12:
                conclusion= "Это декабрь";
                break;
            default:
                conclusion="нет такого месяца";
                break;
        }

    }
}

