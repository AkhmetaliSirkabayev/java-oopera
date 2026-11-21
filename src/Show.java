import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

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
        boolean isFind = false;
        for (Actor actor : listOfActors) {
            if (actor.getName().equals(name)
                    && actor.getSurname().equals(surname)
                    && actor.getHeight() == height) {
                isFind = true;
            }
        }
        if (isFind) {
            System.out.println("Такой актер уже существует!");
        } else {
            listOfActors.add(newActor);
        }
    }

    public void changeActor(Actor changeActor, String surname){
        for (int i = 0; i < listOfActors.size(); i++) {
            if(listOfActors.get(i).getSurname().equals(surname)){
                listOfActors.set(i, changeActor);
                return;
            }
        }
        System.out.println("Актёр с такой фамилией отсутствует!");
    }
}