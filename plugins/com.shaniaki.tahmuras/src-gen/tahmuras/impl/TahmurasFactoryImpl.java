/**
 */
package tahmuras.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tahmuras.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TahmurasFactoryImpl extends EFactoryImpl implements TahmurasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TahmurasFactory init() {
		try {
			TahmurasFactory theTahmurasFactory = (TahmurasFactory)EPackage.Registry.INSTANCE.getEFactory(TahmurasPackage.eNS_URI);
			if (theTahmurasFactory != null) {
				return theTahmurasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TahmurasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TahmurasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TahmurasPackage.APPLICATION_COMPONENT: return createApplicationComponent();
			case TahmurasPackage.PLATFORM_COMPONENT: return createPlatformComponent();
			case TahmurasPackage.LOGICAL_CLOCK: return createLogicalClock();
			case TahmurasPackage.DECISION_VARIABLE: return createDecisionVariable();
			case TahmurasPackage.CLOCK_CONSTRAINT: return createClockConstraint();
			case TahmurasPackage.INSTANTIATION_CONSTRAINT: return createInstantiationConstraint();
			case TahmurasPackage.COST_METRIC: return createCostMetric();
			case TahmurasPackage.PERFORMANCE_METRIC: return createPerformanceMetric();
			case TahmurasPackage.PLATFORM_MODEL: return createPlatformModel();
			case TahmurasPackage.APPLICATION_MODEL: return createApplicationModel();
			case TahmurasPackage.BINARY_RELATION: return createBinaryRelation();
			case TahmurasPackage.BINDING_MODEL: return createBindingModel();
			case TahmurasPackage.DSE_MODEL: return createDSEModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationComponent createApplicationComponent() {
		ApplicationComponentImpl applicationComponent = new ApplicationComponentImpl();
		return applicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformComponent createPlatformComponent() {
		PlatformComponentImpl platformComponent = new PlatformComponentImpl();
		return platformComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalClock createLogicalClock() {
		LogicalClockImpl logicalClock = new LogicalClockImpl();
		return logicalClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionVariable createDecisionVariable() {
		DecisionVariableImpl decisionVariable = new DecisionVariableImpl();
		return decisionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraint createClockConstraint() {
		ClockConstraintImpl clockConstraint = new ClockConstraintImpl();
		return clockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationConstraint createInstantiationConstraint() {
		InstantiationConstraintImpl instantiationConstraint = new InstantiationConstraintImpl();
		return instantiationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostMetric createCostMetric() {
		CostMetricImpl costMetric = new CostMetricImpl();
		return costMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceMetric createPerformanceMetric() {
		PerformanceMetricImpl performanceMetric = new PerformanceMetricImpl();
		return performanceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel createPlatformModel() {
		PlatformModelImpl platformModel = new PlatformModelImpl();
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationModel createApplicationModel() {
		ApplicationModelImpl applicationModel = new ApplicationModelImpl();
		return applicationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelation createBinaryRelation() {
		BinaryRelationImpl binaryRelation = new BinaryRelationImpl();
		return binaryRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingModel createBindingModel() {
		BindingModelImpl bindingModel = new BindingModelImpl();
		return bindingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSEModel createDSEModel() {
		DSEModelImpl dseModel = new DSEModelImpl();
		return dseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TahmurasPackage getTahmurasPackage() {
		return (TahmurasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TahmurasPackage getPackage() {
		return TahmurasPackage.eINSTANCE;
	}

} //TahmurasFactoryImpl
