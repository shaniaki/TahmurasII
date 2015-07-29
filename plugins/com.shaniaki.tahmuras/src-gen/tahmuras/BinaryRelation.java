/**
 */
package tahmuras;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.BinaryRelation#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getBinaryRelation()
 * @model
 * @generated
 */
public interface BinaryRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link tahmuras.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see tahmuras.TahmurasPackage#getBinaryRelation_Component()
	 * @model lower="2"
	 * @generated
	 */
	EList<Component> getComponent();

} // BinaryRelation
