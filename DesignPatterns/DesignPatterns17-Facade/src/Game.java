/*
*  Facade Class
*/

public class Game {
	private InputSystem input = new InputSystem();
	private GameObjects objects = new GameObjects();
	private GameConsole screen = new GameConsole();
	public void update(){
		input.getInput();
		objects.update(input);
		screen.draw(objects);
	}
}
