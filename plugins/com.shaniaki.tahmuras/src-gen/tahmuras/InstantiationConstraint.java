/**
 */
package tahmuras;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.InstantiationConstraint#getDecisionvariable <em>Decisionvariable</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getInstantiationConstraint()
 * @model
 * @generated
 */
public interface InstantiationConstraint extends Constraint {
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
	 * @see tahmuras.TahmurasPackage#getInstantiationConstraint_Decisionvariable()
	 * @model required="true"
	 * @generated
	 */
	EList<DecisionVariable> getDecisionvariable();

} // InstantiationConstraint
