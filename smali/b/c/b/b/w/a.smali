.class public final Lb/c/b/b/w/a;
.super Lb/c/b/b/w/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/b/b/w/a$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/graphics/Typeface;

.field private final b:Lb/c/b/b/w/a$a;

.field private c:Z


# direct methods
.method public constructor <init>(Lb/c/b/b/w/a$a;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Lb/c/b/b/w/f;-><init>()V

    iput-object p2, p0, Lb/c/b/b/w/a;->a:Landroid/graphics/Typeface;

    iput-object p1, p0, Lb/c/b/b/w/a;->b:Lb/c/b/b/w/a$a;

    return-void
.end method

.method private a(Landroid/graphics/Typeface;)V
    .locals 1

    iget-boolean v0, p0, Lb/c/b/b/w/a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/c/b/b/w/a;->b:Lb/c/b/b/w/a$a;

    invoke-interface {v0, p1}, Lb/c/b/b/w/a$a;->a(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/c/b/b/w/a;->c:Z

    return-void
.end method

.method public a(I)V
    .locals 0

    iget-object p1, p0, Lb/c/b/b/w/a;->a:Landroid/graphics/Typeface;

    invoke-direct {p0, p1}, Lb/c/b/b/w/a;->a(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public a(Landroid/graphics/Typeface;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lb/c/b/b/w/a;->a(Landroid/graphics/Typeface;)V

    return-void
.end method
