package design.pattern.structural;

public class BufferedInputStream extends InputStreamDecorator {

	public BufferedInputStream(Stream stream) {
		super(stream);
	}

	@Override
	public String create() {
		return stream.create() + addBuffer();
	}
	
	public String addBuffer() {
		
		return " BufferAdded";
	}

}
