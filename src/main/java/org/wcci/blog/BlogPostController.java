package org.wcci.blog;



@Controller 
@RequestMapping("/Post")
public class BlogPostController {
	
	@Resource 
	BlogPostStorage Post; 
	
	@Resource 
	BlogPostStorage Blog; 
	

}
