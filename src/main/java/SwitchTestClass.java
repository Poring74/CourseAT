        public class SwitchTestClass {
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
            }// закрытие switch
         }// закрытие метода

    public static void  Switch2 (int z ){

        switch (z) {
            case 1 -> conclusion = "January";
            case 2 -> conclusion = "Это февраль";
            case 3 -> conclusion = "Это март";
            case 4 -> conclusion = "Это апрель";
            case 5 -> conclusion = "Это май";
            case 6 -> conclusion = "Это июнь";
            case 7 -> conclusion = "Это июль";
            case 8 -> conclusion = "Это август";
            case 9 -> conclusion = "Это сентябрь";
            case 10 -> conclusion = "Это октябрь";
            case 11 -> conclusion = "Это ноябрь";
            case 12 -> conclusion = "Это декабрь";
            default -> conclusion = "нет такого месяца";
        }
    }

   public static void Switch3 (int z) {
       switch (z) {
           case 1 -> System.out.println("Кофе американо готовится");// вместро приравнивания переменной можно сразу вставить что необходимо выводить
           case 2 -> System.out.println("Кофе капучино готовится");
           case 3 -> System.out.println("Кипяток сейчас будет");
           case 4 -> System.out.println("Какао уже в пути");
           case 5 -> System.out.println("Кофе молется");
           default -> System.out.println("error");
       }
   }
   public static void Switch4 (int z){
        switch (z) {
            case 10-> System.out.println("noup");
            case 17-> System.out.println("you to noup");
            case 18-> System.out.println("yap");
            case 20-> System.out.println("you to yap");
            case 30-> System.out.println("of course");
            default -> System.out.println("Hey admin");
        }
        }
   }


