.class public Lb/c/b/b/v/a;
.super Landroidx/appcompat/widget/s;
.source ""


# static fields
.field private static final g:I

.field private static final h:[[I


# instance fields
.field private e:Landroid/content/res/ColorStateList;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Lb/c/b/b/j;->Widget_MaterialComponents_CompoundButton_RadioButton:I

    sput v0, Lb/c/b/b/v/a;->g:I

    const/4 v0, 0x4

    new-array v0, v0, [[I

    const/4 v1, 0x2

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    aput-object v2, v0, v3

    new-array v2, v1, [I

    fill-array-data v2, :array_1

    const/4 v3, 0x1

    aput-object v2, v0, v3

    new-array v2, v1, [I

    fill-array-data v2, :array_2

    aput-object v2, v0, v1

    new-array v1, v1, [I

    fill-array-data v1, :array_3

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lb/c/b/b/v/a;->h:[[I

    return-void

    :array_0
    .array-data 4
        0x101009e
        0x10100a0
    .end array-data

    :array_1
    .array-data 4
        0x101009e
        -0x10100a0
    .end array-data

    :array_2
    .array-data 4
        -0x101009e
        0x10100a0
    .end array-data

    :array_3
    .array-data 4
        -0x101009e
        -0x10100a0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lb/c/b/b/b;->radioButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lb/c/b/b/v/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    sget v0, Lb/c/b/b/v/a;->g:I

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/material/internal/g;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/s;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/RadioButton;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lb/c/b/b/k;->MaterialRadioButton:[I

    sget v4, Lb/c/b/b/v/a;->g:I

    const/4 p1, 0x0

    new-array v5, p1, [I

    move-object v1, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, Lcom/google/android/material/internal/g;->c(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, Lb/c/b/b/k;->MaterialRadioButton_useMaterialThemeColors:I

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lb/c/b/b/v/a;->f:Z

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;
    .locals 6

    iget-object v0, p0, Lb/c/b/b/v/a;->e:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    sget v0, Lb/c/b/b/b;->colorControlActivated:I

    invoke-static {p0, v0}, Lb/c/b/b/q/a;->a(Landroid/view/View;I)I

    move-result v0

    sget v1, Lb/c/b/b/b;->colorOnSurface:I

    invoke-static {p0, v1}, Lb/c/b/b/q/a;->a(Landroid/view/View;I)I

    move-result v1

    sget v2, Lb/c/b/b/b;->colorSurface:I

    invoke-static {p0, v2}, Lb/c/b/b/q/a;->a(Landroid/view/View;I)I

    move-result v2

    sget-object v3, Lb/c/b/b/v/a;->h:[[I

    array-length v3, v3

    new-array v3, v3, [I

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v2, v0, v5}, Lb/c/b/b/q/a;->a(IIF)I

    move-result v0

    aput v0, v3, v4

    const/4 v0, 0x1

    const v4, 0x3f0a3d71    # 0.54f

    invoke-static {v2, v1, v4}, Lb/c/b/b/q/a;->a(IIF)I

    move-result v4

    aput v4, v3, v0

    const/4 v0, 0x2

    const v4, 0x3ec28f5c    # 0.38f

    invoke-static {v2, v1, v4}, Lb/c/b/b/q/a;->a(IIF)I

    move-result v5

    aput v5, v3, v0

    const/4 v0, 0x3

    invoke-static {v2, v1, v4}, Lb/c/b/b/q/a;->a(IIF)I

    move-result v1

    aput v1, v3, v0

    new-instance v0, Landroid/content/res/ColorStateList;

    sget-object v1, Lb/c/b/b/v/a;->h:[[I

    invoke-direct {v0, v1, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v0, p0, Lb/c/b/b/v/a;->e:Landroid/content/res/ColorStateList;

    :cond_0
    iget-object v0, p0, Lb/c/b/b/v/a;->e:Landroid/content/res/ColorStateList;

    return-object v0
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/RadioButton;->onAttachedToWindow()V

    iget-boolean v0, p0, Lb/c/b/b/v/a;->f:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/core/widget/c;->b(Landroid/widget/CompoundButton;)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lb/c/b/b/v/a;->setUseMaterialThemeColors(Z)V

    :cond_0
    return-void
.end method

.method public setUseMaterialThemeColors(Z)V
    .locals 0

    iput-boolean p1, p0, Lb/c/b/b/v/a;->f:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lb/c/b/b/v/a;->getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, Landroidx/core/widget/c;->a(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method
