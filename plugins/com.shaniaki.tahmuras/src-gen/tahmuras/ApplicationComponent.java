/**
 */
package tahmuras;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.ApplicationComponent#getPerformancemetric <em>Performancemetric</em>}</li>
 * </ul>
 *
 * @see tahmuras.TahmurasPackage#getApplicationComponent()
 * @model
 * @generated
 */
public interface ApplicationComponent extends Component {
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
	 * @see tahmuras.TahmurasPackage#getApplicationComponent_Performancemetric()
	 * @model containment="true"
	 * @generated
	 */
	EList<PerformanceMetric> getPerformancemetric();

} // ApplicationComponent
