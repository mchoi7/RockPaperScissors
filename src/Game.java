import java.util.Stack;

public class Game {
    int wins;
    Michael michael = new Michael();
    Michael daniel = new Michael();
    Stack<Draw> mList = new Stack<>();
    Stack<Draw> dList = new Stack<>();

    public void play() {
        mList.push(michael.play(this));
        dList.push(daniel.play(this));

        Draw mDraw = mList.peek(), dDraw = dList.peek();
        if (mDraw != dDraw)
            wins = (mDraw == Draw.R && dDraw == Draw.S || mDraw == Draw.P && dDraw == Draw.S || mDraw == Draw.S && dDraw == Draw.P) ? 1 : -1;

    }
}
