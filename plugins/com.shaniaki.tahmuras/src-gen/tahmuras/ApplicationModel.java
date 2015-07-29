/**
 */
package tahmuras;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.ApplicationModel#getApplicationcomponent <em>Applicationcomponent</em>}</li>
 *   <li>{@link tahmuras.ApplicationModel#getPerformancemetric <em>Performancemetric</em>}</li>
 *   <li>{@link tahmuras.ApplicationModel#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tahmuras.ApplicationModel#getBinaryrelation <em>Binaryrelation</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getApplicationModel()
 * @model
 * @generated
 */
public interface ApplicationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Applicationcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link tahmuras.ApplicationComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicationcomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicationcomponent</em>' containment reference list.
	 * @see tahmuras.TahmurasPackage#getApplicationModel_Applicationcomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ApplicationComponent> getApplicationcomponent();

	/**
	 * Returns the value of the '<em><b>Performancemetric</b></em>' containment reference list.
	 * The list contents are of type {@link tahmuras.PerformanceMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performancemetric</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performancemetric</em>' containment reference list.
	 * @see tahmuras.TahmurasPackage#getApplicationModel_Performancemetric()
	 * @model containment="true"
	 * @generated
	 */
	EList<PerformanceMetric> getPerformancemetric();

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
	 * @see tahmuras.TahmurasPackage#getApplicationModel_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Binaryrelation</b></em>' containment reference list.
	 * The list contents are of type {@link tahmuras.BinaryRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binaryrelation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binaryrelation</em>' containment reference list.
	 * @see tahmuras.TahmurasPackage#getApplicationModel_Binaryrelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<BinaryRelation> getBinaryrelation();

} // ApplicationModel
