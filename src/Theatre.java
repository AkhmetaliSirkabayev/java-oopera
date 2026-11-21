public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Петрова", Gender.FEMALE, 168);
        Actor actor3 = new Actor("Пётр", "Сидоров", Gender.MALE, 175);

        Director director1 = new Director("Олег", "Орлов", Gender.MALE, 12);
        Director director2 = new Director("Мария", "Волкова", Gender.FEMALE, 7);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        Show show = new Show("Ревизор", 150, director1);
        Opera opera = new Opera("Евгений Онегин", 180, director2, musicAuthor,
                "Либретто: история Татьяны и Онегина", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 140, director1, musicAuthor,
                "Либретто: история принца Зигфрида и Одетты", choreographer);

        show.addNewActor("Иван", "Иванов", Gender.MALE, 180);
        show.addNewActor("Анна", "Петрова", Gender.FEMALE, 168);

        opera.addNewActor("Анна", "Петрова", Gender.FEMALE, 168);
        opera.addNewActor("Пётр", "Сидоров", Gender.MALE, 175);

        ballet.addNewActor("Иван", "Иванов", Gender.MALE, 180);
        ballet.addNewActor("Пётр", "Сидоров", Gender.MALE, 175);

        System.out.println("Ревизор: ");
        show.printAllActors();
        System.out.println("Евгений Онегин: ");
        opera.printAllActors();
        System.out.println("Лебединое озеро: ");
        ballet.printAllActors();

        show.changeActor(actor3, "Петрова");
        show.printAllActors();

        opera.changeActor(actor1, "ЛевТолстой");

        System.out.println();
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}