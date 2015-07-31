/**
 */
package tahmuras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSE Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.DSEModel#getBindingmodel <em>Bindingmodel</em>}</li>
 *   <li>{@link tahmuras.DSEModel#getPlatformmodel <em>Platformmodel</em>}</li>
 *   <li>{@link tahmuras.DSEModel#getApplicationmodel <em>Applicationmodel</em>}</li>
 *   <li>{@link tahmuras.DSEModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getDSEModel()
 * @model
 * @generated
 */
public interface DSEModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindingmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindingmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingmodel</em>' containment reference.
	 * @see #setBindingmodel(BindingModel)
	 * @see tahmuras.TahmurasPackage#getDSEModel_Bindingmodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BindingModel getBindingmodel();

	/**
	 * Sets the value of the '{@link tahmuras.DSEModel#getBindingmodel <em>Bindingmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingmodel</em>' containment reference.
	 * @see #getBindingmodel()
	 * @generated
	 */
	void setBindingmodel(BindingModel value);

	/**
	 * Returns the value of the '<em><b>Platformmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platformmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platformmodel</em>' containment reference.
	 * @see #setPlatformmodel(PlatformModel)
	 * @see tahmuras.TahmurasPackage#getDSEModel_Platformmodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PlatformModel getPlatformmodel();

	/**
	 * Sets the value of the '{@link tahmuras.DSEModel#getPlatformmodel <em>Platformmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platformmodel</em>' containment reference.
	 * @see #getPlatformmodel()
	 * @generated
	 */
	void setPlatformmodel(PlatformModel value);

	/**
	 * Returns the value of the '<em><b>Applicationmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicationmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicationmodel</em>' containment reference.
	 * @see #setApplicationmodel(ApplicationModel)
	 * @see tahmuras.TahmurasPackage#getDSEModel_Applicationmodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ApplicationModel getApplicationmodel();

	/**
	 * Sets the value of the '{@link tahmuras.DSEModel#getApplicationmodel <em>Applicationmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicationmodel</em>' containment reference.
	 * @see #getApplicationmodel()
	 * @generated
	 */
	void setApplicationmodel(ApplicationModel value);

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
	 * @see tahmuras.TahmurasPackage#getDSEModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tahmuras.DSEModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DSEModel
