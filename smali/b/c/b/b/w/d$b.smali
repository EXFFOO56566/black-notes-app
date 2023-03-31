.class Lb/c/b/b/w/d$b;
.super Lb/c/b/b/w/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/c/b/b/w/d;->a(Landroid/content/Context;Landroid/text/TextPaint;Lb/c/b/b/w/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/text/TextPaint;

.field final synthetic b:Lb/c/b/b/w/f;

.field final synthetic c:Lb/c/b/b/w/d;


# direct methods
.method constructor <init>(Lb/c/b/b/w/d;Landroid/text/TextPaint;Lb/c/b/b/w/f;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/b/w/d$b;->c:Lb/c/b/b/w/d;

    iput-object p2, p0, Lb/c/b/b/w/d$b;->a:Landroid/text/TextPaint;

    iput-object p3, p0, Lb/c/b/b/w/d$b;->b:Lb/c/b/b/w/f;

    invoke-direct {p0}, Lb/c/b/b/w/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lb/c/b/b/w/d$b;->b:Lb/c/b/b/w/f;

    invoke-virtual {v0, p1}, Lb/c/b/b/w/f;->a(I)V

    return-void
.end method

.method public a(Landroid/graphics/Typeface;Z)V
    .locals 2

    iget-object v0, p0, Lb/c/b/b/w/d$b;->c:Lb/c/b/b/w/d;

    iget-object v1, p0, Lb/c/b/b/w/d$b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, p1}, Lb/c/b/b/w/d;->a(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lb/c/b/b/w/d$b;->b:Lb/c/b/b/w/f;

    invoke-virtual {v0, p1, p2}, Lb/c/b/b/w/f;->a(Landroid/graphics/Typeface;Z)V

    return-void
.end method
