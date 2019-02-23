package language.java.script.engine.javascript;

public class JSCommonService {

	public boolean doZoneLookUp(ScreeningInstanceVO screening) {
		if (screening.getResult()) {
			return true;
		}
		return false;
	}
}
