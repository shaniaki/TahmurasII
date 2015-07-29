/**
 */
package tahmuras.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tahmuras.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tahmuras.TahmurasPackage
 * @generated
 */
public class TahmurasAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TahmurasPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TahmurasAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TahmurasPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TahmurasSwitch<Adapter> modelSwitch =
		new TahmurasSwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseApplicationComponent(ApplicationComponent object) {
				return createApplicationComponentAdapter();
			}
			@Override
			public Adapter casePlatformComponent(PlatformComponent object) {
				return createPlatformComponentAdapter();
			}
			@Override
			public Adapter caseLogicalClock(LogicalClock object) {
				return createLogicalClockAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseDecisionVariable(DecisionVariable object) {
				return createDecisionVariableAdapter();
			}
			@Override
			public Adapter caseClockConstraint(ClockConstraint object) {
				return createClockConstraintAdapter();
			}
			@Override
			public Adapter caseInstantiationConstraint(InstantiationConstraint object) {
				return createInstantiationConstraintAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseCostMetric(CostMetric object) {
				return createCostMetricAdapter();
			}
			@Override
			public Adapter casePerformanceMetric(PerformanceMetric object) {
				return createPerformanceMetricAdapter();
			}
			@Override
			public Adapter casePlatformModel(PlatformModel object) {
				return createPlatformModelAdapter();
			}
			@Override
			public Adapter caseApplicationModel(ApplicationModel object) {
				return createApplicationModelAdapter();
			}
			@Override
			public Adapter caseBinaryRelation(BinaryRelation object) {
				return createBinaryRelationAdapter();
			}
			@Override
			public Adapter caseBindingModel(BindingModel object) {
				return createBindingModelAdapter();
			}
			@Override
			public Adapter caseDSEModel(DSEModel object) {
				return createDSEModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.ApplicationComponent <em>Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.ApplicationComponent
	 * @generated
	 */
	public Adapter createApplicationComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.PlatformComponent <em>Platform Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.PlatformComponent
	 * @generated
	 */
	public Adapter createPlatformComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.LogicalClock <em>Logical Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.LogicalClock
	 * @generated
	 */
	public Adapter createLogicalClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.DecisionVariable <em>Decision Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.DecisionVariable
	 * @generated
	 */
	public Adapter createDecisionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.ClockConstraint
	 * @generated
	 */
	public Adapter createClockConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.InstantiationConstraint <em>Instantiation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.InstantiationConstraint
	 * @generated
	 */
	public Adapter createInstantiationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.CostMetric <em>Cost Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.CostMetric
	 * @generated
	 */
	public Adapter createCostMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.PerformanceMetric <em>Performance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.PerformanceMetric
	 * @generated
	 */
	public Adapter createPerformanceMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.PlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.PlatformModel
	 * @generated
	 */
	public Adapter createPlatformModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.ApplicationModel <em>Application Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.ApplicationModel
	 * @generated
	 */
	public Adapter createApplicationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.BinaryRelation <em>Binary Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.BinaryRelation
	 * @generated
	 */
	public Adapter createBinaryRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.BindingModel <em>Binding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.BindingModel
	 * @generated
	 */
	public Adapter createBindingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tahmuras.DSEModel <em>DSE Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tahmuras.DSEModel
	 * @generated
	 */
	public Adapter createDSEModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TahmurasAdapterFactory
