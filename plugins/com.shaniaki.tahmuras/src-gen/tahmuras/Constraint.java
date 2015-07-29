/**
 */
package tahmuras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.Constraint#getMinizincConstraint <em>Minizinc Constraint</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {

	/**
	 * Returns the value of the '<em><b>Minizinc Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minizinc Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minizinc Constraint</em>' attribute.
	 * @see #setMinizincConstraint(String)
	 * @see tahmuras.TahmurasPackage#getConstraint_MinizincConstraint()
	 * @model
	 * @generated
	 */
	String getMinizincConstraint();

	/**
	 * Sets the value of the '{@link tahmuras.Constraint#getMinizincConstraint <em>Minizinc Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minizinc Constraint</em>' attribute.
	 * @see #getMinizincConstraint()
	 * @generated
	 */
	void setMinizincConstraint(String value);

} // Constraint
