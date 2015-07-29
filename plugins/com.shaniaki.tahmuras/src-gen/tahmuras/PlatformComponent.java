/**
 */
package tahmuras;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.PlatformComponent#getCostmetric <em>Costmetric</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getPlatformComponent()
 * @model
 * @generated
 */
public interface PlatformComponent extends Component {
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
	 * @see tahmuras.TahmurasPackage#getPlatformComponent_Costmetric()
	 * @model containment="true"
	 * @generated
	 */
	EList<CostMetric> getCostmetric();

} // PlatformComponent
