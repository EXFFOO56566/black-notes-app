.class public Lcom/google/android/material/snackbar/d;
.super Landroid/widget/FrameLayout;
.source ""


# static fields
.field private static final g:Landroid/view/View$OnTouchListener;


# instance fields
.field private b:Lcom/google/android/material/snackbar/c;

.field private c:Lcom/google/android/material/snackbar/b;

.field private d:I

.field private final e:F

.field private final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/material/snackbar/d$a;

    invoke-direct {v0}, Lcom/google/android/material/snackbar/d$a;-><init>()V

    sput-object v0, Lcom/google/android/material/snackbar/d;->g:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/snackbar/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, v0}, Lcom/google/android/material/internal/g;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v1, Lb/c/b/b/k;->SnackbarLayout:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lb/c/b/b/k;->SnackbarLayout_elevation:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_0

    sget p2, Lb/c/b/b/k;->SnackbarLayout_elevation:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    invoke-static {p0, p2}, La/g/l/u;->a(Landroid/view/View;F)V

    :cond_0
    sget p2, Lb/c/b/b/k;->SnackbarLayout_animationMode:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/snackbar/d;->d:I

    sget p2, Lb/c/b/b/k;->SnackbarLayout_backgroundOverlayColorAlpha:I

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/google/android/material/snackbar/d;->e:F

    sget p2, Lb/c/b/b/k;->SnackbarLayout_actionTextColorAlpha:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/google/android/material/snackbar/d;->f:F

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    sget-object p1, Lcom/google/android/material/snackbar/d;->g:Landroid/view/View$OnTouchListener;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setFocusable(Z)V

    return-void
.end method


# virtual methods
.method getActionTextColorAlpha()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/snackbar/d;->f:F

    return v0
.end method

.method getAnimationMode()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/snackbar/d;->d:I

    return v0
.end method

.method getBackgroundOverlayColorAlpha()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/snackbar/d;->e:F

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/google/android/material/snackbar/d;->c:Lcom/google/android/material/snackbar/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/material/snackbar/b;->onViewAttachedToWindow(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, La/g/l/u;->H(Landroid/view/View;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/google/android/material/snackbar/d;->c:Lcom/google/android/material/snackbar/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/material/snackbar/b;->onViewDetachedFromWindow(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 6

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    iget-object v0, p0, Lcom/google/android/material/snackbar/d;->b:Lcom/google/android/material/snackbar/c;

    if-eqz v0, :cond_0

    move-object v1, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/material/snackbar/c;->a(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method

.method setAnimationMode(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/snackbar/d;->d:I

    return-void
.end method

.method setOnAttachStateChangeListener(Lcom/google/android/material/snackbar/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/snackbar/d;->c:Lcom/google/android/material/snackbar/b;

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/material/snackbar/d;->g:Landroid/view/View$OnTouchListener;

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method setOnLayoutChangeListener(Lcom/google/android/material/snackbar/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/snackbar/d;->b:Lcom/google/android/material/snackbar/c;

    return-void
.end method
