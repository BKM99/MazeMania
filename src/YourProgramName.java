import controller.Controller;
import controller.Message;
import view.View;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class YourProgramName {
    private static BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
    private static View view;

    public static void main(String[] args) throws Exception {
        view = View.init(queue);
        Controller controller = new Controller(view, queue);

        controller.mainLoop();
        view.dispose();
        queue.clear();
    }
}

