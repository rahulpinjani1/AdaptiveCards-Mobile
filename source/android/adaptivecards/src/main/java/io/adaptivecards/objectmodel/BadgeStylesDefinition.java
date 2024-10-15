/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class BadgeStylesDefinition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BadgeStylesDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BadgeStylesDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_BadgeStylesDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDefaultPalette(BadgeStyleDefinition value) {
    AdaptiveCardObjectModelJNI.BadgeStylesDefinition_defaultPalette_set(swigCPtr, this, BadgeStyleDefinition.getCPtr(value), value);
  }

  public BadgeStyleDefinition getDefaultPalette() {
    long cPtr = AdaptiveCardObjectModelJNI.BadgeStylesDefinition_defaultPalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BadgeStyleDefinition(cPtr, false);
  }

  public void setAccentPalette(BadgeStyleDefinition value) {
    AdaptiveCardObjectModelJNI.BadgeStylesDefinition_accentPalette_set(swigCPtr, this, BadgeStyleDefinition.getCPtr(value), value);
  }

  public BadgeStyleDefinition getAccentPalette() {
    long cPtr = AdaptiveCardObjectModelJNI.BadgeStylesDefinition_accentPalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BadgeStyleDefinition(cPtr, false);
  }

  public void setAttentionPalette(BadgeStyleDefinition value) {
    AdaptiveCardObjectModelJNI.BadgeStylesDefinition_attentionPalette_set(swigCPtr, this, BadgeStyleDefinition.getCPtr(value), value);
  }

  public BadgeStyleDefinition getAttentionPalette() {
    long cPtr = AdaptiveCardObjectModelJNI.BadgeStylesDefinition_attentionPalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BadgeStyleDefinition(cPtr, false);
  }

  public void setGoodPalette(BadgeStyleDefinition value) {
    AdaptiveCardObjectModelJNI.BadgeStylesDefinition_goodPalette_set(swigCPtr, this, BadgeStyleDefinition.getCPtr(value), value);
  }

  public BadgeStyleDefinition getGoodPalette() {
    long cPtr = AdaptiveCardObjectModelJNI.BadgeStylesDefinition_goodPalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BadgeStyleDefinition(cPtr, false);
  }

  public void setInformativePalette(BadgeStyleDefinition value) {
    AdaptiveCardObjectModelJNI.BadgeStylesDefinition_informativePalette_set(swigCPtr, this, BadgeStyleDefinition.getCPtr(value), value);
  }

  public BadgeStyleDefinition getInformativePalette() {
    long cPtr = AdaptiveCardObjectModelJNI.BadgeStylesDefinition_informativePalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BadgeStyleDefinition(cPtr, false);
  }

  public void setSubtlePalette(BadgeStyleDefinition value) {
    AdaptiveCardObjectModelJNI.BadgeStylesDefinition_subtlePalette_set(swigCPtr, this, BadgeStyleDefinition.getCPtr(value), value);
  }

  public BadgeStyleDefinition getSubtlePalette() {
    long cPtr = AdaptiveCardObjectModelJNI.BadgeStylesDefinition_subtlePalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BadgeStyleDefinition(cPtr, false);
  }

  public void setWarningPalette(BadgeStyleDefinition value) {
    AdaptiveCardObjectModelJNI.BadgeStylesDefinition_warningPalette_set(swigCPtr, this, BadgeStyleDefinition.getCPtr(value), value);
  }

  public BadgeStyleDefinition getWarningPalette() {
    long cPtr = AdaptiveCardObjectModelJNI.BadgeStylesDefinition_warningPalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BadgeStyleDefinition(cPtr, false);
  }

  public static BadgeStylesDefinition Deserialize(JsonValue json, BadgeStylesDefinition defaultValue) {
    return new BadgeStylesDefinition(AdaptiveCardObjectModelJNI.BadgeStylesDefinition_Deserialize(JsonValue.getCPtr(json), json, BadgeStylesDefinition.getCPtr(defaultValue), defaultValue), true);
  }

  public BadgeStylesDefinition() {
    this(AdaptiveCardObjectModelJNI.new_BadgeStylesDefinition(), true);
  }

}
