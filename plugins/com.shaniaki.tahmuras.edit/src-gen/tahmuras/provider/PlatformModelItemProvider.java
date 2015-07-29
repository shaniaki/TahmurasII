/**
 */
package tahmuras.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tahmuras.PlatformModel;
import tahmuras.TahmurasFactory;
import tahmuras.TahmurasPackage;

/**
 * This is the item provider adapter for a {@link tahmuras.PlatformModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPlatformcomponentPropertyDescriptor(object);
			addCostmetricPropertyDescriptor(object);
			addConstraintPropertyDescriptor(object);
			addBinaryrelationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Platformcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlatformcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlatformModel_platformcomponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlatformModel_platformcomponent_feature", "_UI_PlatformModel_type"),
				 TahmurasPackage.Literals.PLATFORM_MODEL__PLATFORMCOMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Costmetric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostmetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlatformModel_costmetric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlatformModel_costmetric_feature", "_UI_PlatformModel_type"),
				 TahmurasPackage.Literals.PLATFORM_MODEL__COSTMETRIC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlatformModel_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlatformModel_constraint_feature", "_UI_PlatformModel_type"),
				 TahmurasPackage.Literals.PLATFORM_MODEL__CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Binaryrelation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBinaryrelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlatformModel_binaryrelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlatformModel_binaryrelation_feature", "_UI_PlatformModel_type"),
				 TahmurasPackage.Literals.PLATFORM_MODEL__BINARYRELATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TahmurasPackage.Literals.PLATFORM_MODEL__PLATFORMCOMPONENT);
			childrenFeatures.add(TahmurasPackage.Literals.PLATFORM_MODEL__COSTMETRIC);
			childrenFeatures.add(TahmurasPackage.Literals.PLATFORM_MODEL__CONSTRAINT);
			childrenFeatures.add(TahmurasPackage.Literals.PLATFORM_MODEL__BINARYRELATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PlatformModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlatformModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PlatformModel_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PlatformModel.class)) {
			case TahmurasPackage.PLATFORM_MODEL__PLATFORMCOMPONENT:
			case TahmurasPackage.PLATFORM_MODEL__COSTMETRIC:
			case TahmurasPackage.PLATFORM_MODEL__CONSTRAINT:
			case TahmurasPackage.PLATFORM_MODEL__BINARYRELATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.PLATFORM_MODEL__PLATFORMCOMPONENT,
				 TahmurasFactory.eINSTANCE.createPlatformComponent()));

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.PLATFORM_MODEL__COSTMETRIC,
				 TahmurasFactory.eINSTANCE.createCostMetric()));

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.PLATFORM_MODEL__CONSTRAINT,
				 TahmurasFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.PLATFORM_MODEL__CONSTRAINT,
				 TahmurasFactory.eINSTANCE.createInstantiationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.PLATFORM_MODEL__BINARYRELATION,
				 TahmurasFactory.eINSTANCE.createBinaryRelation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TahmurasEditPlugin.INSTANCE;
	}

}
