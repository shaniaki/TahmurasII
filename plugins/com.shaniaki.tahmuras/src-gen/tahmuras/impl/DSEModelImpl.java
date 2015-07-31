/**
 */
package tahmuras.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tahmuras.ApplicationModel;
import tahmuras.BindingModel;
import tahmuras.DSEModel;
import tahmuras.PlatformModel;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSE Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.DSEModelImpl#getBindingmodel <em>Bindingmodel</em>}</li>
 *   <li>{@link tahmuras.impl.DSEModelImpl#getPlatformmodel <em>Platformmodel</em>}</li>
 *   <li>{@link tahmuras.impl.DSEModelImpl#getApplicationmodel <em>Applicationmodel</em>}</li>
 *   <li>{@link tahmuras.impl.DSEModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSEModelImpl extends MinimalEObjectImpl.Container implements DSEModel {
	/**
	 * The cached value of the '{@link #getBindingmodel() <em>Bindingmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingmodel()
	 * @generated
	 * @ordered
	 */
	protected BindingModel bindingmodel;

	/**
	 * The cached value of the '{@link #getPlatformmodel() <em>Platformmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformmodel()
	 * @generated
	 * @ordered
	 */
	protected PlatformModel platformmodel;

	/**
	 * The cached value of the '{@link #getApplicationmodel() <em>Applicationmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationmodel()
	 * @generated
	 * @ordered
	 */
	protected ApplicationModel applicationmodel;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSEModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.DSE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingModel getBindingmodel() {
		return bindingmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingmodel(BindingModel newBindingmodel, NotificationChain msgs) {
		BindingModel oldBindingmodel = bindingmodel;
		bindingmodel = newBindingmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TahmurasPackage.DSE_MODEL__BINDINGMODEL, oldBindingmodel, newBindingmodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingmodel(BindingModel newBindingmodel) {
		if (newBindingmodel != bindingmodel) {
			NotificationChain msgs = null;
			if (bindingmodel != null)
				msgs = ((InternalEObject)bindingmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.DSE_MODEL__BINDINGMODEL, null, msgs);
			if (newBindingmodel != null)
				msgs = ((InternalEObject)newBindingmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.DSE_MODEL__BINDINGMODEL, null, msgs);
			msgs = basicSetBindingmodel(newBindingmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.DSE_MODEL__BINDINGMODEL, newBindingmodel, newBindingmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel getPlatformmodel() {
		return platformmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatformmodel(PlatformModel newPlatformmodel, NotificationChain msgs) {
		PlatformModel oldPlatformmodel = platformmodel;
		platformmodel = newPlatformmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TahmurasPackage.DSE_MODEL__PLATFORMMODEL, oldPlatformmodel, newPlatformmodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformmodel(PlatformModel newPlatformmodel) {
		if (newPlatformmodel != platformmodel) {
			NotificationChain msgs = null;
			if (platformmodel != null)
				msgs = ((InternalEObject)platformmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.DSE_MODEL__PLATFORMMODEL, null, msgs);
			if (newPlatformmodel != null)
				msgs = ((InternalEObject)newPlatformmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.DSE_MODEL__PLATFORMMODEL, null, msgs);
			msgs = basicSetPlatformmodel(newPlatformmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.DSE_MODEL__PLATFORMMODEL, newPlatformmodel, newPlatformmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationModel getApplicationmodel() {
		return applicationmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationmodel(ApplicationModel newApplicationmodel, NotificationChain msgs) {
		ApplicationModel oldApplicationmodel = applicationmodel;
		applicationmodel = newApplicationmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TahmurasPackage.DSE_MODEL__APPLICATIONMODEL, oldApplicationmodel, newApplicationmodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationmodel(ApplicationModel newApplicationmodel) {
		if (newApplicationmodel != applicationmodel) {
			NotificationChain msgs = null;
			if (applicationmodel != null)
				msgs = ((InternalEObject)applicationmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.DSE_MODEL__APPLICATIONMODEL, null, msgs);
			if (newApplicationmodel != null)
				msgs = ((InternalEObject)newApplicationmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.DSE_MODEL__APPLICATIONMODEL, null, msgs);
			msgs = basicSetApplicationmodel(newApplicationmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.DSE_MODEL__APPLICATIONMODEL, newApplicationmodel, newApplicationmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.DSE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TahmurasPackage.DSE_MODEL__BINDINGMODEL:
				return basicSetBindingmodel(null, msgs);
			case TahmurasPackage.DSE_MODEL__PLATFORMMODEL:
				return basicSetPlatformmodel(null, msgs);
			case TahmurasPackage.DSE_MODEL__APPLICATIONMODEL:
				return basicSetApplicationmodel(null, msgs);
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
			case TahmurasPackage.DSE_MODEL__BINDINGMODEL:
				return getBindingmodel();
			case TahmurasPackage.DSE_MODEL__PLATFORMMODEL:
				return getPlatformmodel();
			case TahmurasPackage.DSE_MODEL__APPLICATIONMODEL:
				return getApplicationmodel();
			case TahmurasPackage.DSE_MODEL__NAME:
				return getName();
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
			case TahmurasPackage.DSE_MODEL__BINDINGMODEL:
				setBindingmodel((BindingModel)newValue);
				return;
			case TahmurasPackage.DSE_MODEL__PLATFORMMODEL:
				setPlatformmodel((PlatformModel)newValue);
				return;
			case TahmurasPackage.DSE_MODEL__APPLICATIONMODEL:
				setApplicationmodel((ApplicationModel)newValue);
				return;
			case TahmurasPackage.DSE_MODEL__NAME:
				setName((String)newValue);
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
			case TahmurasPackage.DSE_MODEL__BINDINGMODEL:
				setBindingmodel((BindingModel)null);
				return;
			case TahmurasPackage.DSE_MODEL__PLATFORMMODEL:
				setPlatformmodel((PlatformModel)null);
				return;
			case TahmurasPackage.DSE_MODEL__APPLICATIONMODEL:
				setApplicationmodel((ApplicationModel)null);
				return;
			case TahmurasPackage.DSE_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case TahmurasPackage.DSE_MODEL__BINDINGMODEL:
				return bindingmodel != null;
			case TahmurasPackage.DSE_MODEL__PLATFORMMODEL:
				return platformmodel != null;
			case TahmurasPackage.DSE_MODEL__APPLICATIONMODEL:
				return applicationmodel != null;
			case TahmurasPackage.DSE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DSEModelImpl
