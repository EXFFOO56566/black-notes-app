.class public Landroidx/core/app/a;
.super La/g/d/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/a$a;
    }
.end annotation


# static fields
.field private static c:Landroidx/core/app/a$a;


# direct methods
.method public static a()Landroidx/core/app/a$a;
    .locals 1

    sget-object v0, Landroidx/core/app/a;->c:Landroidx/core/app/a$a;

    return-object v0
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    goto :goto_1

    :cond_0
    invoke-static {p0}, Landroidx/core/app/b;->a(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
