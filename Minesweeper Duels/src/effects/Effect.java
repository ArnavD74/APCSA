package effects;

public abstract class Effect {
	public boolean finished;
	public Effect() {
		
	}
	public abstract void update();
	public abstract void draw();
}
