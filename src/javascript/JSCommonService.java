package javascript;

public class JSCommonService {

	public boolean doZoneLookUp(ScreeningInstanceVO screening) {
		if (screening.getResult()) {
			return true;
		}
		return false;
	}
}
