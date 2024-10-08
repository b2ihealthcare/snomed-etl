/**
 * Copyright 2020-2022 B2i Healthcare, https://b2ihealthcare.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.snomed.etl.etl.impl;

import com.b2international.snomed.etl.etl.EtlPackage;
import com.b2international.snomed.etl.etl.SlotIntegerMaximumValue;
import com.b2international.snomed.etl.etl.SlotIntegerMinimumValue;
import com.b2international.snomed.etl.etl.SlotIntegerRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Integer Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.etl.etl.impl.SlotIntegerRangeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link com.b2international.snomed.etl.etl.impl.SlotIntegerRangeImpl#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotIntegerRangeImpl extends SlotIntegerImpl implements SlotIntegerRange
{
  /**
   * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimum()
   * @generated
   * @ordered
   */
  protected SlotIntegerMinimumValue minimum;

  /**
   * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximum()
   * @generated
   * @ordered
   */
  protected SlotIntegerMaximumValue maximum;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlotIntegerRangeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EtlPackage.Literals.SLOT_INTEGER_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlotIntegerMinimumValue getMinimum()
  {
    return minimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinimum(SlotIntegerMinimumValue newMinimum, NotificationChain msgs)
  {
    SlotIntegerMinimumValue oldMinimum = minimum;
    minimum = newMinimum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlPackage.SLOT_INTEGER_RANGE__MINIMUM, oldMinimum, newMinimum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinimum(SlotIntegerMinimumValue newMinimum)
  {
    if (newMinimum != minimum)
    {
      NotificationChain msgs = null;
      if (minimum != null)
        msgs = ((InternalEObject)minimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlPackage.SLOT_INTEGER_RANGE__MINIMUM, null, msgs);
      if (newMinimum != null)
        msgs = ((InternalEObject)newMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlPackage.SLOT_INTEGER_RANGE__MINIMUM, null, msgs);
      msgs = basicSetMinimum(newMinimum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EtlPackage.SLOT_INTEGER_RANGE__MINIMUM, newMinimum, newMinimum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlotIntegerMaximumValue getMaximum()
  {
    return maximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaximum(SlotIntegerMaximumValue newMaximum, NotificationChain msgs)
  {
    SlotIntegerMaximumValue oldMaximum = maximum;
    maximum = newMaximum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM, oldMaximum, newMaximum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaximum(SlotIntegerMaximumValue newMaximum)
  {
    if (newMaximum != maximum)
    {
      NotificationChain msgs = null;
      if (maximum != null)
        msgs = ((InternalEObject)maximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM, null, msgs);
      if (newMaximum != null)
        msgs = ((InternalEObject)newMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM, null, msgs);
      msgs = basicSetMaximum(newMaximum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM, newMaximum, newMaximum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EtlPackage.SLOT_INTEGER_RANGE__MINIMUM:
        return basicSetMinimum(null, msgs);
      case EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM:
        return basicSetMaximum(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EtlPackage.SLOT_INTEGER_RANGE__MINIMUM:
        return getMinimum();
      case EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM:
        return getMaximum();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EtlPackage.SLOT_INTEGER_RANGE__MINIMUM:
        setMinimum((SlotIntegerMinimumValue)newValue);
        return;
      case EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM:
        setMaximum((SlotIntegerMaximumValue)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EtlPackage.SLOT_INTEGER_RANGE__MINIMUM:
        setMinimum((SlotIntegerMinimumValue)null);
        return;
      case EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM:
        setMaximum((SlotIntegerMaximumValue)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EtlPackage.SLOT_INTEGER_RANGE__MINIMUM:
        return minimum != null;
      case EtlPackage.SLOT_INTEGER_RANGE__MAXIMUM:
        return maximum != null;
    }
    return super.eIsSet(featureID);
  }

} //SlotIntegerRangeImpl
