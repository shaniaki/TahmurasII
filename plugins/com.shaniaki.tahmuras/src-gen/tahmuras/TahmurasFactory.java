/**
 */
package tahmuras;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tahmuras.TahmurasPackage
 * @generated
 */
public interface TahmurasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TahmurasFactory eINSTANCE = tahmuras.impl.TahmurasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Component</em>'.
	 * @generated
	 */
	ApplicationComponent createApplicationComponent();

	/**
	 * Returns a new object of class '<em>Platform Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Component</em>'.
	 * @generated
	 */
	PlatformComponent createPlatformComponent();

	/**
	 * Returns a new object of class '<em>Logical Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Clock</em>'.
	 * @generated
	 */
	LogicalClock createLogicalClock();

	/**
	 * Returns a new object of class '<em>Decision Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Variable</em>'.
	 * @generated
	 */
	DecisionVariable createDecisionVariable();

	/**
	 * Returns a new object of class '<em>Clock Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Constraint</em>'.
	 * @generated
	 */
	ClockConstraint createClockConstraint();

	/**
	 * Returns a new object of class '<em>Instantiation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantiation Constraint</em>'.
	 * @generated
	 */
	InstantiationConstraint createInstantiationConstraint();

	/**
	 * Returns a new object of class '<em>Cost Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cost Metric</em>'.
	 * @generated
	 */
	CostMetric createCostMetric();

	/**
	 * Returns a new object of class '<em>Performance Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Metric</em>'.
	 * @generated
	 */
	PerformanceMetric createPerformanceMetric();

	/**
	 * Returns a new object of class '<em>Platform Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Model</em>'.
	 * @generated
	 */
	PlatformModel createPlatformModel();

	/**
	 * Returns a new object of class '<em>Application Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Model</em>'.
	 * @generated
	 */
	ApplicationModel createApplicationModel();

	/**
	 * Returns a new object of class '<em>Binary Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Relation</em>'.
	 * @generated
	 */
	BinaryRelation createBinaryRelation();

	/**
	 * Returns a new object of class '<em>Binding Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Model</em>'.
	 * @generated
	 */
	BindingModel createBindingModel();

	/**
	 * Returns a new object of class '<em>DSE Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSE Model</em>'.
	 * @generated
	 */
	DSEModel createDSEModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TahmurasPackage getTahmurasPackage();

} //TahmurasFactory
