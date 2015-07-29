/**
 */
package tahmuras;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tahmuras.TahmurasFactory
 * @model kind="package"
 * @generated
 */
public interface TahmurasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tahmuras";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.shaniaki.com/tahmuras";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tahmuras";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TahmurasPackage eINSTANCE = tahmuras.impl.TahmurasPackageImpl.init();

	/**
	 * The meta object id for the '{@link tahmuras.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.ComponentImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Logicalclock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LOGICALCLOCK = 1;

	/**
	 * The feature id for the '<em><b>Decisionvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DECISIONVARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.ApplicationComponentImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getApplicationComponent()
	 * @generated
	 */
	int APPLICATION_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__CONSTRAINT = COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Logicalclock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__LOGICALCLOCK = COMPONENT__LOGICALCLOCK;

	/**
	 * The feature id for the '<em><b>Decisionvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__DECISIONVARIABLE = COMPONENT__DECISIONVARIABLE;

	/**
	 * The feature id for the '<em><b>Performancemetric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__PERFORMANCEMETRIC = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.PlatformComponentImpl <em>Platform Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.PlatformComponentImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getPlatformComponent()
	 * @generated
	 */
	int PLATFORM_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_COMPONENT__CONSTRAINT = COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Logicalclock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_COMPONENT__LOGICALCLOCK = COMPONENT__LOGICALCLOCK;

	/**
	 * The feature id for the '<em><b>Decisionvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_COMPONENT__DECISIONVARIABLE = COMPONENT__DECISIONVARIABLE;

	/**
	 * The feature id for the '<em><b>Costmetric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_COMPONENT__COSTMETRIC = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Platform Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Platform Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.LogicalClockImpl <em>Logical Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.LogicalClockImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getLogicalClock()
	 * @generated
	 */
	int LOGICAL_CLOCK = 3;

	/**
	 * The number of structural features of the '<em>Logical Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Logical Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.ConstraintImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Minizinc Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__MINIZINC_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.DecisionVariableImpl <em>Decision Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.DecisionVariableImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getDecisionVariable()
	 * @generated
	 */
	int DECISION_VARIABLE = 5;

	/**
	 * The number of structural features of the '<em>Decision Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Decision Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.ClockConstraintImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getClockConstraint()
	 * @generated
	 */
	int CLOCK_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Minizinc Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__MINIZINC_CONSTRAINT = CONSTRAINT__MINIZINC_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Logicalclock</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__LOGICALCLOCK = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decisionvariable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__DECISIONVARIABLE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.InstantiationConstraintImpl <em>Instantiation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.InstantiationConstraintImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getInstantiationConstraint()
	 * @generated
	 */
	int INSTANTIATION_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Minizinc Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_CONSTRAINT__MINIZINC_CONSTRAINT = CONSTRAINT__MINIZINC_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Decisionvariable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_CONSTRAINT__DECISIONVARIABLE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instantiation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instantiation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.MetricImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 8;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.CostMetricImpl <em>Cost Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.CostMetricImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getCostMetric()
	 * @generated
	 */
	int COST_METRIC = 9;

	/**
	 * The number of structural features of the '<em>Cost Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cost Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.PerformanceMetricImpl <em>Performance Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.PerformanceMetricImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getPerformanceMetric()
	 * @generated
	 */
	int PERFORMANCE_METRIC = 10;

	/**
	 * The number of structural features of the '<em>Performance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Performance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.PlatformModelImpl <em>Platform Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.PlatformModelImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getPlatformModel()
	 * @generated
	 */
	int PLATFORM_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Platformcomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__PLATFORMCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Costmetric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__COSTMETRIC = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Binaryrelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__BINARYRELATION = 3;

	/**
	 * The number of structural features of the '<em>Platform Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Platform Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.ApplicationModelImpl <em>Application Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.ApplicationModelImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getApplicationModel()
	 * @generated
	 */
	int APPLICATION_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Applicationcomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODEL__APPLICATIONCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Performancemetric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODEL__PERFORMANCEMETRIC = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODEL__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Binaryrelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODEL__BINARYRELATION = 3;

	/**
	 * The number of structural features of the '<em>Application Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Application Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.BinaryRelationImpl <em>Binary Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.BinaryRelationImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getBinaryRelation()
	 * @generated
	 */
	int BINARY_RELATION = 13;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATION__COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Binary Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binary Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.BindingModelImpl <em>Binding Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.BindingModelImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getBindingModel()
	 * @generated
	 */
	int BINDING_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Binaryrelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__BINARYRELATION = 0;

	/**
	 * The number of structural features of the '<em>Binding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tahmuras.impl.DSEModelImpl <em>DSE Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tahmuras.impl.DSEModelImpl
	 * @see tahmuras.impl.TahmurasPackageImpl#getDSEModel()
	 * @generated
	 */
	int DSE_MODEL = 15;

	/**
	 * The feature id for the '<em><b>Bindingmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_MODEL__BINDINGMODEL = 0;

	/**
	 * The feature id for the '<em><b>Platformmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_MODEL__PLATFORMMODEL = 1;

	/**
	 * The feature id for the '<em><b>Applicationmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_MODEL__APPLICATIONMODEL = 2;

	/**
	 * The number of structural features of the '<em>DSE Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DSE Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tahmuras.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see tahmuras.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.Component#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see tahmuras.Component#getConstraint()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.Component#getLogicalclock <em>Logicalclock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logicalclock</em>'.
	 * @see tahmuras.Component#getLogicalclock()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Logicalclock();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.Component#getDecisionvariable <em>Decisionvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisionvariable</em>'.
	 * @see tahmuras.Component#getDecisionvariable()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Decisionvariable();

	/**
	 * Returns the meta object for class '{@link tahmuras.ApplicationComponent <em>Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Component</em>'.
	 * @see tahmuras.ApplicationComponent
	 * @generated
	 */
	EClass getApplicationComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.ApplicationComponent#getPerformancemetric <em>Performancemetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performancemetric</em>'.
	 * @see tahmuras.ApplicationComponent#getPerformancemetric()
	 * @see #getApplicationComponent()
	 * @generated
	 */
	EReference getApplicationComponent_Performancemetric();

	/**
	 * Returns the meta object for class '{@link tahmuras.PlatformComponent <em>Platform Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Component</em>'.
	 * @see tahmuras.PlatformComponent
	 * @generated
	 */
	EClass getPlatformComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.PlatformComponent#getCostmetric <em>Costmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Costmetric</em>'.
	 * @see tahmuras.PlatformComponent#getCostmetric()
	 * @see #getPlatformComponent()
	 * @generated
	 */
	EReference getPlatformComponent_Costmetric();

	/**
	 * Returns the meta object for class '{@link tahmuras.LogicalClock <em>Logical Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Clock</em>'.
	 * @see tahmuras.LogicalClock
	 * @generated
	 */
	EClass getLogicalClock();

	/**
	 * Returns the meta object for class '{@link tahmuras.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see tahmuras.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link tahmuras.Constraint#getMinizincConstraint <em>Minizinc Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minizinc Constraint</em>'.
	 * @see tahmuras.Constraint#getMinizincConstraint()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_MinizincConstraint();

	/**
	 * Returns the meta object for class '{@link tahmuras.DecisionVariable <em>Decision Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Variable</em>'.
	 * @see tahmuras.DecisionVariable
	 * @generated
	 */
	EClass getDecisionVariable();

	/**
	 * Returns the meta object for class '{@link tahmuras.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Constraint</em>'.
	 * @see tahmuras.ClockConstraint
	 * @generated
	 */
	EClass getClockConstraint();

	/**
	 * Returns the meta object for the reference list '{@link tahmuras.ClockConstraint#getLogicalclock <em>Logicalclock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logicalclock</em>'.
	 * @see tahmuras.ClockConstraint#getLogicalclock()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Logicalclock();

	/**
	 * Returns the meta object for the reference list '{@link tahmuras.ClockConstraint#getDecisionvariable <em>Decisionvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decisionvariable</em>'.
	 * @see tahmuras.ClockConstraint#getDecisionvariable()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Decisionvariable();

	/**
	 * Returns the meta object for class '{@link tahmuras.InstantiationConstraint <em>Instantiation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Constraint</em>'.
	 * @see tahmuras.InstantiationConstraint
	 * @generated
	 */
	EClass getInstantiationConstraint();

	/**
	 * Returns the meta object for the reference list '{@link tahmuras.InstantiationConstraint#getDecisionvariable <em>Decisionvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decisionvariable</em>'.
	 * @see tahmuras.InstantiationConstraint#getDecisionvariable()
	 * @see #getInstantiationConstraint()
	 * @generated
	 */
	EReference getInstantiationConstraint_Decisionvariable();

	/**
	 * Returns the meta object for class '{@link tahmuras.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see tahmuras.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for class '{@link tahmuras.CostMetric <em>Cost Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Metric</em>'.
	 * @see tahmuras.CostMetric
	 * @generated
	 */
	EClass getCostMetric();

	/**
	 * Returns the meta object for class '{@link tahmuras.PerformanceMetric <em>Performance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Metric</em>'.
	 * @see tahmuras.PerformanceMetric
	 * @generated
	 */
	EClass getPerformanceMetric();

	/**
	 * Returns the meta object for class '{@link tahmuras.PlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Model</em>'.
	 * @see tahmuras.PlatformModel
	 * @generated
	 */
	EClass getPlatformModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.PlatformModel#getPlatformcomponent <em>Platformcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platformcomponent</em>'.
	 * @see tahmuras.PlatformModel#getPlatformcomponent()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_Platformcomponent();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.PlatformModel#getCostmetric <em>Costmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Costmetric</em>'.
	 * @see tahmuras.PlatformModel#getCostmetric()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_Costmetric();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.PlatformModel#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see tahmuras.PlatformModel#getConstraint()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.PlatformModel#getBinaryrelation <em>Binaryrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binaryrelation</em>'.
	 * @see tahmuras.PlatformModel#getBinaryrelation()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_Binaryrelation();

	/**
	 * Returns the meta object for class '{@link tahmuras.ApplicationModel <em>Application Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Model</em>'.
	 * @see tahmuras.ApplicationModel
	 * @generated
	 */
	EClass getApplicationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.ApplicationModel#getApplicationcomponent <em>Applicationcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicationcomponent</em>'.
	 * @see tahmuras.ApplicationModel#getApplicationcomponent()
	 * @see #getApplicationModel()
	 * @generated
	 */
	EReference getApplicationModel_Applicationcomponent();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.ApplicationModel#getPerformancemetric <em>Performancemetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performancemetric</em>'.
	 * @see tahmuras.ApplicationModel#getPerformancemetric()
	 * @see #getApplicationModel()
	 * @generated
	 */
	EReference getApplicationModel_Performancemetric();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.ApplicationModel#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see tahmuras.ApplicationModel#getConstraint()
	 * @see #getApplicationModel()
	 * @generated
	 */
	EReference getApplicationModel_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link tahmuras.ApplicationModel#getBinaryrelation <em>Binaryrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binaryrelation</em>'.
	 * @see tahmuras.ApplicationModel#getBinaryrelation()
	 * @see #getApplicationModel()
	 * @generated
	 */
	EReference getApplicationModel_Binaryrelation();

	/**
	 * Returns the meta object for class '{@link tahmuras.BinaryRelation <em>Binary Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Relation</em>'.
	 * @see tahmuras.BinaryRelation
	 * @generated
	 */
	EClass getBinaryRelation();

	/**
	 * Returns the meta object for the reference list '{@link tahmuras.BinaryRelation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see tahmuras.BinaryRelation#getComponent()
	 * @see #getBinaryRelation()
	 * @generated
	 */
	EReference getBinaryRelation_Component();

	/**
	 * Returns the meta object for class '{@link tahmuras.BindingModel <em>Binding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Model</em>'.
	 * @see tahmuras.BindingModel
	 * @generated
	 */
	EClass getBindingModel();

	/**
	 * Returns the meta object for the containment reference '{@link tahmuras.BindingModel#getBinaryrelation <em>Binaryrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binaryrelation</em>'.
	 * @see tahmuras.BindingModel#getBinaryrelation()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_Binaryrelation();

	/**
	 * Returns the meta object for class '{@link tahmuras.DSEModel <em>DSE Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE Model</em>'.
	 * @see tahmuras.DSEModel
	 * @generated
	 */
	EClass getDSEModel();

	/**
	 * Returns the meta object for the containment reference '{@link tahmuras.DSEModel#getBindingmodel <em>Bindingmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindingmodel</em>'.
	 * @see tahmuras.DSEModel#getBindingmodel()
	 * @see #getDSEModel()
	 * @generated
	 */
	EReference getDSEModel_Bindingmodel();

	/**
	 * Returns the meta object for the containment reference '{@link tahmuras.DSEModel#getPlatformmodel <em>Platformmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platformmodel</em>'.
	 * @see tahmuras.DSEModel#getPlatformmodel()
	 * @see #getDSEModel()
	 * @generated
	 */
	EReference getDSEModel_Platformmodel();

	/**
	 * Returns the meta object for the containment reference '{@link tahmuras.DSEModel#getApplicationmodel <em>Applicationmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicationmodel</em>'.
	 * @see tahmuras.DSEModel#getApplicationmodel()
	 * @see #getDSEModel()
	 * @generated
	 */
	EReference getDSEModel_Applicationmodel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TahmurasFactory getTahmurasFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tahmuras.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.ComponentImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONSTRAINT = eINSTANCE.getComponent_Constraint();

		/**
		 * The meta object literal for the '<em><b>Logicalclock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__LOGICALCLOCK = eINSTANCE.getComponent_Logicalclock();

		/**
		 * The meta object literal for the '<em><b>Decisionvariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DECISIONVARIABLE = eINSTANCE.getComponent_Decisionvariable();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.ApplicationComponentImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getApplicationComponent()
		 * @generated
		 */
		EClass APPLICATION_COMPONENT = eINSTANCE.getApplicationComponent();

		/**
		 * The meta object literal for the '<em><b>Performancemetric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_COMPONENT__PERFORMANCEMETRIC = eINSTANCE.getApplicationComponent_Performancemetric();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.PlatformComponentImpl <em>Platform Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.PlatformComponentImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getPlatformComponent()
		 * @generated
		 */
		EClass PLATFORM_COMPONENT = eINSTANCE.getPlatformComponent();

		/**
		 * The meta object literal for the '<em><b>Costmetric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_COMPONENT__COSTMETRIC = eINSTANCE.getPlatformComponent_Costmetric();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.LogicalClockImpl <em>Logical Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.LogicalClockImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getLogicalClock()
		 * @generated
		 */
		EClass LOGICAL_CLOCK = eINSTANCE.getLogicalClock();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.ConstraintImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Minizinc Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__MINIZINC_CONSTRAINT = eINSTANCE.getConstraint_MinizincConstraint();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.DecisionVariableImpl <em>Decision Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.DecisionVariableImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getDecisionVariable()
		 * @generated
		 */
		EClass DECISION_VARIABLE = eINSTANCE.getDecisionVariable();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.ClockConstraintImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getClockConstraint()
		 * @generated
		 */
		EClass CLOCK_CONSTRAINT = eINSTANCE.getClockConstraint();

		/**
		 * The meta object literal for the '<em><b>Logicalclock</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_CONSTRAINT__LOGICALCLOCK = eINSTANCE.getClockConstraint_Logicalclock();

		/**
		 * The meta object literal for the '<em><b>Decisionvariable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_CONSTRAINT__DECISIONVARIABLE = eINSTANCE.getClockConstraint_Decisionvariable();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.InstantiationConstraintImpl <em>Instantiation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.InstantiationConstraintImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getInstantiationConstraint()
		 * @generated
		 */
		EClass INSTANTIATION_CONSTRAINT = eINSTANCE.getInstantiationConstraint();

		/**
		 * The meta object literal for the '<em><b>Decisionvariable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_CONSTRAINT__DECISIONVARIABLE = eINSTANCE.getInstantiationConstraint_Decisionvariable();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.MetricImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.CostMetricImpl <em>Cost Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.CostMetricImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getCostMetric()
		 * @generated
		 */
		EClass COST_METRIC = eINSTANCE.getCostMetric();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.PerformanceMetricImpl <em>Performance Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.PerformanceMetricImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getPerformanceMetric()
		 * @generated
		 */
		EClass PERFORMANCE_METRIC = eINSTANCE.getPerformanceMetric();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.PlatformModelImpl <em>Platform Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.PlatformModelImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getPlatformModel()
		 * @generated
		 */
		EClass PLATFORM_MODEL = eINSTANCE.getPlatformModel();

		/**
		 * The meta object literal for the '<em><b>Platformcomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__PLATFORMCOMPONENT = eINSTANCE.getPlatformModel_Platformcomponent();

		/**
		 * The meta object literal for the '<em><b>Costmetric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__COSTMETRIC = eINSTANCE.getPlatformModel_Costmetric();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__CONSTRAINT = eINSTANCE.getPlatformModel_Constraint();

		/**
		 * The meta object literal for the '<em><b>Binaryrelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__BINARYRELATION = eINSTANCE.getPlatformModel_Binaryrelation();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.ApplicationModelImpl <em>Application Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.ApplicationModelImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getApplicationModel()
		 * @generated
		 */
		EClass APPLICATION_MODEL = eINSTANCE.getApplicationModel();

		/**
		 * The meta object literal for the '<em><b>Applicationcomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODEL__APPLICATIONCOMPONENT = eINSTANCE.getApplicationModel_Applicationcomponent();

		/**
		 * The meta object literal for the '<em><b>Performancemetric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODEL__PERFORMANCEMETRIC = eINSTANCE.getApplicationModel_Performancemetric();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODEL__CONSTRAINT = eINSTANCE.getApplicationModel_Constraint();

		/**
		 * The meta object literal for the '<em><b>Binaryrelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODEL__BINARYRELATION = eINSTANCE.getApplicationModel_Binaryrelation();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.BinaryRelationImpl <em>Binary Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.BinaryRelationImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getBinaryRelation()
		 * @generated
		 */
		EClass BINARY_RELATION = eINSTANCE.getBinaryRelation();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_RELATION__COMPONENT = eINSTANCE.getBinaryRelation_Component();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.BindingModelImpl <em>Binding Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.BindingModelImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getBindingModel()
		 * @generated
		 */
		EClass BINDING_MODEL = eINSTANCE.getBindingModel();

		/**
		 * The meta object literal for the '<em><b>Binaryrelation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__BINARYRELATION = eINSTANCE.getBindingModel_Binaryrelation();

		/**
		 * The meta object literal for the '{@link tahmuras.impl.DSEModelImpl <em>DSE Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tahmuras.impl.DSEModelImpl
		 * @see tahmuras.impl.TahmurasPackageImpl#getDSEModel()
		 * @generated
		 */
		EClass DSE_MODEL = eINSTANCE.getDSEModel();

		/**
		 * The meta object literal for the '<em><b>Bindingmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_MODEL__BINDINGMODEL = eINSTANCE.getDSEModel_Bindingmodel();

		/**
		 * The meta object literal for the '<em><b>Platformmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_MODEL__PLATFORMMODEL = eINSTANCE.getDSEModel_Platformmodel();

		/**
		 * The meta object literal for the '<em><b>Applicationmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSE_MODEL__APPLICATIONMODEL = eINSTANCE.getDSEModel_Applicationmodel();

	}

} //TahmurasPackage
