.class public Lb/b/a/b/a/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/b/a/b/a/c$b;,
        Lb/b/a/b/a/c$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lb/b/a/b/a/d;->e:Lb/b/a/b/a/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lb/b/a/b/a/d;->a(Landroid/content/Context;Lb/b/a/b/a/c$a;)V

    return-void
.end method

.method public static a(Lb/b/a/b/a/b;)V
    .locals 1

    invoke-static {}, Lb/b/a/b/a/f;->a()Lb/b/a/b/a/c$b;

    move-result-object v0

    invoke-static {p0, v0}, Lb/b/a/b/a/c;->a(Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;)V

    return-void
.end method

.method public static a(Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;)V
    .locals 1

    sget-object v0, Lb/b/a/b/a/d;->e:Lb/b/a/b/a/d;

    invoke-virtual {v0, p0, p1}, Lb/b/a/b/a/d;->a(Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;)V

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lb/b/a/b/a/d;->e:Lb/b/a/b/a/d;

    invoke-virtual {v0}, Lb/b/a/b/a/d;->b()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lb/b/a/b/a/d;->e:Lb/b/a/b/a/d;

    invoke-virtual {v0}, Lb/b/a/b/a/d;->c()Z

    move-result v0

    return v0
.end method
