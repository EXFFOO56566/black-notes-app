.class Landroidx/appcompat/widget/y;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/y$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/widget/TextView;

.field private b:Landroidx/appcompat/widget/u0;

.field private c:Landroidx/appcompat/widget/u0;

.field private d:Landroidx/appcompat/widget/u0;

.field private e:Landroidx/appcompat/widget/u0;

.field private f:Landroidx/appcompat/widget/u0;

.field private g:Landroidx/appcompat/widget/u0;

.field private h:Landroidx/appcompat/widget/u0;

.field private final i:Landroidx/appcompat/widget/a0;

.field private j:I

.field private k:I

.field private l:Landroid/graphics/Typeface;

.field private m:Z


# direct methods
.method constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/widget/y;->j:I

    const/4 v0, -0x1

    iput v0, p0, Landroidx/appcompat/widget/y;->k:I

    iput-object p1, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    new-instance p1, Landroidx/appcompat/widget/a0;

    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-direct {p1, v0}, Landroidx/appcompat/widget/a0;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    return-void
.end method

.method private static a(Landroid/content/Context;Landroidx/appcompat/widget/j;I)Landroidx/appcompat/widget/u0;
    .locals 0

    invoke-virtual {p1, p0, p2}, Landroidx/appcompat/widget/j;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Landroidx/appcompat/widget/u0;

    invoke-direct {p1}, Landroidx/appcompat/widget/u0;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Landroidx/appcompat/widget/u0;->d:Z

    iput-object p0, p1, Landroidx/appcompat/widget/u0;->a:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private a(Landroid/content/Context;Landroidx/appcompat/widget/w0;)V
    .locals 8

    sget v0, La/a/j;->TextAppearance_android_textStyle:I

    iget v1, p0, Landroidx/appcompat/widget/y;->j:I

    invoke-virtual {p2, v0, v1}, Landroidx/appcompat/widget/w0;->d(II)I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/y;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-lt v0, v1, :cond_0

    sget v0, La/a/j;->TextAppearance_android_textFontWeight:I

    invoke-virtual {p2, v0, v3}, Landroidx/appcompat/widget/w0;->d(II)I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/y;->k:I

    if-eq v0, v3, :cond_0

    iget v0, p0, Landroidx/appcompat/widget/y;->j:I

    and-int/2addr v0, v2

    or-int/2addr v0, v4

    iput v0, p0, Landroidx/appcompat/widget/y;->j:I

    :cond_0
    sget v0, La/a/j;->TextAppearance_android_fontFamily:I

    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v0

    const/4 v5, 0x1

    if-nez v0, :cond_6

    sget v0, La/a/j;->TextAppearance_fontFamily:I

    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    sget p1, La/a/j;->TextAppearance_android_typeface:I

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v4, p0, Landroidx/appcompat/widget/y;->m:Z

    sget p1, La/a/j;->TextAppearance_android_typeface:I

    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/w0;->d(II)I

    move-result p1

    if-eq p1, v5, :cond_4

    if-eq p1, v2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :goto_0
    iput-object p1, p0, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_1
    return-void

    :cond_6
    :goto_2
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    sget v0, La/a/j;->TextAppearance_fontFamily:I

    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v0

    if-eqz v0, :cond_7

    sget v0, La/a/j;->TextAppearance_fontFamily:I

    goto :goto_3

    :cond_7
    sget v0, La/a/j;->TextAppearance_android_fontFamily:I

    :goto_3
    iget v6, p0, Landroidx/appcompat/widget/y;->k:I

    iget v7, p0, Landroidx/appcompat/widget/y;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Landroidx/appcompat/widget/y$a;

    invoke-direct {p1, p0, v6, v7}, Landroidx/appcompat/widget/y$a;-><init>(Landroidx/appcompat/widget/y;II)V

    :try_start_0
    iget v6, p0, Landroidx/appcompat/widget/y;->j:I

    invoke-virtual {p2, v0, v6, p1}, Landroidx/appcompat/widget/w0;->a(IILa/g/d/c/f$a;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v1, :cond_9

    iget v6, p0, Landroidx/appcompat/widget/y;->k:I

    if-eq v6, v3, :cond_9

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v6, p0, Landroidx/appcompat/widget/y;->k:I

    iget v7, p0, Landroidx/appcompat/widget/y;->j:I

    and-int/2addr v7, v2

    if-eqz v7, :cond_8

    const/4 v7, 0x1

    goto :goto_4

    :cond_8
    const/4 v7, 0x0

    :goto_4
    invoke-static {p1, v6, v7}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_9
    iput-object p1, p0, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    :cond_a
    iget-object p1, p0, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    const/4 p1, 0x1

    goto :goto_5

    :cond_b
    const/4 p1, 0x0

    :goto_5
    iput-boolean p1, p0, Landroidx/appcompat/widget/y;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    nop

    :cond_c
    :goto_6
    iget-object p1, p0, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/w0;->d(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v1, :cond_e

    iget p2, p0, Landroidx/appcompat/widget/y;->k:I

    if-eq p2, v3, :cond_e

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Landroidx/appcompat/widget/y;->k:I

    iget v0, p0, Landroidx/appcompat/widget/y;->j:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_d

    const/4 v4, 0x1

    :cond_d
    invoke-static {p1, p2, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_7

    :cond_e
    iget p2, p0, Landroidx/appcompat/widget/y;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_7
    iput-object p1, p0, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    :cond_f
    return-void
.end method

.method private a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-lt v0, v1, :cond_5

    if-nez p5, :cond_0

    if-eqz p6, :cond_5

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object p3, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    if-eqz p5, :cond_1

    goto :goto_0

    :cond_1
    aget-object p5, p1, v5

    :goto_0
    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    aget-object p2, p1, v3

    :goto_1
    if-eqz p6, :cond_3

    goto :goto_2

    :cond_3
    aget-object p6, p1, v4

    :goto_2
    if-eqz p4, :cond_4

    goto :goto_3

    :cond_4
    aget-object p4, p1, v2

    :goto_3
    invoke-virtual {p3, p5, p2, p6, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_a

    :cond_5
    if-nez p1, :cond_6

    if-nez p2, :cond_6

    if-nez p3, :cond_6

    if-eqz p4, :cond_f

    :cond_6
    sget p5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p5, v1, :cond_a

    iget-object p5, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    aget-object p6, p5, v5

    if-nez p6, :cond_7

    aget-object p6, p5, v4

    if-eqz p6, :cond_a

    :cond_7
    iget-object p1, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    aget-object p3, p5, v5

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    aget-object p2, p5, v3

    :goto_4
    aget-object p6, p5, v4

    if-eqz p4, :cond_9

    goto :goto_5

    :cond_9
    aget-object p4, p5, v2

    :goto_5
    invoke-virtual {p1, p3, p2, p6, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_a
    iget-object p5, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    iget-object p6, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    if-eqz p1, :cond_b

    goto :goto_6

    :cond_b
    aget-object p1, p5, v5

    :goto_6
    if-eqz p2, :cond_c

    goto :goto_7

    :cond_c
    aget-object p2, p5, v3

    :goto_7
    if-eqz p3, :cond_d

    goto :goto_8

    :cond_d
    aget-object p3, p5, v4

    :goto_8
    if-eqz p4, :cond_e

    goto :goto_9

    :cond_e
    aget-object p4, p5, v2

    :goto_9
    invoke-virtual {p6, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_f
    :goto_a
    return-void
.end method

.method private a(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/u0;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Landroidx/appcompat/widget/j;->a(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/u0;[I)V

    :cond_0
    return-void
.end method

.method private b(IF)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/a0;->a(IF)V

    return-void
.end method

.method private l()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    iput-object v0, p0, Landroidx/appcompat/widget/y;->b:Landroidx/appcompat/widget/u0;

    iput-object v0, p0, Landroidx/appcompat/widget/y;->c:Landroidx/appcompat/widget/u0;

    iput-object v0, p0, Landroidx/appcompat/widget/y;->d:Landroidx/appcompat/widget/u0;

    iput-object v0, p0, Landroidx/appcompat/widget/y;->e:Landroidx/appcompat/widget/u0;

    iput-object v0, p0, Landroidx/appcompat/widget/y;->f:Landroidx/appcompat/widget/u0;

    iput-object v0, p0, Landroidx/appcompat/widget/y;->g:Landroidx/appcompat/widget/u0;

    return-void
.end method


# virtual methods
.method a()V
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/y;->b:Landroidx/appcompat/widget/u0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/y;->c:Landroidx/appcompat/widget/u0;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/y;->d:Landroidx/appcompat/widget/u0;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/y;->e:Landroidx/appcompat/widget/u0;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, Landroidx/appcompat/widget/y;->b:Landroidx/appcompat/widget/u0;

    invoke-direct {p0, v3, v4}, Landroidx/appcompat/widget/y;->a(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/u0;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, Landroidx/appcompat/widget/y;->c:Landroidx/appcompat/widget/u0;

    invoke-direct {p0, v3, v4}, Landroidx/appcompat/widget/y;->a(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/u0;)V

    aget-object v3, v0, v1

    iget-object v4, p0, Landroidx/appcompat/widget/y;->d:Landroidx/appcompat/widget/u0;

    invoke-direct {p0, v3, v4}, Landroidx/appcompat/widget/y;->a(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/u0;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, Landroidx/appcompat/widget/y;->e:Landroidx/appcompat/widget/u0;

    invoke-direct {p0, v0, v3}, Landroidx/appcompat/widget/y;->a(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/u0;)V

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v0, v3, :cond_3

    iget-object v0, p0, Landroidx/appcompat/widget/y;->f:Landroidx/appcompat/widget/u0;

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/widget/y;->g:Landroidx/appcompat/widget/u0;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Landroidx/appcompat/widget/y;->f:Landroidx/appcompat/widget/u0;

    invoke-direct {p0, v2, v3}, Landroidx/appcompat/widget/y;->a(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/u0;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Landroidx/appcompat/widget/y;->g:Landroidx/appcompat/widget/u0;

    invoke-direct {p0, v0, v1}, Landroidx/appcompat/widget/y;->a(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/u0;)V

    :cond_3
    return-void
.end method

.method a(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/a0;->b(I)V

    return-void
.end method

.method a(IF)V
    .locals 1

    sget-boolean v0, Landroidx/core/widget/b;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/y;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/y;->b(IF)V

    :cond_0
    return-void
.end method

.method a(IIII)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/appcompat/widget/a0;->a(IIII)V

    return-void
.end method

.method a(Landroid/content/Context;I)V
    .locals 3

    sget-object v0, La/a/j;->TextAppearance:[I

    invoke-static {p1, p2, v0}, Landroidx/appcompat/widget/w0;->a(Landroid/content/Context;I[I)Landroidx/appcompat/widget/w0;

    move-result-object p2

    sget v0, La/a/j;->TextAppearance_textAllCaps:I

    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget v0, La/a/j;->TextAppearance_textAllCaps:I

    invoke-virtual {p2, v0, v1}, Landroidx/appcompat/widget/w0;->a(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/y;->a(Z)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v0, v2, :cond_1

    sget v0, La/a/j;->TextAppearance_android_textColor:I

    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, La/a/j;->TextAppearance_android_textColor:I

    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/w0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1
    sget v0, La/a/j;->TextAppearance_android_textSize:I

    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, La/a/j;->TextAppearance_android_textSize:I

    const/4 v2, -0x1

    invoke-virtual {p2, v0, v2}, Landroidx/appcompat/widget/w0;->c(II)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_2
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/w0;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_3

    sget p1, La/a/j;->TextAppearance_fontVariationSettings:I

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result p1

    if-eqz p1, :cond_3

    sget p1, La/a/j;->TextAppearance_fontVariationSettings:I

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/w0;->d(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    :cond_3
    invoke-virtual {p2}, Landroidx/appcompat/widget/w0;->a()V

    iget-object p1, p0, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_4

    iget-object p2, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    iget v0, p0, Landroidx/appcompat/widget/y;->j:I

    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_4
    return-void
.end method

.method a(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/u0;

    invoke-direct {v0}, Landroidx/appcompat/widget/u0;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    iput-object p1, v0, Landroidx/appcompat/widget/u0;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Landroidx/appcompat/widget/u0;->d:Z

    invoke-direct {p0}, Landroidx/appcompat/widget/y;->l()V

    return-void
.end method

.method a(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/u0;

    invoke-direct {v0}, Landroidx/appcompat/widget/u0;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    iput-object p1, v0, Landroidx/appcompat/widget/u0;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Landroidx/appcompat/widget/u0;->c:Z

    invoke-direct {p0}, Landroidx/appcompat/widget/y;->l()V

    return-void
.end method

.method public a(Landroid/graphics/Typeface;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/y;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iput-object p1, p0, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    :cond_0
    return-void
.end method

.method a(Landroid/util/AttributeSet;I)V
    .locals 17
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move/from16 v1, p2

    iget-object v2, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {}, Landroidx/appcompat/widget/j;->b()Landroidx/appcompat/widget/j;

    move-result-object v3

    sget-object v4, La/a/j;->AppCompatTextHelper:[I

    const/4 v5, 0x0

    invoke-static {v2, v0, v4, v1, v5}, Landroidx/appcompat/widget/w0;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/w0;

    move-result-object v4

    sget v6, La/a/j;->AppCompatTextHelper_android_textAppearance:I

    const/4 v8, -0x1

    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v6

    sget v9, La/a/j;->AppCompatTextHelper_android_drawableLeft:I

    invoke-virtual {v4, v9}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v9

    if-eqz v9, :cond_0

    sget v9, La/a/j;->AppCompatTextHelper_android_drawableLeft:I

    invoke-virtual {v4, v9, v5}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v9

    invoke-static {v2, v3, v9}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/j;I)Landroidx/appcompat/widget/u0;

    move-result-object v9

    iput-object v9, v7, Landroidx/appcompat/widget/y;->b:Landroidx/appcompat/widget/u0;

    :cond_0
    sget v9, La/a/j;->AppCompatTextHelper_android_drawableTop:I

    invoke-virtual {v4, v9}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v9

    if-eqz v9, :cond_1

    sget v9, La/a/j;->AppCompatTextHelper_android_drawableTop:I

    invoke-virtual {v4, v9, v5}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v9

    invoke-static {v2, v3, v9}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/j;I)Landroidx/appcompat/widget/u0;

    move-result-object v9

    iput-object v9, v7, Landroidx/appcompat/widget/y;->c:Landroidx/appcompat/widget/u0;

    :cond_1
    sget v9, La/a/j;->AppCompatTextHelper_android_drawableRight:I

    invoke-virtual {v4, v9}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v9

    if-eqz v9, :cond_2

    sget v9, La/a/j;->AppCompatTextHelper_android_drawableRight:I

    invoke-virtual {v4, v9, v5}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v9

    invoke-static {v2, v3, v9}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/j;I)Landroidx/appcompat/widget/u0;

    move-result-object v9

    iput-object v9, v7, Landroidx/appcompat/widget/y;->d:Landroidx/appcompat/widget/u0;

    :cond_2
    sget v9, La/a/j;->AppCompatTextHelper_android_drawableBottom:I

    invoke-virtual {v4, v9}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v9

    if-eqz v9, :cond_3

    sget v9, La/a/j;->AppCompatTextHelper_android_drawableBottom:I

    invoke-virtual {v4, v9, v5}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v9

    invoke-static {v2, v3, v9}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/j;I)Landroidx/appcompat/widget/u0;

    move-result-object v9

    iput-object v9, v7, Landroidx/appcompat/widget/y;->e:Landroidx/appcompat/widget/u0;

    :cond_3
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x11

    if-lt v9, v10, :cond_5

    sget v9, La/a/j;->AppCompatTextHelper_android_drawableStart:I

    invoke-virtual {v4, v9}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v9

    if-eqz v9, :cond_4

    sget v9, La/a/j;->AppCompatTextHelper_android_drawableStart:I

    invoke-virtual {v4, v9, v5}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v9

    invoke-static {v2, v3, v9}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/j;I)Landroidx/appcompat/widget/u0;

    move-result-object v9

    iput-object v9, v7, Landroidx/appcompat/widget/y;->f:Landroidx/appcompat/widget/u0;

    :cond_4
    sget v9, La/a/j;->AppCompatTextHelper_android_drawableEnd:I

    invoke-virtual {v4, v9}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v9

    if-eqz v9, :cond_5

    sget v9, La/a/j;->AppCompatTextHelper_android_drawableEnd:I

    invoke-virtual {v4, v9, v5}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v9

    invoke-static {v2, v3, v9}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/j;I)Landroidx/appcompat/widget/u0;

    move-result-object v9

    iput-object v9, v7, Landroidx/appcompat/widget/y;->g:Landroidx/appcompat/widget/u0;

    :cond_5
    invoke-virtual {v4}, Landroidx/appcompat/widget/w0;->a()V

    iget-object v4, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v4

    instance-of v4, v4, Landroid/text/method/PasswordTransformationMethod;

    const/16 v9, 0x1a

    const/16 v11, 0x17

    if-eq v6, v8, :cond_d

    sget-object v13, La/a/j;->TextAppearance:[I

    invoke-static {v2, v6, v13}, Landroidx/appcompat/widget/w0;->a(Landroid/content/Context;I[I)Landroidx/appcompat/widget/w0;

    move-result-object v6

    if-nez v4, :cond_6

    sget v13, La/a/j;->TextAppearance_textAllCaps:I

    invoke-virtual {v6, v13}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v13

    if-eqz v13, :cond_6

    sget v13, La/a/j;->TextAppearance_textAllCaps:I

    invoke-virtual {v6, v13, v5}, Landroidx/appcompat/widget/w0;->a(IZ)Z

    move-result v13

    const/4 v14, 0x1

    goto :goto_0

    :cond_6
    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    invoke-direct {v7, v2, v6}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/w0;)V

    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v15, v11, :cond_a

    sget v15, La/a/j;->TextAppearance_android_textColor:I

    invoke-virtual {v6, v15}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v15

    if-eqz v15, :cond_7

    sget v15, La/a/j;->TextAppearance_android_textColor:I

    invoke-virtual {v6, v15}, Landroidx/appcompat/widget/w0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v15

    goto :goto_1

    :cond_7
    const/4 v15, 0x0

    :goto_1
    sget v10, La/a/j;->TextAppearance_android_textColorHint:I

    invoke-virtual {v6, v10}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v10

    if-eqz v10, :cond_8

    sget v10, La/a/j;->TextAppearance_android_textColorHint:I

    invoke-virtual {v6, v10}, Landroidx/appcompat/widget/w0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v10

    goto :goto_2

    :cond_8
    const/4 v10, 0x0

    :goto_2
    sget v12, La/a/j;->TextAppearance_android_textColorLink:I

    invoke-virtual {v6, v12}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v12

    if-eqz v12, :cond_9

    sget v12, La/a/j;->TextAppearance_android_textColorLink:I

    invoke-virtual {v6, v12}, Landroidx/appcompat/widget/w0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v12

    goto :goto_3

    :cond_9
    const/4 v12, 0x0

    goto :goto_3

    :cond_a
    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_3
    sget v8, La/a/j;->TextAppearance_textLocale:I

    invoke-virtual {v6, v8}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v8

    if-eqz v8, :cond_b

    sget v8, La/a/j;->TextAppearance_textLocale:I

    invoke-virtual {v6, v8}, Landroidx/appcompat/widget/w0;->d(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    :cond_b
    const/4 v8, 0x0

    :goto_4
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v11, v9, :cond_c

    sget v11, La/a/j;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v6, v11}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v11

    if-eqz v11, :cond_c

    sget v11, La/a/j;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v6, v11}, Landroidx/appcompat/widget/w0;->d(I)Ljava/lang/String;

    move-result-object v11

    goto :goto_5

    :cond_c
    const/4 v11, 0x0

    :goto_5
    invoke-virtual {v6}, Landroidx/appcompat/widget/w0;->a()V

    goto :goto_6

    :cond_d
    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_6
    sget-object v6, La/a/j;->TextAppearance:[I

    invoke-static {v2, v0, v6, v1, v5}, Landroidx/appcompat/widget/w0;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/w0;

    move-result-object v6

    if-nez v4, :cond_e

    sget v9, La/a/j;->TextAppearance_textAllCaps:I

    invoke-virtual {v6, v9}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v9

    if-eqz v9, :cond_e

    sget v9, La/a/j;->TextAppearance_textAllCaps:I

    invoke-virtual {v6, v9, v5}, Landroidx/appcompat/widget/w0;->a(IZ)Z

    move-result v13

    const/4 v14, 0x1

    :cond_e
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-ge v9, v5, :cond_11

    sget v5, La/a/j;->TextAppearance_android_textColor:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v5

    if-eqz v5, :cond_f

    sget v5, La/a/j;->TextAppearance_android_textColor:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v15

    :cond_f
    sget v5, La/a/j;->TextAppearance_android_textColorHint:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v5

    if-eqz v5, :cond_10

    sget v5, La/a/j;->TextAppearance_android_textColorHint:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v10

    :cond_10
    sget v5, La/a/j;->TextAppearance_android_textColorLink:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v5

    if-eqz v5, :cond_11

    sget v5, La/a/j;->TextAppearance_android_textColorLink:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v12

    :cond_11
    sget v5, La/a/j;->TextAppearance_textLocale:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v5

    if-eqz v5, :cond_12

    sget v5, La/a/j;->TextAppearance_textLocale:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->d(I)Ljava/lang/String;

    move-result-object v8

    :cond_12
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1a

    if-lt v5, v9, :cond_13

    sget v5, La/a/j;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v5

    if-eqz v5, :cond_13

    sget v5, La/a/j;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->d(I)Ljava/lang/String;

    move-result-object v11

    :cond_13
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1c

    if-lt v5, v9, :cond_14

    sget v5, La/a/j;->TextAppearance_android_textSize:I

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v5

    if-eqz v5, :cond_14

    sget v5, La/a/j;->TextAppearance_android_textSize:I

    const/4 v9, -0x1

    invoke-virtual {v6, v5, v9}, Landroidx/appcompat/widget/w0;->c(II)I

    move-result v5

    if-nez v5, :cond_14

    iget-object v5, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    const/4 v9, 0x0

    move-object/from16 v16, v3

    const/4 v3, 0x0

    invoke-virtual {v5, v3, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_7

    :cond_14
    move-object/from16 v16, v3

    :goto_7
    invoke-direct {v7, v2, v6}, Landroidx/appcompat/widget/y;->a(Landroid/content/Context;Landroidx/appcompat/widget/w0;)V

    invoke-virtual {v6}, Landroidx/appcompat/widget/w0;->a()V

    if-eqz v15, :cond_15

    iget-object v3, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v15}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_15
    if-eqz v10, :cond_16

    iget-object v3, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_16
    if-eqz v12, :cond_17

    iget-object v3, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    :cond_17
    if-nez v4, :cond_18

    if-eqz v14, :cond_18

    invoke-virtual {v7, v13}, Landroidx/appcompat/widget/y;->a(Z)V

    :cond_18
    iget-object v3, v7, Landroidx/appcompat/widget/y;->l:Landroid/graphics/Typeface;

    if-eqz v3, :cond_1a

    iget v4, v7, Landroidx/appcompat/widget/y;->k:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_19

    iget-object v4, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    iget v5, v7, Landroidx/appcompat/widget/y;->j:I

    invoke-virtual {v4, v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_8

    :cond_19
    iget-object v4, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1a
    :goto_8
    if-eqz v11, :cond_1b

    iget-object v3, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    :cond_1b
    if-eqz v8, :cond_1d

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v3, v4, :cond_1c

    iget-object v3, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-static {v8}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextLocales(Landroid/os/LocaleList;)V

    goto :goto_9

    :cond_1c
    const/16 v4, 0x15

    if-lt v3, v4, :cond_1d

    const/16 v3, 0x2c

    invoke-virtual {v8, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v8, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-static {v3}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextLocale(Ljava/util/Locale;)V

    :cond_1d
    :goto_9
    iget-object v3, v7, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v3, v0, v1}, Landroidx/appcompat/widget/a0;->a(Landroid/util/AttributeSet;I)V

    sget-boolean v1, Landroidx/core/widget/b;->a:Z

    if-eqz v1, :cond_1f

    iget-object v1, v7, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v1}, Landroidx/appcompat/widget/a0;->f()I

    move-result v1

    if-eqz v1, :cond_1f

    iget-object v1, v7, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v1}, Landroidx/appcompat/widget/a0;->e()[I

    move-result-object v1

    array-length v3, v1

    if-lez v3, :cond_1f

    iget-object v3, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_1e

    iget-object v1, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    iget-object v3, v7, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v3}, Landroidx/appcompat/widget/a0;->c()I

    move-result v3

    iget-object v4, v7, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v4}, Landroidx/appcompat/widget/a0;->b()I

    move-result v4

    iget-object v5, v7, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v5}, Landroidx/appcompat/widget/a0;->d()I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_a

    :cond_1e
    const/4 v6, 0x0

    iget-object v3, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v1, v6}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    :cond_1f
    :goto_a
    sget-object v1, La/a/j;->AppCompatTextView:[I

    invoke-static {v2, v0, v1}, Landroidx/appcompat/widget/w0;->a(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/widget/w0;

    move-result-object v8

    sget v0, La/a/j;->AppCompatTextView_drawableLeftCompat:I

    const/4 v1, -0x1

    invoke-virtual {v8, v0, v1}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v0

    move-object/from16 v3, v16

    if-eq v0, v1, :cond_20

    invoke-virtual {v3, v2, v0}, Landroidx/appcompat/widget/j;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v4, v0

    goto :goto_b

    :cond_20
    const/4 v4, 0x0

    :goto_b
    sget v0, La/a/j;->AppCompatTextView_drawableTopCompat:I

    invoke-virtual {v8, v0, v1}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v0

    if-eq v0, v1, :cond_21

    invoke-virtual {v3, v2, v0}, Landroidx/appcompat/widget/j;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    goto :goto_c

    :cond_21
    const/4 v5, 0x0

    :goto_c
    sget v0, La/a/j;->AppCompatTextView_drawableRightCompat:I

    invoke-virtual {v8, v0, v1}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v0

    if-eq v0, v1, :cond_22

    invoke-virtual {v3, v2, v0}, Landroidx/appcompat/widget/j;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v6, v0

    goto :goto_d

    :cond_22
    const/4 v6, 0x0

    :goto_d
    sget v0, La/a/j;->AppCompatTextView_drawableBottomCompat:I

    invoke-virtual {v8, v0, v1}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v0

    if-eq v0, v1, :cond_23

    invoke-virtual {v3, v2, v0}, Landroidx/appcompat/widget/j;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v9, v0

    goto :goto_e

    :cond_23
    const/4 v9, 0x0

    :goto_e
    sget v0, La/a/j;->AppCompatTextView_drawableStartCompat:I

    invoke-virtual {v8, v0, v1}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v0

    if-eq v0, v1, :cond_24

    invoke-virtual {v3, v2, v0}, Landroidx/appcompat/widget/j;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v10, v0

    goto :goto_f

    :cond_24
    const/4 v10, 0x0

    :goto_f
    sget v0, La/a/j;->AppCompatTextView_drawableEndCompat:I

    invoke-virtual {v8, v0, v1}, Landroidx/appcompat/widget/w0;->g(II)I

    move-result v0

    if-eq v0, v1, :cond_25

    invoke-virtual {v3, v2, v0}, Landroidx/appcompat/widget/j;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v11, v0

    goto :goto_10

    :cond_25
    const/4 v11, 0x0

    :goto_10
    move-object/from16 v0, p0

    move-object v1, v4

    move-object v2, v5

    move-object v3, v6

    move-object v4, v9

    move-object v5, v10

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/widget/y;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    sget v0, La/a/j;->AppCompatTextView_drawableTint:I

    invoke-virtual {v8, v0}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v0

    if-eqz v0, :cond_26

    sget v0, La/a/j;->AppCompatTextView_drawableTint:I

    invoke-virtual {v8, v0}, Landroidx/appcompat/widget/w0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iget-object v1, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-static {v1, v0}, Landroidx/core/widget/i;->a(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_26
    sget v0, La/a/j;->AppCompatTextView_drawableTintMode:I

    invoke-virtual {v8, v0}, Landroidx/appcompat/widget/w0;->g(I)Z

    move-result v0

    if-eqz v0, :cond_27

    sget v0, La/a/j;->AppCompatTextView_drawableTintMode:I

    const/4 v1, -0x1

    invoke-virtual {v8, v0, v1}, Landroidx/appcompat/widget/w0;->d(II)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/appcompat/widget/e0;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iget-object v2, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-static {v2, v0}, Landroidx/core/widget/i;->a(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_11

    :cond_27
    const/4 v1, -0x1

    :goto_11
    sget v0, La/a/j;->AppCompatTextView_firstBaselineToTopHeight:I

    invoke-virtual {v8, v0, v1}, Landroidx/appcompat/widget/w0;->c(II)I

    move-result v0

    sget v2, La/a/j;->AppCompatTextView_lastBaselineToBottomHeight:I

    invoke-virtual {v8, v2, v1}, Landroidx/appcompat/widget/w0;->c(II)I

    move-result v2

    sget v3, La/a/j;->AppCompatTextView_lineHeight:I

    invoke-virtual {v8, v3, v1}, Landroidx/appcompat/widget/w0;->c(II)I

    move-result v3

    invoke-virtual {v8}, Landroidx/appcompat/widget/w0;->a()V

    if-eq v0, v1, :cond_28

    iget-object v4, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-static {v4, v0}, Landroidx/core/widget/i;->a(Landroid/widget/TextView;I)V

    :cond_28
    if-eq v2, v1, :cond_29

    iget-object v0, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-static {v0, v2}, Landroidx/core/widget/i;->b(Landroid/widget/TextView;I)V

    :cond_29
    if-eq v3, v1, :cond_2a

    iget-object v0, v7, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-static {v0, v3}, Landroidx/core/widget/i;->c(Landroid/widget/TextView;I)V

    :cond_2a
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method a(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method a(ZIIII)V
    .locals 0

    sget-boolean p1, Landroidx/core/widget/b;->a:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/y;->b()V

    :cond_0
    return-void
.end method

.method a([II)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/a0;->a([II)V

    return-void
.end method

.method b()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0}, Landroidx/appcompat/widget/a0;->a()V

    return-void
.end method

.method c()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0}, Landroidx/appcompat/widget/a0;->b()I

    move-result v0

    return v0
.end method

.method d()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0}, Landroidx/appcompat/widget/a0;->c()I

    move-result v0

    return v0
.end method

.method e()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0}, Landroidx/appcompat/widget/a0;->d()I

    move-result v0

    return v0
.end method

.method f()[I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0}, Landroidx/appcompat/widget/a0;->e()[I

    move-result-object v0

    return-object v0
.end method

.method g()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0}, Landroidx/appcompat/widget/a0;->f()I

    move-result v0

    return v0
.end method

.method h()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/u0;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method i()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->h:Landroidx/appcompat/widget/u0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/u0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method j()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y;->i:Landroidx/appcompat/widget/a0;

    invoke-virtual {v0}, Landroidx/appcompat/widget/a0;->g()Z

    move-result v0

    return v0
.end method

.method k()V
    .locals 0

    invoke-virtual {p0}, Landroidx/appcompat/widget/y;->a()V

    return-void
.end method
