.class public final Lb/c/b/a/e/b/g;
.super Lcom/google/android/gms/common/internal/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/h<",
        "Lb/c/b/a/e/b/i;",
        ">;"
    }
.end annotation


# instance fields
.field private final z:Lb/c/b/a/a/a/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/d;Lb/c/b/a/a/a/a$a;Lcom/google/android/gms/common/api/f$a;Lcom/google/android/gms/common/api/f$b;)V
    .locals 7

    const/16 v3, 0x44

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/d;Lcom/google/android/gms/common/api/f$a;Lcom/google/android/gms/common/api/f$b;)V

    new-instance p1, Lb/c/b/a/a/a/a$a$a;

    if-nez p4, :cond_0

    sget-object p4, Lb/c/b/a/a/a/a$a;->e:Lb/c/b/a/a/a/a$a;

    :cond_0
    invoke-direct {p1, p4}, Lb/c/b/a/a/a/a$a$a;-><init>(Lb/c/b/a/a/a/a$a;)V

    invoke-static {}, Lb/c/b/a/e/b/a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lb/c/b/a/a/a/a$a$a;->a(Ljava/lang/String;)Lb/c/b/a/a/a/a$a$a;

    invoke-virtual {p1}, Lb/c/b/a/a/a/a$a$a;->a()Lb/c/b/a/a/a/a$a;

    move-result-object p1

    iput-object p1, p0, Lb/c/b/a/e/b/g;->z:Lb/c/b/a/a/a/a$a;

    return-void
.end method


# virtual methods
.method protected final synthetic a(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lb/c/b/a/e/b/i;

    if-eqz v1, :cond_1

    check-cast v0, Lb/c/b/a/e/b/i;

    return-object v0

    :cond_1
    new-instance v0, Lb/c/b/a/e/b/h;

    invoke-direct {v0, p1}, Lb/c/b/a/e/b/h;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method public final e()I
    .locals 1

    const v0, 0xc35000

    return v0
.end method

.method protected final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method

.method protected final t()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lb/c/b/a/e/b/g;->z:Lb/c/b/a/a/a/a$a;

    invoke-virtual {v0}, Lb/c/b/a/a/a/a$a;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
