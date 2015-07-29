/**
 */
package tahmuras.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tahmuras.Component;
import tahmuras.Constraint;
import tahmuras.DecisionVariable;
import tahmuras.LogicalClock;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.ComponentImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tahmuras.impl.ComponentImpl#getLogicalclock <em>Logicalclock</em>}</li>
 *   <li>{@link tahmuras.impl.ComponentImpl#getDecisionvariable <em>Decisionvariable</em>}</li>
 *   <li>{@link tahmuras.impl.ComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getLogicalclock() <em>Logicalclock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalclock()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalClock> logicalclock;

	/**
	 * The cached value of the '{@link #getDecisionvariable() <em>Decisionvariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionvariable()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionVariable> decisionvariable;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, TahmurasPackage.COMPONENT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalClock> getLogicalclock() {
		if (logicalclock == null) {
			logicalclock = new EObjectContainmentEList<LogicalClock>(LogicalClock.class, this, TahmurasPackage.COMPONENT__LOGICALCLOCK);
		}
		return logicalclock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionVariable> getDecisionvariable() {
		if (decisionvariable == null) {
			decisionvariable = new EObjectContainmentEList<DecisionVariable>(DecisionVariable.class, this, TahmurasPackage.COMPONENT__DECISIONVARIABLE);
		}
		return decisionvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TahmurasPackage.COMPONENT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case TahmurasPackage.COMPONENT__LOGICALCLOCK:
				return ((InternalEList<?>)getLogicalclock()).basicRemove(otherEnd, msgs);
			case TahmurasPackage.COMPONENT__DECISIONVARIABLE:
				return ((InternalEList<?>)getDecisionvariable()).basicRemove(otherEnd, msgs);
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
			case TahmurasPackage.COMPONENT__CONSTRAINT:
				return getConstraint();
			case TahmurasPackage.COMPONENT__LOGICALCLOCK:
				return getLogicalclock();
			case TahmurasPackage.COMPONENT__DECISIONVARIABLE:
				return getDecisionvariable();
			case TahmurasPackage.COMPONENT__NAME:
				return getName();
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
			case TahmurasPackage.COMPONENT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case TahmurasPackage.COMPONENT__LOGICALCLOCK:
				getLogicalclock().clear();
				getLogicalclock().addAll((Collection<? extends LogicalClock>)newValue);
				return;
			case TahmurasPackage.COMPONENT__DECISIONVARIABLE:
				getDecisionvariable().clear();
				getDecisionvariable().addAll((Collection<? extends DecisionVariable>)newValue);
				return;
			case TahmurasPackage.COMPONENT__NAME:
				setName((String)newValue);
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
			case TahmurasPackage.COMPONENT__CONSTRAINT:
				getConstraint().clear();
				return;
			case TahmurasPackage.COMPONENT__LOGICALCLOCK:
				getLogicalclock().clear();
				return;
			case TahmurasPackage.COMPONENT__DECISIONVARIABLE:
				getDecisionvariable().clear();
				return;
			case TahmurasPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
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
			case TahmurasPackage.COMPONENT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case TahmurasPackage.COMPONENT__LOGICALCLOCK:
				return logicalclock != null && !logicalclock.isEmpty();
			case TahmurasPackage.COMPONENT__DECISIONVARIABLE:
				return decisionvariable != null && !decisionvariable.isEmpty();
			case TahmurasPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
