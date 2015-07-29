/**
 */
package tahmuras.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tahmuras.ClockConstraint;
import tahmuras.DecisionVariable;
import tahmuras.LogicalClock;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.ClockConstraintImpl#getLogicalclock <em>Logicalclock</em>}</li>
 *   <li>{@link tahmuras.impl.ClockConstraintImpl#getDecisionvariable <em>Decisionvariable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockConstraintImpl extends ConstraintImpl implements ClockConstraint {
	/**
	 * The cached value of the '{@link #getLogicalclock() <em>Logicalclock</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalclock()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalClock> logicalclock;

	/**
	 * The cached value of the '{@link #getDecisionvariable() <em>Decisionvariable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionvariable()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionVariable> decisionvariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.CLOCK_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalClock> getLogicalclock() {
		if (logicalclock == null) {
			logicalclock = new EObjectResolvingEList<LogicalClock>(LogicalClock.class, this, TahmurasPackage.CLOCK_CONSTRAINT__LOGICALCLOCK);
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
			decisionvariable = new EObjectResolvingEList<DecisionVariable>(DecisionVariable.class, this, TahmurasPackage.CLOCK_CONSTRAINT__DECISIONVARIABLE);
		}
		return decisionvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TahmurasPackage.CLOCK_CONSTRAINT__LOGICALCLOCK:
				return getLogicalclock();
			case TahmurasPackage.CLOCK_CONSTRAINT__DECISIONVARIABLE:
				return getDecisionvariable();
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
			case TahmurasPackage.CLOCK_CONSTRAINT__LOGICALCLOCK:
				getLogicalclock().clear();
				getLogicalclock().addAll((Collection<? extends LogicalClock>)newValue);
				return;
			case TahmurasPackage.CLOCK_CONSTRAINT__DECISIONVARIABLE:
				getDecisionvariable().clear();
				getDecisionvariable().addAll((Collection<? extends DecisionVariable>)newValue);
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
			case TahmurasPackage.CLOCK_CONSTRAINT__LOGICALCLOCK:
				getLogicalclock().clear();
				return;
			case TahmurasPackage.CLOCK_CONSTRAINT__DECISIONVARIABLE:
				getDecisionvariable().clear();
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
			case TahmurasPackage.CLOCK_CONSTRAINT__LOGICALCLOCK:
				return logicalclock != null && !logicalclock.isEmpty();
			case TahmurasPackage.CLOCK_CONSTRAINT__DECISIONVARIABLE:
				return decisionvariable != null && !decisionvariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClockConstraintImpl
