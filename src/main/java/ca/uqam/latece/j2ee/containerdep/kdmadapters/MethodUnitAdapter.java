package ca.uqam.latece.j2ee.containerdep.kdmadapters;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.action.EntryFlow;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Datatype;
import org.eclipse.gmt.modisco.omg.kdm.code.ExportKind;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodKind;
import org.eclipse.gmt.modisco.omg.kdm.code.Signature;
import org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.ParameterKind;
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
 * Adapter for the MethodUnit KDM concept. 
 *  
 * @author Anis Boubaker
 *
 */
public class MethodUnitAdapter extends KDMGenericAdapter<MethodUnit> implements MethodUnit {

	protected MethodUnitAdapter(MethodUnit adaptee) {
		super(adaptee);
	}

	public boolean isNamedLike(String pattern){
		Pattern r = Pattern.compile("(create)(.*)");
		Matcher m = r.matcher(this.getName());
		return m.find();
		
	}
	
	public String getNameComponentNum(String pattern, int componentNum){
		Pattern r = Pattern.compile("(create)(.*)");
		Matcher m = r.matcher("create");
		
		if(m.find())
			return m.group(componentNum);
		else 
			return null;
	}
	
	public Signature getSignature(){
		for(AbstractCodeElement ce : this.getCodeElement()){
			if(ce instanceof Signature) return (Signature)ce;
		}
		return null;
	}
	
	public List<ParameterUnit> getSignatureParameters(){
		List<ParameterUnit> params=new ArrayList<>();
		Signature s = this.getSignature();
		for(ParameterUnit p : s.getParameterUnit()){
			if(p.getKind()==ParameterKind.BY_REFERENCE || p.getKind()==ParameterKind.UNKNOWN)
				params.add(p);
		}
		return params;
	}
	
	public boolean hasParameters(List<ParameterUnit> params){
		List<ParameterUnit> myParameters = this.getSignatureParameters();
		int counter = 0;
		for( ; counter<myParameters.size() && counter<params.size(); counter++){
			if(  ! isSameParameterType( myParameters.get(counter).getType(), params.get(counter).getType() )   ){
				return false; 
			}
		}
		if(counter<myParameters.size()) return false;
		return true;
	}
	
	public boolean isSameParameterType(Datatype param1, Datatype param2){
		return param1==param2;
	}
	
	/*
	 * Below: methods overridden from the adaptee class. 
	 * All calls are redirected to the adaptee.
	 */
	
	@Override
	public Datatype getType() {
		return adaptee.getType();
	}

	@Override
	public void setType(Datatype value) {
		adaptee.setType(value);
	}

	@Override
	public EList<AbstractCodeElement> getCodeElement() {
		return adaptee.getCodeElement();
	}

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
	public MethodKind getKind() {
		return adaptee.getKind();
	}

	@Override
	public void setKind(MethodKind value) {
		adaptee.setKind(value);
	}

	@Override
	public ExportKind getExport() {
		return adaptee.getExport();
	}

	@Override
	public void setExport(ExportKind value) {
		adaptee.setExport(value);
	}

}
