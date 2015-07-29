/**
 */
package tahmuras.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tahmuras.ApplicationComponent;
import tahmuras.PerformanceMetric;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.ApplicationComponentImpl#getPerformancemetric <em>Performancemetric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationComponentImpl extends ComponentImpl implements ApplicationComponent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.APPLICATION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformanceMetric> getPerformancemetric() {
		if (performancemetric == null) {
			performancemetric = new EObjectContainmentEList<PerformanceMetric>(PerformanceMetric.class, this, TahmurasPackage.APPLICATION_COMPONENT__PERFORMANCEMETRIC);
		}
		return performancemetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TahmurasPackage.APPLICATION_COMPONENT__PERFORMANCEMETRIC:
				return ((InternalEList<?>)getPerformancemetric()).basicRemove(otherEnd, msgs);
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
			case TahmurasPackage.APPLICATION_COMPONENT__PERFORMANCEMETRIC:
				return getPerformancemetric();
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
			case TahmurasPackage.APPLICATION_COMPONENT__PERFORMANCEMETRIC:
				getPerformancemetric().clear();
				getPerformancemetric().addAll((Collection<? extends PerformanceMetric>)newValue);
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
			case TahmurasPackage.APPLICATION_COMPONENT__PERFORMANCEMETRIC:
				getPerformancemetric().clear();
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
			case TahmurasPackage.APPLICATION_COMPONENT__PERFORMANCEMETRIC:
				return performancemetric != null && !performancemetric.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationComponentImpl
