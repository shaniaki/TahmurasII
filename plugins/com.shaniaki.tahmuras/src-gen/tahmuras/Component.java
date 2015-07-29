/**
 */
package tahmuras;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.Component#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tahmuras.Component#getLogicalclock <em>Logicalclock</em>}</li>
 *   <li>{@link tahmuras.Component#getDecisionvariable <em>Decisionvariable</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link tahmuras.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see tahmuras.TahmurasPackage#getComponent_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Logicalclock</b></em>' containment reference list.
	 * The list contents are of type {@link tahmuras.LogicalClock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logicalclock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicalclock</em>' containment reference list.
	 * @see tahmuras.TahmurasPackage#getComponent_Logicalclock()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalClock> getLogicalclock();

	/**
	 * Returns the value of the '<em><b>Decisionvariable</b></em>' containment reference list.
	 * The list contents are of type {@link tahmuras.DecisionVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decisionvariable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisionvariable</em>' containment reference list.
	 * @see tahmuras.TahmurasPackage#getComponent_Decisionvariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecisionVariable> getDecisionvariable();

} // Component
