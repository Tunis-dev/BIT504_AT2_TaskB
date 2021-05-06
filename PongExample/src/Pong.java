import javax.swing.JFrame;

public class Pong extends JFrame {
	
	private final static String WINDOW_TITLE = "PongGame";
	private final static int WINDOW_WIDTH = 900;
	private final static int WINDOW_HEIGHT = 500;
	
	public Pong() {
        setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new PongPanel());
        setVisible(true);
	}
	
	public static int getWindowWidth() {
		return WINDOW_WIDTH;
	}
	
	public static int getWindowHeight() {
		return WINDOW_HEIGHT;
	}

	public static void main(String[] args) {
		new Pong();
	}

}