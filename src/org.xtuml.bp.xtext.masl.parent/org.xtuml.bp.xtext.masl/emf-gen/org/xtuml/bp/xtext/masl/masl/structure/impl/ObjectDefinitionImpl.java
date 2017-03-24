/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtuml.bp.xtext.masl.masl.structure.AttributeDefinition;
import org.xtuml.bp.xtext.masl.masl.structure.EventDefinition;
import org.xtuml.bp.xtext.masl.masl.structure.IdentifierDefinition;
import org.xtuml.bp.xtext.masl.masl.structure.ObjectDefinition;
import org.xtuml.bp.xtext.masl.masl.structure.ObjectServiceDeclaration;
import org.xtuml.bp.xtext.masl.masl.structure.Pragma;
import org.xtuml.bp.xtext.masl.masl.structure.Pragmatized;
import org.xtuml.bp.xtext.masl.masl.structure.StateDeclaration;
import org.xtuml.bp.xtext.masl.masl.structure.StructurePackage;
import org.xtuml.bp.xtext.masl.masl.structure.TransitionTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.ObjectDefinitionImpl#getPragmas <em>Pragmas</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.ObjectDefinitionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.ObjectDefinitionImpl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.ObjectDefinitionImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.ObjectDefinitionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.ObjectDefinitionImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.ObjectDefinitionImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectDefinitionImpl extends AbstractNamedImpl implements ObjectDefinition {
	/**
	 * The cached value of the '{@link #getPragmas() <em>Pragmas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPragmas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pragma> pragmas;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> attributes;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierDefinition> identifiers;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectServiceDeclaration> services;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> events;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<StateDeclaration> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionTable> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.OBJECT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pragma> getPragmas() {
		if (pragmas == null) {
			pragmas = new EObjectContainmentEList<Pragma>(Pragma.class, this, StructurePackage.OBJECT_DEFINITION__PRAGMAS);
		}
		return pragmas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinition> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeDefinition>(AttributeDefinition.class, this, StructurePackage.OBJECT_DEFINITION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentifierDefinition> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<IdentifierDefinition>(IdentifierDefinition.class, this, StructurePackage.OBJECT_DEFINITION__IDENTIFIERS);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectServiceDeclaration> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<ObjectServiceDeclaration>(ObjectServiceDeclaration.class, this, StructurePackage.OBJECT_DEFINITION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventDefinition> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<EventDefinition>(EventDefinition.class, this, StructurePackage.OBJECT_DEFINITION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateDeclaration> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<StateDeclaration>(StateDeclaration.class, this, StructurePackage.OBJECT_DEFINITION__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionTable> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<TransitionTable>(TransitionTable.class, this, StructurePackage.OBJECT_DEFINITION__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.OBJECT_DEFINITION__PRAGMAS:
				return ((InternalEList<?>)getPragmas()).basicRemove(otherEnd, msgs);
			case StructurePackage.OBJECT_DEFINITION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case StructurePackage.OBJECT_DEFINITION__IDENTIFIERS:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case StructurePackage.OBJECT_DEFINITION__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case StructurePackage.OBJECT_DEFINITION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case StructurePackage.OBJECT_DEFINITION__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case StructurePackage.OBJECT_DEFINITION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.OBJECT_DEFINITION__PRAGMAS:
				return getPragmas();
			case StructurePackage.OBJECT_DEFINITION__ATTRIBUTES:
				return getAttributes();
			case StructurePackage.OBJECT_DEFINITION__IDENTIFIERS:
				return getIdentifiers();
			case StructurePackage.OBJECT_DEFINITION__SERVICES:
				return getServices();
			case StructurePackage.OBJECT_DEFINITION__EVENTS:
				return getEvents();
			case StructurePackage.OBJECT_DEFINITION__STATES:
				return getStates();
			case StructurePackage.OBJECT_DEFINITION__TRANSITIONS:
				return getTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurePackage.OBJECT_DEFINITION__PRAGMAS:
				getPragmas().clear();
				getPragmas().addAll((Collection<? extends Pragma>)newValue);
				return;
			case StructurePackage.OBJECT_DEFINITION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeDefinition>)newValue);
				return;
			case StructurePackage.OBJECT_DEFINITION__IDENTIFIERS:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends IdentifierDefinition>)newValue);
				return;
			case StructurePackage.OBJECT_DEFINITION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ObjectServiceDeclaration>)newValue);
				return;
			case StructurePackage.OBJECT_DEFINITION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends EventDefinition>)newValue);
				return;
			case StructurePackage.OBJECT_DEFINITION__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends StateDeclaration>)newValue);
				return;
			case StructurePackage.OBJECT_DEFINITION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends TransitionTable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructurePackage.OBJECT_DEFINITION__PRAGMAS:
				getPragmas().clear();
				return;
			case StructurePackage.OBJECT_DEFINITION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case StructurePackage.OBJECT_DEFINITION__IDENTIFIERS:
				getIdentifiers().clear();
				return;
			case StructurePackage.OBJECT_DEFINITION__SERVICES:
				getServices().clear();
				return;
			case StructurePackage.OBJECT_DEFINITION__EVENTS:
				getEvents().clear();
				return;
			case StructurePackage.OBJECT_DEFINITION__STATES:
				getStates().clear();
				return;
			case StructurePackage.OBJECT_DEFINITION__TRANSITIONS:
				getTransitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructurePackage.OBJECT_DEFINITION__PRAGMAS:
				return pragmas != null && !pragmas.isEmpty();
			case StructurePackage.OBJECT_DEFINITION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case StructurePackage.OBJECT_DEFINITION__IDENTIFIERS:
				return identifiers != null && !identifiers.isEmpty();
			case StructurePackage.OBJECT_DEFINITION__SERVICES:
				return services != null && !services.isEmpty();
			case StructurePackage.OBJECT_DEFINITION__EVENTS:
				return events != null && !events.isEmpty();
			case StructurePackage.OBJECT_DEFINITION__STATES:
				return states != null && !states.isEmpty();
			case StructurePackage.OBJECT_DEFINITION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Pragmatized.class) {
			switch (derivedFeatureID) {
				case StructurePackage.OBJECT_DEFINITION__PRAGMAS: return StructurePackage.PRAGMATIZED__PRAGMAS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Pragmatized.class) {
			switch (baseFeatureID) {
				case StructurePackage.PRAGMATIZED__PRAGMAS: return StructurePackage.OBJECT_DEFINITION__PRAGMAS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ObjectDefinitionImpl
