.class public Lb/c/b/b/p/b;
.super Landroid/widget/FrameLayout;
.source ""

# interfaces
.implements Lb/c/b/b/p/d;


# instance fields
.field private final b:Lb/c/b/b/p/c;


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    invoke-virtual {v0}, Lb/c/b/b/p/c;->b()V

    const/4 v0, 0x0

    throw v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    invoke-virtual {v0}, Lb/c/b/b/p/c;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lb/c/b/b/p/c;->a(Landroid/graphics/Canvas;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public getCircularRevealOverlayDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    invoke-virtual {v0}, Lb/c/b/b/p/c;->c()Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    throw v0
.end method

.method public getCircularRevealScrimColor()I
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    invoke-virtual {v0}, Lb/c/b/b/p/c;->d()I

    const/4 v0, 0x0

    throw v0
.end method

.method public getRevealInfo()Lb/c/b/b/p/d$e;
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    invoke-virtual {v0}, Lb/c/b/b/p/c;->e()Lb/c/b/b/p/d$e;

    const/4 v0, 0x0

    throw v0
.end method

.method public isOpaque()Z
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/FrameLayout;->isOpaque()Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb/c/b/b/p/c;->f()Z

    const/4 v0, 0x0

    throw v0
.end method

.method public setCircularRevealOverlayDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    invoke-virtual {v0, p1}, Lb/c/b/b/p/c;->a(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public setCircularRevealScrimColor(I)V
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    invoke-virtual {v0, p1}, Lb/c/b/b/p/c;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public setRevealInfo(Lb/c/b/b/p/d$e;)V
    .locals 1

    iget-object v0, p0, Lb/c/b/b/p/b;->b:Lb/c/b/b/p/c;

    invoke-virtual {v0, p1}, Lb/c/b/b/p/c;->a(Lb/c/b/b/p/d$e;)V

    const/4 p1, 0x0

    throw p1
.end method
