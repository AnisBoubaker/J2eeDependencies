package ca.uqam.latece.j2ee.containerdep.kdm;

import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;

public class JEEExtension extends KDMExtension {
	
	public static final String EXTENSION_NAME = "J2EE";
	
	public JEEExtension(CodeModel codeModel){	
		super(codeModel);
		this.setExtensionName(EXTENSION_NAME);
	}

	@Override
	protected void setStereotypes() {
		this.setStereotypes(JEEStereotypes.values());	
	}	
	
}
