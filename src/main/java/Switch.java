public class Switch { //название и обозначение доступа класса
    int estimation = 1;// приравнивание переменной и обозначение ее формата
    static String reward; // приравнивание переменной и обозначение ее формата


    public static void SwitchS(int estimation) {

        switch (estimation) { // открытие switch case (выбор определенного варианта)
            case 5: // обозначаем чему равен кейс (5)
                reward = "bicycle";// обозначаем чему будет награда при это значении кейса
                break; // говорим прекратить если использовался этот вариант
            case 4:
                reward = "GoPro4";
                break;
            case 3:
                reward = "there will be no reward";
                break;
            case 2:
                reward = "bad mood";
                break;
            case 1:
                reward = "it's better not to ask";
                break;
            default:
                reward = "there is no such assessment";
                break;
    }
}
}