package spring.mvc.dependency.injection;

public class PostManager {
	private PostService postService;
	private boolean enabled;
	
	//constructor injection
	public PostManager(PostService postService, boolean enabled) {
		super();
		this.postService = postService;
		this.enabled = enabled;
		System.out.println("constructor with arguments injection");
	}

	
	
	public PostManager() {
		super();
		System.out.println("constructor with no arguments injection");
	}



	public PostService getPostService() {
		return postService;
	}

	//setter injection will be used (pas d'instanciation => loosely coupled system)
	public void setPostService(PostService postService) {
		this.postService = postService;
		System.out.println("postService setter injection");
	}

	
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
		System.out.println("enabled setter injection");
	}



	public boolean isServiceAvailable() {
		return enabled;
	}

	public boolean publishPost(String content) {
		if(enabled)
			return postService.publishPost(content);
		else
			return false;
	}
	
	

}
