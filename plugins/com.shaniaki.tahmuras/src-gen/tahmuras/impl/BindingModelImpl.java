/**
 */
package tahmuras.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tahmuras.BinaryRelation;
import tahmuras.BindingModel;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.BindingModelImpl#getBinaryrelation <em>Binaryrelation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingModelImpl extends MinimalEObjectImpl.Container implements BindingModel {
	/**
	 * The cached value of the '{@link #getBinaryrelation() <em>Binaryrelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryrelation()
	 * @generated
	 * @ordered
	 */
	protected BinaryRelation binaryrelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.BINDING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelation getBinaryrelation() {
		return binaryrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryrelation(BinaryRelation newBinaryrelation, NotificationChain msgs) {
		BinaryRelation oldBinaryrelation = binaryrelation;
		binaryrelation = newBinaryrelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TahmurasPackage.BINDING_MODEL__BINARYRELATION, oldBinaryrelation, newBinaryrelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryrelation(BinaryRelation newBinaryrelation) {
		if (newBinaryrelation != binaryrelation) {
			NotificationChain msgs = null;
			if (binaryrelation != null)
				msgs = ((InternalEObject)binaryrelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.BINDING_MODEL__BINARYRELATION, null, msgs);
			if (newBinaryrelation != null)
				msgs = ((InternalEObject)newBinaryrelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.BINDING_MODEL__BINARYRELATION, null, msgs);
			msgs = basicSetBinaryrelation(newBinaryrelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.BINDING_MODEL__BINARYRELATION, newBinaryrelation, newBinaryrelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				return basicSetBinaryrelation(null, msgs);
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
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				return getBinaryrelation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				setBinaryrelation((BinaryRelation)newValue);
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
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				setBinaryrelation((BinaryRelation)null);
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
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				return binaryrelation != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingModelImpl
