package ca.uqam.latece.j2ee.containerdep.kdm;

public enum JEEStereotypes implements ExtensionStereotype {
	BEAN_CLASS("BeanClass"), 
	BEAN_LOCAL_INTERFACE("BeanLocalInterface"), 
	BEAN_REMOTE_INTERFACE("BeanRemoteInterface"), 
	BEAN_LOCAL_HOME("BeanLocalHome"), 
	BEAN_REMOTE_HOME("BeanRemoteHome");
	
	private String name ; 
	
	private JEEStereotypes(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name();
	}
}
