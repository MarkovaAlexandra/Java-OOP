package Lec05;

public class Button {
    View view;
    Sum sum;

    public Button(View view, Sum sum) {
        this.view = view;
        this.sum = sum;
    }


    public int buttonclick(){
        return sum.sum(view.setX(),view.setY());
    }
}
