/**
 */
package tahmuras.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tahmuras.ApplicationComponent;
import tahmuras.ApplicationModel;
import tahmuras.BinaryRelation;
import tahmuras.Constraint;
import tahmuras.PerformanceMetric;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.ApplicationModelImpl#getApplicationcomponent <em>Applicationcomponent</em>}</li>
 *   <li>{@link tahmuras.impl.ApplicationModelImpl#getPerformancemetric <em>Performancemetric</em>}</li>
 *   <li>{@link tahmuras.impl.ApplicationModelImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tahmuras.impl.ApplicationModelImpl#getBinaryrelation <em>Binaryrelation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationModelImpl extends MinimalEObjectImpl.Container implements ApplicationModel {
	/**
	 * The cached value of the '{@link #getApplicationcomponent() <em>Applicationcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationComponent> applicationcomponent;

	/**
	 * The cached value of the '{@link #getPerformancemetric() <em>Performancemetric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformancemetric()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceMetric> performancemetric;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getBinaryrelation() <em>Binaryrelation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryrelation()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryRelation> binaryrelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.APPLICATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationComponent> getApplicationcomponent() {
		if (applicationcomponent == null) {
			applicationcomponent = new EObjectContainmentEList<ApplicationComponent>(ApplicationComponent.class, this, TahmurasPackage.APPLICATION_MODEL__APPLICATIONCOMPONENT);
		}
		return applicationcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformanceMetric> getPerformancemetric() {
		if (performancemetric == null) {
			performancemetric = new EObjectContainmentEList<PerformanceMetric>(PerformanceMetric.class, this, TahmurasPackage.APPLICATION_MODEL__PERFORMANCEMETRIC);
		}
		return performancemetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, TahmurasPackage.APPLICATION_MODEL__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryRelation> getBinaryrelation() {
		if (binaryrelation == null) {
			binaryrelation = new EObjectContainmentEList<BinaryRelation>(BinaryRelation.class, this, TahmurasPackage.APPLICATION_MODEL__BINARYRELATION);
		}
		return binaryrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TahmurasPackage.APPLICATION_MODEL__APPLICATIONCOMPONENT:
				return ((InternalEList<?>)getApplicationcomponent()).basicRemove(otherEnd, msgs);
			case TahmurasPackage.APPLICATION_MODEL__PERFORMANCEMETRIC:
				return ((InternalEList<?>)getPerformancemetric()).basicRemove(otherEnd, msgs);
			case TahmurasPackage.APPLICATION_MODEL__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case TahmurasPackage.APPLICATION_MODEL__BINARYRELATION:
				return ((InternalEList<?>)getBinaryrelation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TahmurasPackage.APPLICATION_MODEL__APPLICATIONCOMPONENT:
				return getApplicationcomponent();
			case TahmurasPackage.APPLICATION_MODEL__PERFORMANCEMETRIC:
				return getPerformancemetric();
			case TahmurasPackage.APPLICATION_MODEL__CONSTRAINT:
				return getConstraint();
			case TahmurasPackage.APPLICATION_MODEL__BINARYRELATION:
				return getBinaryrelation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TahmurasPackage.APPLICATION_MODEL__APPLICATIONCOMPONENT:
				getApplicationcomponent().clear();
				getApplicationcomponent().addAll((Collection<? extends ApplicationComponent>)newValue);
				return;
			case TahmurasPackage.APPLICATION_MODEL__PERFORMANCEMETRIC:
				getPerformancemetric().clear();
				getPerformancemetric().addAll((Collection<? extends PerformanceMetric>)newValue);
				return;
			case TahmurasPackage.APPLICATION_MODEL__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case TahmurasPackage.APPLICATION_MODEL__BINARYRELATION:
				getBinaryrelation().clear();
				getBinaryrelation().addAll((Collection<? extends BinaryRelation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TahmurasPackage.APPLICATION_MODEL__APPLICATIONCOMPONENT:
				getApplicationcomponent().clear();
				return;
			case TahmurasPackage.APPLICATION_MODEL__PERFORMANCEMETRIC:
				getPerformancemetric().clear();
				return;
			case TahmurasPackage.APPLICATION_MODEL__CONSTRAINT:
				getConstraint().clear();
				return;
			case TahmurasPackage.APPLICATION_MODEL__BINARYRELATION:
				getBinaryrelation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TahmurasPackage.APPLICATION_MODEL__APPLICATIONCOMPONENT:
				return applicationcomponent != null && !applicationcomponent.isEmpty();
			case TahmurasPackage.APPLICATION_MODEL__PERFORMANCEMETRIC:
				return performancemetric != null && !performancemetric.isEmpty();
			case TahmurasPackage.APPLICATION_MODEL__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case TahmurasPackage.APPLICATION_MODEL__BINARYRELATION:
				return binaryrelation != null && !binaryrelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationModelImpl
