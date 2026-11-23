import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printAllActors(){
        for(Actor actor: listOfActors) {
            System.out.println(actor);
        }
    }

    public void addNewActor(String name, String surname, Gender gender, int height) {
        Actor newActor = new Actor(name, surname, gender, height);
        if(listOfActors.contains(newActor)){
            System.out.println("Такой актер уже существует!");
        } else {
            listOfActors.add(newActor);
        }
    }

    public void changeActor(Actor changeActor, String surname){
        int counter = 0;
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if(listOfActors.get(i).surname.equals(surname)){
                counter ++;
                index = i;
            }
        }
        if (counter == 0){
            System.out.println("Актёр с такой фамилией отсутствует!");
        } else if (counter == 1){
            listOfActors.set(index, changeActor);
        } else if (counter > 1){
            System.out.println("Ошибка! Найдено несколько актёров с такой фамилией.");
        }
    }
}