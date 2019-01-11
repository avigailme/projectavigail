package domashka;

public class TestForHorses {
    public static void main(String[] args) {
        Horses horses = new Horses();/*у нас есть главарь классов это Лошади,
         У этого класса есть два наследника, арабХорс и Брамби,
         логика как это все работает, свойства и функции есть несколько свойств например
         свойства -  возраст, рост, вес, порода, вид спорта методы- бегать и кушать это все общее
        Далее идет Араб, в араб есть переопределение с помощью оверрайд, мы там поставили условие если дают в методе кушать
         морковку то метод кушать не выполняется, потом новый метод и свойство было добавлено, гарцевать метод, поле скорость
        лошади, в классе Араб еще переопределен метод бежать, если скорость больше или равно 5 то выполняется метод бежать
        Далее идет класс Брамби, там есть тоже кушать метод переопределен, если стринг Жир, то метод не выполняется,
        также был добавлен метод бороться, так как лощадь играет на Кок бору, и еще поле сила одного пинка лошади.
        */


        horses.setAge(2);
        horses.setHeight(152);
        horses.setWeight(600);
        horses.setPoroda("Random");
        horses.setTypeOfSport("Races or Kokboru or whatever");
        System.out.println(horses);

        ArabHorse arabHorse = new ArabHorse();
        arabHorse.setTypeOfFood("Morkovka");
        arabHorse.setAge(1);
        arabHorse.setHeight(168);
        arabHorse.setWeight(560);
        arabHorse.setPoroda("ArabskyiSkakun");
        arabHorse.setTypeOfSport("Professional Race");
        arabHorse.setSpeedOfHorse(120);
        arabHorse.eat();
        arabHorse.runs();
        arabHorse.titup();
        System.out.println(arabHorse);

        Brambi brambi=new Brambi();
        brambi.setTypeOfFood("Zhir");
        brambi.setAge(2);
        brambi.setHeight(158);
        brambi.setWeight(800);
        brambi.setPoroda("Brambi");
        brambi.setTypeOfSport("Kok boru");
        brambi.setStrengthOfOneKick(100);
        brambi.eat();
        brambi.runs();
        brambi.fights();
        System.out.println(brambi);
    }

}

