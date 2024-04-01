package ar.edu.info.unlp.ejercicio_5;

public class VideoStreamAdapter extends Media {

	private VideoStream videoStream;
	
	public VideoStreamAdapter() {
		super();
	}

	@Override
	public void play() {
		this.videoStream.reproduce();
	}

}
