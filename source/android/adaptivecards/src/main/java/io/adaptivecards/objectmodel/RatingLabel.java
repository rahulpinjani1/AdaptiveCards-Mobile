/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class RatingLabel extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected RatingLabel(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.RatingLabel_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RatingLabel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_RatingLabel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RatingLabel() {
    this(AdaptiveCardObjectModelJNI.new_RatingLabel__SWIG_0(), true);
  }

  public RatingLabel(RatingLabel arg0) {
    this(AdaptiveCardObjectModelJNI.new_RatingLabel__SWIG_1(RatingLabel.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.RatingLabel_SerializeToJsonValue(swigCPtr, this), true);
  }

  public @androidx.annotation.Nullable HorizontalAlignment GetHorizontalAlignment() {
    StdOptionalHorizontalAlignment optvalue = new StdOptionalHorizontalAlignment(AdaptiveCardObjectModelJNI.RatingLabel_GetHorizontalAlignment(swigCPtr, this), false);
    return optvalue.has_value() ? optvalue.value() : null;
  }

  public void SetHorizontalAlignment(@androidx.annotation.Nullable HorizontalAlignment value) {
    StdOptionalHorizontalAlignment optvalue = (value == null) ? new StdOptionalHorizontalAlignment() : new StdOptionalHorizontalAlignment(value);
    {
      AdaptiveCardObjectModelJNI.RatingLabel_SetHorizontalAlignment(swigCPtr, this, StdOptionalHorizontalAlignment.getCPtr(optvalue), optvalue);
    }
  }

  public double GetValue() {
    return AdaptiveCardObjectModelJNI.RatingLabel_GetValue(swigCPtr, this);
  }

  public void SetValue(double value) {
    AdaptiveCardObjectModelJNI.RatingLabel_SetValue(swigCPtr, this, value);
  }

  public double GetMax() {
    return AdaptiveCardObjectModelJNI.RatingLabel_GetMax(swigCPtr, this);
  }

  public void SetMax(double value) {
    AdaptiveCardObjectModelJNI.RatingLabel_SetMax(swigCPtr, this, value);
  }

  public RatingSize GetRatingSize() {
    return RatingSize.swigToEnum(AdaptiveCardObjectModelJNI.RatingLabel_GetRatingSize(swigCPtr, this));
  }

  public void SetRatingSize(RatingSize value) {
    AdaptiveCardObjectModelJNI.RatingLabel_SetRatingSize(swigCPtr, this, value.swigValue());
  }

  public RatingColor GetRatingColor() {
    return RatingColor.swigToEnum(AdaptiveCardObjectModelJNI.RatingLabel_GetRatingColor(swigCPtr, this));
  }

  public void SetRatingColor(RatingColor value) {
    AdaptiveCardObjectModelJNI.RatingLabel_SetRatingColor(swigCPtr, this, value.swigValue());
  }

  public RatingStyle GetRatingStyle() {
    return RatingStyle.swigToEnum(AdaptiveCardObjectModelJNI.RatingLabel_GetRatingStyle(swigCPtr, this));
  }

  public void SetRatingStyle(RatingStyle value) {
    AdaptiveCardObjectModelJNI.RatingLabel_SetRatingStyle(swigCPtr, this, value.swigValue());
  }

  public @androidx.annotation.Nullable Long GetCount() {
    StdOptionalLong optvalue = new StdOptionalLong(AdaptiveCardObjectModelJNI.RatingLabel_GetCount(swigCPtr, this), false);
    return optvalue.has_value() ? optvalue.value() : null;
  }

  public void SetCount(@androidx.annotation.Nullable Long value) {
    StdOptionalLong optvalue = (value == null) ? new StdOptionalLong() : new StdOptionalLong(value);
    {
      AdaptiveCardObjectModelJNI.RatingLabel_SetCount(swigCPtr, this, StdOptionalLong.getCPtr(optvalue), optvalue);
    }
  }

  public static RatingLabel dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.RatingLabel_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new RatingLabel(cPtr, true);
  }

}
