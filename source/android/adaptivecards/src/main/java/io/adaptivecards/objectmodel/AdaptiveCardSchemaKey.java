/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum AdaptiveCardSchemaKey {
  Accent(0),
  Action,
  ActionAlignment,
  ActionMode,
  ActionOrientation,
  ActionRole,
  ActionSet,
  ActionSetConfig,
  Actions,
  ActionsOrientation,
  AdaptiveCard,
  AllowCustomStyle,
  AllowInlinePlayback,
  AltText,
  Appearance,
  Name,
  AssociatedInputs,
  Attention,
  Authentication,
  BackgroundColor,
  BackgroundImage,
  BackgroundImageUrl,
  BaseCardElement,
  BaseContainerStyle,
  Bleed,
  Body,
  Bolder,
  BorderColor,
  Bottom,
  Badge,
  BadgeStyle,
  ButtonSpacing,
  Buttons,
  CaptionSources,
  Card,
  CellSpacing,
  Cells,
  Center,
  ChoiceSet,
  Choices,
  ChoicesData,
  ChoicesDataType,
  Color,
  ColorConfig,
  Column,
  ColumnHeader,
  ColumnSet,
  Columns,
  ConditionallyEnabled,
  ConnectionName,
  Container,
  ContainerStyles,
  BorderWidth,
  CornerRadius,
  Dark,
  Data,
  DataQuery,
  Dataset,
  DateInput,
  Default,
  DefaultPoster,
  Count,
  Description,
  ElementId,
  Emphasis,
  ErrorMessage,
  ExtraLarge,
  FactSet,
  Facts,
  Fallback,
  FallbackText,
  FillMode,
  FirstRowAsHeaders,
  FontFamily,
  FontSizes,
  FontType,
  FontTypes,
  FontWeights,
  ForegroundColor,
  ForegroundColors,
  Good,
  GridStyle,
  Heading,
  HeadingLevel,
  Height,
  Highlight,
  HighlightColor,
  HighlightColors,
  HorizontalAlignment,
  HorizontalCellContentAlignment,
  HostWidthBreakpoints,
  IconPlacement,
  IconSize,
  IconUrl,
  Id,
  Image,
  Icon,
  IconPosition,
  ImageBaseUrl,
  ImageSet,
  ImageSize,
  ImageSizes,
  Images,
  InlineAction,
  InlineTopMargin,
  Inlines,
  InputSpacing,
  Inputs,
  IsEnabled,
  IsMultiSelect,
  IsMultiline,
  ShowBorder,
  RoundedCorners,
  IsRequired,
  IsSelected,
  IsSubtle,
  IsVisible,
  Italic,
  Items,
  Label,
  Language,
  Large,
  Left,
  Light,
  Lighter,
  LineColor,
  LineThickness,
  Max,
  MaxActions,
  MaxImageHeight,
  MaxLength,
  MaxLines,
  MaxWidth,
  Media,
  Medium,
  MetaData,
  Method,
  MimeType,
  Min,
  MinHeight,
  Mode,
  Monospace,
  Narrow,
  NumberInput,
  RatingInput,
  RatingLabel,
  OptionalInputs,
  Padding,
  Placeholder,
  PlayButton,
  Poster,
  ProviderId,
  Refresh,
  Regex,
  Repeat,
  RepeatHorizontally,
  RepeatVertically,
  RequiredInputs,
  Requires,
  RichTextBlock,
  Right,
  Rows,
  Rtl,
  Schema,
  SelectAction,
  Separator,
  Shape,
  ShowActionMode,
  ShowCard,
  ShowCardActionConfig,
  ShowGridLines,
  Size,
  Small,
  Sources,
  Spacing,
  SpacingDefinition,
  Speak,
  Standard,
  Stretch,
  Strikethrough,
  Style,
  Subtle,
  Suffix,
  SupportsInteractivity,
  Table,
  TableCell,
  TableRow,
  TargetElements,
  Layout,
  ItemFit,
  RowSpacing,
  ColumnSpacing,
  ItemWidth,
  MinItemWidth,
  MaxItemWidth,
  HorizontalItemsAlignment,
  Row,
  RowSpan,
  ColumnSpan,
  AreaGridName,
  Areas,
  Layouts,
  TargetInputIds,
  TargetWidth,
  Text,
  TextBlock,
  TextConfig,
  TextInput,
  TextStyles,
  MarigoldColor,
  NeutralColor,
  FilledStar,
  EmptyStar,
  RatingTextColor,
  CountTextColor,
  TextWeight,
  Thickness,
  TimeInput,
  Title,
  ToggleInput,
  TokenExchangeResource,
  Tooltip,
  Top,
  Type,
  Underline,
  Uri,
  Url,
  UserIds,
  Value,
  ValueChangedAction,
  ValueChangedActionType,
  ValueOff,
  ValueOn,
  Verb,
  VeryNarrow,
  Version,
  VerticalAlignment,
  VerticalCellContentAlignment,
  VerticalContentAlignment,
  Warning,
  WebUrl,
  Weight,
  Width,
  Wrap,
  CompoundButton;

  public final int swigValue() {
    return swigValue;
  }

  public static AdaptiveCardSchemaKey swigToEnum(int swigValue) {
    AdaptiveCardSchemaKey[] swigValues = AdaptiveCardSchemaKey.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (AdaptiveCardSchemaKey swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + AdaptiveCardSchemaKey.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private AdaptiveCardSchemaKey() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private AdaptiveCardSchemaKey(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private AdaptiveCardSchemaKey(AdaptiveCardSchemaKey swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

