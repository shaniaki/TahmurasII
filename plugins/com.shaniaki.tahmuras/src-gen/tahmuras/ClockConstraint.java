/**
 */
package tahmuras;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.ClockConstraint#getLogicalclock <em>Logicalclock</em>}</li>
 *   <li>{@link tahmuras.ClockConstraint#getDecisionvariable <em>Decisionvariable</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getClockConstraint()
 * @model
 * @generated
 */
public interface ClockConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Logicalclock</b></em>' reference list.
	 * The list contents are of type {@link tahmuras.LogicalClock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logicalclock</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicalclock</em>' reference list.
	 * @see tahmuras.TahmurasPackage#getClockConstraint_Logicalclock()
	 * @model required="true"
	 * @generated
	 */
	EList<LogicalClock> getLogicalclock();

	/**
	 * Returns the value of the '<em><b>Decisionvariable</b></em>' reference list.
	 * The list contents are of type {@link tahmuras.DecisionVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decisionvariable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisionvariable</em>' reference list.
	 * @see tahmuras.TahmurasPackage#getClockConstraint_Decisionvariable()
	 * @model
	 * @generated
	 */
	EList<DecisionVariable> getDecisionvariable();

} // ClockConstraint
