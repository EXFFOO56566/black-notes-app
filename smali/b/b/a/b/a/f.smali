.class public Lb/b/a/b/a/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lb/b/a/b/a/c$b;
    .locals 1

    const/4 v0, 0x5

    invoke-static {v0}, Lb/b/a/b/a/f;->a(I)Lb/b/a/b/a/c$b;

    move-result-object v0

    return-object v0
.end method

.method public static a(I)Lb/b/a/b/a/c$b;
    .locals 1

    new-instance v0, Lb/b/a/b/a/f$a;

    invoke-direct {v0, p0}, Lb/b/a/b/a/f$a;-><init>(I)V

    return-object v0
.end method
