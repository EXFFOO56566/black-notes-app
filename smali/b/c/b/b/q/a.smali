.class public Lb/c/b/b/q/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(II)I
    .locals 0

    invoke-static {p1, p0}, La/g/e/a;->b(II)I

    move-result p0

    return p0
.end method

.method public static a(IIF)I
    .locals 1

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {p1, p2}, La/g/e/a;->c(II)I

    move-result p1

    invoke-static {p0, p1}, Lb/c/b/b/q/a;->a(II)I

    move-result p0

    return p0
.end method

.method public static a(Landroid/content/Context;II)I
    .locals 0

    invoke-static {p0, p1}, Lb/c/b/b/w/b;->a(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object p0

    if-eqz p0, :cond_0

    iget p0, p0, Landroid/util/TypedValue;->data:I

    return p0

    :cond_0
    return p2
.end method

.method public static a(Landroid/content/Context;ILjava/lang/String;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lb/c/b/b/w/b;->a(Landroid/content/Context;ILjava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static a(Landroid/view/View;I)I
    .locals 0

    invoke-static {p0, p1}, Lb/c/b/b/w/b;->a(Landroid/view/View;I)I

    move-result p0

    return p0
.end method

.method public static a(Landroid/view/View;II)I
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lb/c/b/b/q/a;->a(Landroid/content/Context;II)I

    move-result p0

    return p0
.end method
