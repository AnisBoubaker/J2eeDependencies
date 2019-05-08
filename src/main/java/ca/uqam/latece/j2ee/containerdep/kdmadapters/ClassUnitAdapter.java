package ca.uqam.latece.j2ee.containerdep.kdmadapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.action.EntryFlow;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeItem;
import org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Extends;
import org.eclipse.gmt.modisco.omg.kdm.code.Implements;
import org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit;
import org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Annotation;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Attribute;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtendedValue;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;

/**
 * Adapter for the ClassUnit KDM concept. 
 *  
 * @author Anis Boubaker
 *
 */
public class ClassUnitAdapter extends KDMGenericAdapter<ClassUnit> implements ClassUnit {

	protected ClassUnitAdapter(ClassUnit adaptee) {
		super(adaptee);
	}
	
	public String getFQN(){
		return this.getFullPackageName()+this.getName();
	}
	
	public List<String> getExtendedOrImplementedUnits(){
		List<String> result = new ArrayList<>();
		List<CodeItem> foundUnits = new ArrayList<CodeItem>();
		List<AbstractCodeRelationship> codeRelationships = this.getCodeRelation();
		for(AbstractCodeRelationship rel : codeRelationships){
			if(rel instanceof Extends || rel instanceof Implements){
				foundUnits.add((CodeItem)rel.getTo());
			}
		}
		for(CodeItem unit : foundUnits){
			if(unit instanceof ClassUnit){
				result.add(  KDMAdapterFactory.getInstance().adapt((ClassUnit)unit).getFQN()   );
			}
			if(unit instanceof InterfaceUnit){
				result.add(  KDMAdapterFactory.getInstance().adapt((InterfaceUnit)unit).getFQN()   );
			}
		}
		return result;
	}
	
	public MethodUnitAdapter getMethodByNameAndParameters(String name, List<ParameterUnit> params){
		//System.out.println("LOOKING FOR: "+printParameters(params));
		
		for(CodeItem ci : this.getCodeElement()){
			if(ci instanceof MethodUnit){
				MethodUnitAdapter mu =  KDMAdapterFactory.getInstance().adapt( (MethodUnit)ci );
				//System.out.println("    Considering: "+mu.getName()+printParameters(mu.getSignatureParameters()));
				if(mu.getName().equals(name) && mu.hasParameters(params)) {
					return mu;
				}
			}
		}
		return null;
	}
	
	private String printParameters(List<ParameterUnit> params){
		String result = "(";
		for(ParameterUnit p : params){
			result+=p.getType().getName()+",";
		}
		result+=")";
		return result;
	}

	/*
	 * Below: methods overridden from the adaptee class. 
	 * All calls are redirected to the adaptee.
	 */
	
	@Override
	public EList<SourceRef> getSource() {
		return adaptee.getSource();
	}

	@Override
	public EList<CommentUnit> getComment() {
		return adaptee.getComment();
	}

	@Override
	public EList<AbstractCodeRelationship> getCodeRelation() {
		return adaptee.getCodeRelation();
	}

	@Override
	public EList<EntryFlow> getEntryFlow() {
		return adaptee.getEntryFlow();
	}

	@Override
	public String getName() {
		return adaptee.getName();
	}

	@Override
	public void setName(String value) {
		adaptee.setName(value);
	}

	@Override
	public AggregatedRelationship createAggregation(KDMEntity otherEntity) {
		return adaptee.createAggregation(otherEntity);
	}

	@Override
	public void deleteAggregation(AggregatedRelationship aggregation) {
		adaptee.deleteAggregation(aggregation);
	}

	@Override
	public EList<KDMRelationship> getInbound() {
		return adaptee.getInbound();
	}

	@Override
	public EList<KDMRelationship> getOutbound() {
		return adaptee.getOutbound();
	}

	@Override
	public EList<KDMRelationship> getOwnedRelation() {
		return adaptee.getOwnedRelation();
	}

	@Override
	public EList<AggregatedRelationship> getInAggregated() {
		return adaptee.getInAggregated();
	}

	@Override
	public EList<AggregatedRelationship> getOutAggregated() {
		return adaptee.getOutAggregated();
	}

	@Override
	public KDMEntity getOwner() {
		return adaptee.getOwner();
	}

	@Override
	public EList<KDMEntity> getOwnedElement() {
		return adaptee.getOwnedElement();
	}

	@Override
	public EList<KDMEntity> getGroup() {
		return adaptee.getGroup();
	}

	@Override
	public EList<KDMEntity> getGroupedElement() {
		return adaptee.getGroupedElement();
	}

	@Override
	public KDMModel getModel() {
		return adaptee.getModel();
	}

	@Override
	public EList<Stereotype> getStereotype() {
		return adaptee.getStereotype();
	}

	@Override
	public EList<ExtendedValue> getTaggedValue() {
		return adaptee.getTaggedValue();
	}

	@Override
	public EList<Attribute> getAttribute() {
		return adaptee.getAttribute();
	}

	@Override
	public EList<Annotation> getAnnotation() {
		return adaptee.getAnnotation();
	}

	@Override
	public Boolean getIsAbstract() {
		return adaptee.getIsAbstract();
	}

	@Override
	public void setIsAbstract(Boolean value) {
		adaptee.setIsAbstract(value);
	}

	@Override
	public EList<CodeItem> getCodeElement() {
		return adaptee.getCodeElement();
	}

}
