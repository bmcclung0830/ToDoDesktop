package sample;

/**
 * Created by Brittany on 4/12/16.
 */
public class ToDoItem {
    String text;
    Boolean isDone;

    public ToDoItem(String text){
        this.text = text;
        this.isDone = false;
    }

    @Override
    public String toString() {
        return text + (isDone ? " Done " : " Not done ");
    }
}
