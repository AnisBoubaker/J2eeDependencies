package ca.uqam.latece.j2ee.containerdep.kdmadapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.action.EntryFlow;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeItem;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship;
import org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Extends;
import org.eclipse.gmt.modisco.omg.kdm.code.Implements;
import org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit;
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
 * Adapter for the InterfaceUnit KDM concept. 
 *  
 * @author Anis Boubaker
 *
 */
public class InterfaceUnitAdapter extends KDMGenericAdapter<InterfaceUnit> implements InterfaceUnit {

	protected InterfaceUnitAdapter(InterfaceUnit adaptee) {
		super(adaptee);
	}
	
	public String getFQN(){
		return this.getFullPackageName()+this.getName();
	}
	
	public boolean isExtends(String interfaceFQN){
		for(String extended: getExtendedOrImplementedUnits()){
			if(extended.equalsIgnoreCase(interfaceFQN)) return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param stereotypeName
	 * @return
	 */
	public ClassUnitAdapter getRelatedCodeUnitByStereotype(String stereotypeName){
		//TODO: This should not return a ClassUnitAdapter but a KDMEntity
		//See how to make it work with the Adapters....
		for(AbstractCodeRelationship rel : this.getCodeRelation()){
			if(rel instanceof CodeRelationship && Util.hasStereotypeNamed(rel.getStereotype(), stereotypeName)){
				CodeRelationship codeRel = (CodeRelationship)rel;
				ClassUnit relatedTo = (ClassUnit)(codeRel.getTo());
				return KDMAdapterFactory.getInstance().adapt(relatedTo);
			}
		}
		return null;
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
	public EList<CodeItem> getCodeElement() {
		return adaptee.getCodeElement();
	}

}
