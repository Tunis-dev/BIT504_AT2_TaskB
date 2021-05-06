import java.awt.Color;

public class Paddle extends Sprite {
	private static final int PADDLE_WIDTH = 5;
	private static final int PADDLE_HEIGHT = 70;
	private static final Color PADDLE_COLOUR = Color.RED;
	public static final int DISTANCE_FROM_EDGE = 5;
	
	public Paddle(Player player, int panelWidth, int panelHeight) {
		setWidth(PADDLE_WIDTH);
		setHeight(PADDLE_HEIGHT);
		setColour(PADDLE_COLOUR);
		int xPos;
		if(player == Player.One) {
			xPos = DISTANCE_FROM_EDGE;
		} else {
			xPos = panelWidth - DISTANCE_FROM_EDGE - getWidth();
		}
		setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
		resetToInitialPosition();
	}

	public int getDistanceFromEdge() {
		return DISTANCE_FROM_EDGE;
	}
}
