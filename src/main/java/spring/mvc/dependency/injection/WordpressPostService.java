package spring.mvc.dependency.injection;

public class WordpressPostService implements PostService {

	@Override
	public boolean publishPost(String content) {
		System.out.println("WordpressPostService: " + content);
		return true;
	}

}
