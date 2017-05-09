package javascript;

import javax.script.Bindings;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestJavaScript {

	final static String script = "function execute(screeningInstanceVO,jsCommonService){"
			+ "if(jsCommonService.doZoneLookUp(screeningInstanceVO)){"
			+ "return 'YES';"
			+ "} "
			+ "else return 'NO'"
			+ "}"
			+ "execute(screeningInstanceVO,jsCommonService);";
	
	public static void main(String[] args) throws ScriptException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		
		final Bindings bindings = engine.createBindings();
		bindings.put("screeningInstanceVO", new ScreeningInstanceVO());
		bindings.put("jsCommonService", new JSCommonService());
	
		Compilable cengine = (Compilable)engine;
		CompiledScript cscript = cengine.compile(script);
		Object obj = cscript.eval(bindings);
		
		engine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
		/*Object obj = engine.eval(script, bindings);*/
		
		System.out.println(obj);
	}
}
