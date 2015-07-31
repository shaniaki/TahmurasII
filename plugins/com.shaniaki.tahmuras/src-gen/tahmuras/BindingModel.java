/**
 */
package tahmuras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.BindingModel#getBinaryrelation <em>Binaryrelation</em>}</li>
 *   <li>{@link tahmuras.BindingModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getBindingModel()
 * @model
 * @generated
 */
public interface BindingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Binaryrelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binaryrelation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binaryrelation</em>' containment reference.
	 * @see #setBinaryrelation(BinaryRelation)
	 * @see tahmuras.TahmurasPackage#getBindingModel_Binaryrelation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BinaryRelation getBinaryrelation();

	/**
	 * Sets the value of the '{@link tahmuras.BindingModel#getBinaryrelation <em>Binaryrelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binaryrelation</em>' containment reference.
	 * @see #getBinaryrelation()
	 * @generated
	 */
	void setBinaryrelation(BinaryRelation value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tahmuras.TahmurasPackage#getBindingModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tahmuras.BindingModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BindingModel
