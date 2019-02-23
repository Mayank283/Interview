package language.java.multithreading;

/**
 * @author mayank
 * 
 *         Starvation is a situation where a low priority threads keeps on
 *         waiting for acquiring lock almost to eternity as other threads take
 *         their turn acquiring lock. This can also happen if thread which has
 *         acquired thread takes a very long time to process.
 * 
 *         To prevent this fairness is implemented(first come first serve). Also
 *         we should use Lock class instead of synchronized block or method
 */
public class Starvation {

}
