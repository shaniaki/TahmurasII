/**
 */
package tahmuras;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.PlatformModel#getPlatformcomponent <em>Platformcomponent</em>}</li>
 *   <li>{@link tahmuras.PlatformModel#getCostmetric <em>Costmetric</em>}</li>
 *   <li>{@link tahmuras.PlatformModel#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tahmuras.PlatformModel#getBinaryrelation <em>Binaryrelation</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getPlatformModel()
 * @model
 * @generated
 */
public interface PlatformModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Platformcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link tahmuras.PlatformComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platformcomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platformcomponent</em>' containment reference list.
	 * @see tahmuras.TahmurasPackage#getPlatformModel_Platformcomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlatformComponent> getPlatformcomponent();

	/**
	 * Returns the value of the '<em><b>Costmetric</b></em>' containment reference list.
	 * The list contents are of type {@link tahmuras.CostMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costmetric</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costmetric</em>' containment reference list.
	 * @see tahmuras.TahmurasPackage#getPlatformModel_Costmetric()
	 * @model containment="true"
	 * @generated
	 */
	EList<CostMetric> getCostmetric();

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
	 * @see tahmuras.TahmurasPackage#getPlatformModel_Constraint()
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
	 * @see tahmuras.TahmurasPackage#getPlatformModel_Binaryrelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<BinaryRelation> getBinaryrelation();

} // PlatformModel
