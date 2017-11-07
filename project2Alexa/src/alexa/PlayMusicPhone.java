package alexa;

public class PlayMusicPhone implements Command {
	private Phone phone;
	
	public PlayMusicPhone(Phone phone) {
		this.phone = phone;
	}
	
	@Override
	public void execute() {
		phone.playMusic();
	}

}
