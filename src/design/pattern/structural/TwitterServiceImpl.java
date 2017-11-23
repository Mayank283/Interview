/**
 * 
 */
package design.pattern.structural;

/**
 * @author mayank
 *
 */
public class TwitterServiceImpl implements TwitterService {

	@Override
	public String getPost() {
		return "Yo! man post received";
	}

	@Override
	public void addPost(String post) {
		System.out.println(post);
	}

}
